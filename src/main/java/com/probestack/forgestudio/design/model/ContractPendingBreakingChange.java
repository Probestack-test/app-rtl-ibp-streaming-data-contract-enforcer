package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Present if status &#x3D; PENDING_CONSUMER_APPROVAL.
 */
@Schema(name = "Contract_pendingBreakingChange", description = "Present if status = PENDING_CONSUMER_APPROVAL.")
@JsonTypeName("Contract_pendingBreakingChange")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-06T13:30:58.296556692Z[GMT]")public class ContractPendingBreakingChange {

  private Integer proposedSchemaVersion;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime proposedAt;

  @Valid
  private List<String> breakingChanges;

  @Valid
  private List<String> approvedBy;

  @Valid
  private List<String> awaitingApproval;

  public ContractPendingBreakingChange proposedSchemaVersion(Integer proposedSchemaVersion) {
    this.proposedSchemaVersion = proposedSchemaVersion;
    return this;
  }

  /**
   * Get proposedSchemaVersion
   * @return proposedSchemaVersion
  */
    @Schema(name = "proposedSchemaVersion", example = "4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proposedSchemaVersion")
  public Integer getProposedSchemaVersion() {
    return proposedSchemaVersion;
  }

  public void setProposedSchemaVersion(Integer proposedSchemaVersion) {
    this.proposedSchemaVersion = proposedSchemaVersion;
  }

  public ContractPendingBreakingChange proposedAt(OffsetDateTime proposedAt) {
    this.proposedAt = proposedAt;
    return this;
  }

  /**
   * Get proposedAt
   * @return proposedAt
  */
  @Valid   @Schema(name = "proposedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proposedAt")
  public OffsetDateTime getProposedAt() {
    return proposedAt;
  }

  public void setProposedAt(OffsetDateTime proposedAt) {
    this.proposedAt = proposedAt;
  }

  public ContractPendingBreakingChange breakingChanges(List<String> breakingChanges) {
    this.breakingChanges = breakingChanges;
    return this;
  }

  public ContractPendingBreakingChange addBreakingChangesItem(String breakingChangesItem) {
    if (this.breakingChanges == null) {
      this.breakingChanges = new ArrayList<>();
    }
    this.breakingChanges.add(breakingChangesItem);
    return this;
  }

  /**
   * Get breakingChanges
   * @return breakingChanges
  */
    @Schema(name = "breakingChanges", example = "[\"Removing field 'discount_code'\",\"Changing type of 'amount' from double to float\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("breakingChanges")
  public List<String> getBreakingChanges() {
    return breakingChanges;
  }

  public void setBreakingChanges(List<String> breakingChanges) {
    this.breakingChanges = breakingChanges;
  }

  public ContractPendingBreakingChange approvedBy(List<String> approvedBy) {
    this.approvedBy = approvedBy;
    return this;
  }

  public ContractPendingBreakingChange addApprovedByItem(String approvedByItem) {
    if (this.approvedBy == null) {
      this.approvedBy = new ArrayList<>();
    }
    this.approvedBy.add(approvedByItem);
    return this;
  }

  /**
   * Get approvedBy
   * @return approvedBy
  */
    @Schema(name = "approvedBy", example = "[\"analytics-team\",\"risk-team\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvedBy")
  public List<String> getApprovedBy() {
    return approvedBy;
  }

  public void setApprovedBy(List<String> approvedBy) {
    this.approvedBy = approvedBy;
  }

  public ContractPendingBreakingChange awaitingApproval(List<String> awaitingApproval) {
    this.awaitingApproval = awaitingApproval;
    return this;
  }

  public ContractPendingBreakingChange addAwaitingApprovalItem(String awaitingApprovalItem) {
    if (this.awaitingApproval == null) {
      this.awaitingApproval = new ArrayList<>();
    }
    this.awaitingApproval.add(awaitingApprovalItem);
    return this;
  }

  /**
   * Get awaitingApproval
   * @return awaitingApproval
  */
    @Schema(name = "awaitingApproval", example = "[\"customer-dashboard-team\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("awaitingApproval")
  public List<String> getAwaitingApproval() {
    return awaitingApproval;
  }

  public void setAwaitingApproval(List<String> awaitingApproval) {
    this.awaitingApproval = awaitingApproval;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractPendingBreakingChange contractPendingBreakingChange = (ContractPendingBreakingChange) o;
    return Objects.equals(this.proposedSchemaVersion, contractPendingBreakingChange.proposedSchemaVersion) &&
        Objects.equals(this.proposedAt, contractPendingBreakingChange.proposedAt) &&
        Objects.equals(this.breakingChanges, contractPendingBreakingChange.breakingChanges) &&
        Objects.equals(this.approvedBy, contractPendingBreakingChange.approvedBy) &&
        Objects.equals(this.awaitingApproval, contractPendingBreakingChange.awaitingApproval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proposedSchemaVersion, proposedAt, breakingChanges, approvedBy, awaitingApproval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractPendingBreakingChange {\n");
    sb.append("    proposedSchemaVersion: ").append(toIndentedString(proposedSchemaVersion)).append("\n");
    sb.append("    proposedAt: ").append(toIndentedString(proposedAt)).append("\n");
    sb.append("    breakingChanges: ").append(toIndentedString(breakingChanges)).append("\n");
    sb.append("    approvedBy: ").append(toIndentedString(approvedBy)).append("\n");
    sb.append("    awaitingApproval: ").append(toIndentedString(awaitingApproval)).append("\n");
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

