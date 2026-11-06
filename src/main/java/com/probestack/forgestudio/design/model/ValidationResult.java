package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.ValidationResultErrorsInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ValidationResult
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-06T13:30:58.296556692Z[GMT]")public class ValidationResult {

  private UUID validationId;

  private UUID contractId;

  private Boolean valid;

  /**
   * Gets or Sets verdict
   */
  public enum VerdictEnum {
    VALID("VALID"),
    
    INVALID("INVALID"),
    
    COMPATIBILITY_VIOLATION("COMPATIBILITY_VIOLATION"),
    
    WARNING("WARNING");

    private String value;

    VerdictEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VerdictEnum fromValue(String value) {
      for (VerdictEnum b : VerdictEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private VerdictEnum verdict;

  private Integer validatedSchemaVersion;

  @Valid
  private List<@Valid ValidationResultErrorsInner> errors;

  @Valid
  private List<String> warnings;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime evaluatedAt;

  private Integer latencyMs;

  private String auditReference;

  public ValidationResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ValidationResult(UUID validationId, UUID contractId, Boolean valid, OffsetDateTime evaluatedAt, Integer latencyMs) {
    this.validationId = validationId;
    this.contractId = contractId;
    this.valid = valid;
    this.evaluatedAt = evaluatedAt;
    this.latencyMs = latencyMs;
  }

  public ValidationResult validationId(UUID validationId) {
    this.validationId = validationId;
    return this;
  }

  /**
   * Get validationId
   * @return validationId
  */
  @NotNull @Valid   @Schema(name = "validationId", example = "b1a2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("validationId")
  public UUID getValidationId() {
    return validationId;
  }

  public void setValidationId(UUID validationId) {
    this.validationId = validationId;
  }

  public ValidationResult contractId(UUID contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Get contractId
   * @return contractId
  */
  @NotNull @Valid   @Schema(name = "contractId", example = "9c8f1a3b-6d7e-4a12-8f5e-123456789abc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contractId")
  public UUID getContractId() {
    return contractId;
  }

  public void setContractId(UUID contractId) {
    this.contractId = contractId;
  }

  public ValidationResult valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
  */
  @NotNull   @Schema(name = "valid", example = "false", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public ValidationResult verdict(VerdictEnum verdict) {
    this.verdict = verdict;
    return this;
  }

  /**
   * Get verdict
   * @return verdict
  */
    @Schema(name = "verdict", example = "INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verdict")
  public VerdictEnum getVerdict() {
    return verdict;
  }

  public void setVerdict(VerdictEnum verdict) {
    this.verdict = verdict;
  }

  public ValidationResult validatedSchemaVersion(Integer validatedSchemaVersion) {
    this.validatedSchemaVersion = validatedSchemaVersion;
    return this;
  }

  /**
   * Get validatedSchemaVersion
   * @return validatedSchemaVersion
  */
    @Schema(name = "validatedSchemaVersion", example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validatedSchemaVersion")
  public Integer getValidatedSchemaVersion() {
    return validatedSchemaVersion;
  }

  public void setValidatedSchemaVersion(Integer validatedSchemaVersion) {
    this.validatedSchemaVersion = validatedSchemaVersion;
  }

  public ValidationResult errors(List<@Valid ValidationResultErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  public ValidationResult addErrorsItem(ValidationResultErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Specific validation errors (empty if valid).
   * @return errors
  */
  @Valid   @Schema(name = "errors", description = "Specific validation errors (empty if valid).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid ValidationResultErrorsInner> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ValidationResultErrorsInner> errors) {
    this.errors = errors;
  }

  public ValidationResult warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ValidationResult addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Non-blocking warnings (schema drift, deprecated fields).
   * @return warnings
  */
    @Schema(name = "warnings", example = "[\"Field 'discount_code' is deprecated and will be removed in v4.\"]", description = "Non-blocking warnings (schema drift, deprecated fields).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warnings")
  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }

  public ValidationResult evaluatedAt(OffsetDateTime evaluatedAt) {
    this.evaluatedAt = evaluatedAt;
    return this;
  }

  /**
   * Get evaluatedAt
   * @return evaluatedAt
  */
  @NotNull @Valid   @Schema(name = "evaluatedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("evaluatedAt")
  public OffsetDateTime getEvaluatedAt() {
    return evaluatedAt;
  }

  public void setEvaluatedAt(OffsetDateTime evaluatedAt) {
    this.evaluatedAt = evaluatedAt;
  }

  public ValidationResult latencyMs(Integer latencyMs) {
    this.latencyMs = latencyMs;
    return this;
  }

  /**
   * Server-side evaluation time (excludes network).
   * @return latencyMs
  */
  @NotNull   @Schema(name = "latencyMs", example = "3", description = "Server-side evaluation time (excludes network).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("latencyMs")
  public Integer getLatencyMs() {
    return latencyMs;
  }

  public void setLatencyMs(Integer latencyMs) {
    this.latencyMs = latencyMs;
  }

  public ValidationResult auditReference(String auditReference) {
    this.auditReference = auditReference;
    return this;
  }

  /**
   * Get auditReference
   * @return auditReference
  */
    @Schema(name = "auditReference", example = "audit://data-contract/validation-b1a2c3d4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditReference")
  public String getAuditReference() {
    return auditReference;
  }

  public void setAuditReference(String auditReference) {
    this.auditReference = auditReference;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationResult validationResult = (ValidationResult) o;
    return Objects.equals(this.validationId, validationResult.validationId) &&
        Objects.equals(this.contractId, validationResult.contractId) &&
        Objects.equals(this.valid, validationResult.valid) &&
        Objects.equals(this.verdict, validationResult.verdict) &&
        Objects.equals(this.validatedSchemaVersion, validationResult.validatedSchemaVersion) &&
        Objects.equals(this.errors, validationResult.errors) &&
        Objects.equals(this.warnings, validationResult.warnings) &&
        Objects.equals(this.evaluatedAt, validationResult.evaluatedAt) &&
        Objects.equals(this.latencyMs, validationResult.latencyMs) &&
        Objects.equals(this.auditReference, validationResult.auditReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationId, contractId, valid, verdict, validatedSchemaVersion, errors, warnings, evaluatedAt, latencyMs, auditReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationResult {\n");
    sb.append("    validationId: ").append(toIndentedString(validationId)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    verdict: ").append(toIndentedString(verdict)).append("\n");
    sb.append("    validatedSchemaVersion: ").append(toIndentedString(validatedSchemaVersion)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    evaluatedAt: ").append(toIndentedString(evaluatedAt)).append("\n");
    sb.append("    latencyMs: ").append(toIndentedString(latencyMs)).append("\n");
    sb.append("    auditReference: ").append(toIndentedString(auditReference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

