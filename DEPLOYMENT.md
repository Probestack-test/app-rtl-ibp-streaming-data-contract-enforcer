# GKE Deployment

This generated service includes GitHub Actions CI/CD that deploys to GKE through
ForgeCrux's shared `microservices-v1.yaml` reusable workflow (Helm or Kustomize, with
ArgoCD GitOps sync).

## Generated Values

| Setting | Value |
| --- | --- |
| Service name | `streaming-data-contract-enforcer` |
| Default namespace | `streaming-data-contract-enforcer-dev` |
| Default cluster | `probestack-zonal-cluster` |
| Default deploy strategy | `helm` |
| Dockerfile path | `./Dockerfile` |
| Helm chart path | `./charts` |
| Replica count | `2` |
| Health check | `/actuator/health` (timeout `120`s) |

The namespace, cluster, and deploy strategy above are only the fallback defaults used
when a manual `workflow_dispatch` run doesn't override them. Everything else the deploy
needs (GCP project, Artifact Registry, service account) is resolved server-side from the
repository's `CICD_PROFILE_ID` secret — nothing GCP-specific is generated into this
repository.

## Required Setup

Before the workflow can deploy, confirm:

1. A Helm chart (or Kustomize overlay) exists at the path above — **this generator does
   not scaffold one yet**; add `./charts/Chart.yaml` and its templates, or
   switch `deploy_strategy` to `kustomize` and provide `./k8s/overlays` instead.
2. The repository's GitHub secrets (`CICD_PROFILE_ID`, `PROB_SERVICE_TOKEN_*`, `GH_TOKEN`,
   `APP_ID`, `APP_PRIVATE_KEY`, and — if ArgoCD GitOps sync is used — `ARGOCD_USERNAME`/
   `ARGOCD_PASSWORD`) are configured.
3. A CI/CD profile exists for this service in `fsp-cicd-automation-svc`, matching
   `CICD_PROFILE_ID`, with the target GKE cluster/namespace/Artifact Registry details.

## Local Docker Build

```bash
docker build -t streaming-data-contract-enforcer:local .
docker run --rm -p 8080:8080 streaming-data-contract-enforcer:local
```

## GitHub Actions

The workflow at `.github/workflows/ci-cd.yml` runs on every push to `main` and to this
service's own feature/release branches, and can also be triggered manually
(`workflow_dispatch`) with overrides for deploy strategy, image version, namespace, or
cluster.
