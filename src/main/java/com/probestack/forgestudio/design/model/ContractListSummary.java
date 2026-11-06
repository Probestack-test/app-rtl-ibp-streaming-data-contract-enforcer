package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ContractListSummary
 */
@JsonTypeName("ContractList_summary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-06T13:30:58.296556692Z[GMT]")public class ContractListSummary {

  private Integer totalContracts;

  private Integer active;

  private Integer pendingConsumerApproval;

  private Integer contractsWithViolations24h;

  private Integer totalViolations24h;

  private String topViolatingContract;

  public ContractListSummary totalContracts(Integer totalContracts) {
    this.totalContracts = totalContracts;
    return this;
  }

  /**
   * Get totalContracts
   * @return totalContracts
  */
    @Schema(name = "totalContracts", example = "247", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalContracts")
  public Integer getTotalContracts() {
    return totalContracts;
  }

  public void setTotalContracts(Integer totalContracts) {
    this.totalContracts = totalContracts;
  }

  public ContractListSummary active(Integer active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  */
    @Schema(name = "active", example = "232", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public Integer getActive() {
    return active;
  }

  public void setActive(Integer active) {
    this.active = active;
  }

  public ContractListSummary pendingConsumerApproval(Integer pendingConsumerApproval) {
    this.pendingConsumerApproval = pendingConsumerApproval;
    return this;
  }

  /**
   * Get pendingConsumerApproval
   * @return pendingConsumerApproval
  */
    @Schema(name = "pendingConsumerApproval", example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pendingConsumerApproval")
  public Integer getPendingConsumerApproval() {
    return pendingConsumerApproval;
  }

  public void setPendingConsumerApproval(Integer pendingConsumerApproval) {
    this.pendingConsumerApproval = pendingConsumerApproval;
  }

  public ContractListSummary contractsWithViolations24h(Integer contractsWithViolations24h) {
    this.contractsWithViolations24h = contractsWithViolations24h;
    return this;
  }

  /**
   * Get contractsWithViolations24h
   * @return contractsWithViolations24h
  */
    @Schema(name = "contractsWithViolations24h", example = "12", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contractsWithViolations24h")
  public Integer getContractsWithViolations24h() {
    return contractsWithViolations24h;
  }

  public void setContractsWithViolations24h(Integer contractsWithViolations24h) {
    this.contractsWithViolations24h = contractsWithViolations24h;
  }

  public ContractListSummary totalViolations24h(Integer totalViolations24h) {
    this.totalViolations24h = totalViolations24h;
    return this;
  }

  /**
   * Get totalViolations24h
   * @return totalViolations24h
  */
    @Schema(name = "totalViolations24h", example = "1543", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalViolations24h")
  public Integer getTotalViolations24h() {
    return totalViolations24h;
  }

  public void setTotalViolations24h(Integer totalViolations24h) {
    this.totalViolations24h = totalViolations24h;
  }

  public ContractListSummary topViolatingContract(String topViolatingContract) {
    this.topViolatingContract = topViolatingContract;
    return this;
  }

  /**
   * Get topViolatingContract
   * @return topViolatingContract
  */
    @Schema(name = "topViolatingContract", example = "payments.transactions.v1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topViolatingContract")
  public String getTopViolatingContract() {
    return topViolatingContract;
  }

  public void setTopViolatingContract(String topViolatingContract) {
    this.topViolatingContract = topViolatingContract;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractListSummary contractListSummary = (ContractListSummary) o;
    return Objects.equals(this.totalContracts, contractListSummary.totalContracts) &&
        Objects.equals(this.active, contractListSummary.active) &&
        Objects.equals(this.pendingConsumerApproval, contractListSummary.pendingConsumerApproval) &&
        Objects.equals(this.contractsWithViolations24h, contractListSummary.contractsWithViolations24h) &&
        Objects.equals(this.totalViolations24h, contractListSummary.totalViolations24h) &&
        Objects.equals(this.topViolatingContract, contractListSummary.topViolatingContract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalContracts, active, pendingConsumerApproval, contractsWithViolations24h, totalViolations24h, topViolatingContract);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractListSummary {\n");
    sb.append("    totalContracts: ").append(toIndentedString(totalContracts)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    pendingConsumerApproval: ").append(toIndentedString(pendingConsumerApproval)).append("\n");
    sb.append("    contractsWithViolations24h: ").append(toIndentedString(contractsWithViolations24h)).append("\n");
    sb.append("    totalViolations24h: ").append(toIndentedString(totalViolations24h)).append("\n");
    sb.append("    topViolatingContract: ").append(toIndentedString(topViolatingContract)).append("\n");
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

