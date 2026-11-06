package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ViolationListSummary
 */
@JsonTypeName("ViolationList_summary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-06T13:30:58.296556692Z[GMT]")public class ViolationListSummary {

  private Integer totalViolations;

  private Integer open;

  private Integer acknowledged;

  private Integer resolved24h;

  private Integer criticalCount;

  private Integer errorCount;

  private Integer warningCount;

  @Valid
  private List<String> topProducers;

  public ViolationListSummary totalViolations(Integer totalViolations) {
    this.totalViolations = totalViolations;
    return this;
  }

  /**
   * Get totalViolations
   * @return totalViolations
  */
    @Schema(name = "totalViolations", example = "1543", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalViolations")
  public Integer getTotalViolations() {
    return totalViolations;
  }

  public void setTotalViolations(Integer totalViolations) {
    this.totalViolations = totalViolations;
  }

  public ViolationListSummary open(Integer open) {
    this.open = open;
    return this;
  }

  /**
   * Get open
   * @return open
  */
    @Schema(name = "open", example = "342", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("open")
  public Integer getOpen() {
    return open;
  }

  public void setOpen(Integer open) {
    this.open = open;
  }

  public ViolationListSummary acknowledged(Integer acknowledged) {
    this.acknowledged = acknowledged;
    return this;
  }

  /**
   * Get acknowledged
   * @return acknowledged
  */
    @Schema(name = "acknowledged", example = "87", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acknowledged")
  public Integer getAcknowledged() {
    return acknowledged;
  }

  public void setAcknowledged(Integer acknowledged) {
    this.acknowledged = acknowledged;
  }

  public ViolationListSummary resolved24h(Integer resolved24h) {
    this.resolved24h = resolved24h;
    return this;
  }

  /**
   * Get resolved24h
   * @return resolved24h
  */
    @Schema(name = "resolved24h", example = "156", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolved24h")
  public Integer getResolved24h() {
    return resolved24h;
  }

  public void setResolved24h(Integer resolved24h) {
    this.resolved24h = resolved24h;
  }

  public ViolationListSummary criticalCount(Integer criticalCount) {
    this.criticalCount = criticalCount;
    return this;
  }

  /**
   * Get criticalCount
   * @return criticalCount
  */
    @Schema(name = "criticalCount", example = "12", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("criticalCount")
  public Integer getCriticalCount() {
    return criticalCount;
  }

  public void setCriticalCount(Integer criticalCount) {
    this.criticalCount = criticalCount;
  }

  public ViolationListSummary errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }

  /**
   * Get errorCount
   * @return errorCount
  */
    @Schema(name = "errorCount", example = "342", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCount")
  public Integer getErrorCount() {
    return errorCount;
  }

  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }

  public ViolationListSummary warningCount(Integer warningCount) {
    this.warningCount = warningCount;
    return this;
  }

  /**
   * Get warningCount
   * @return warningCount
  */
    @Schema(name = "warningCount", example = "1189", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warningCount")
  public Integer getWarningCount() {
    return warningCount;
  }

  public void setWarningCount(Integer warningCount) {
    this.warningCount = warningCount;
  }

  public ViolationListSummary topProducers(List<String> topProducers) {
    this.topProducers = topProducers;
    return this;
  }

  public ViolationListSummary addTopProducersItem(String topProducersItem) {
    if (this.topProducers == null) {
      this.topProducers = new ArrayList<>();
    }
    this.topProducers.add(topProducersItem);
    return this;
  }

  /**
   * Get topProducers
   * @return topProducers
  */
    @Schema(name = "topProducers", example = "[\"payment-processor-legacy\",\"checkout-service-v1\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topProducers")
  public List<String> getTopProducers() {
    return topProducers;
  }

  public void setTopProducers(List<String> topProducers) {
    this.topProducers = topProducers;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViolationListSummary violationListSummary = (ViolationListSummary) o;
    return Objects.equals(this.totalViolations, violationListSummary.totalViolations) &&
        Objects.equals(this.open, violationListSummary.open) &&
        Objects.equals(this.acknowledged, violationListSummary.acknowledged) &&
        Objects.equals(this.resolved24h, violationListSummary.resolved24h) &&
        Objects.equals(this.criticalCount, violationListSummary.criticalCount) &&
        Objects.equals(this.errorCount, violationListSummary.errorCount) &&
        Objects.equals(this.warningCount, violationListSummary.warningCount) &&
        Objects.equals(this.topProducers, violationListSummary.topProducers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalViolations, open, acknowledged, resolved24h, criticalCount, errorCount, warningCount, topProducers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViolationListSummary {\n");
    sb.append("    totalViolations: ").append(toIndentedString(totalViolations)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    acknowledged: ").append(toIndentedString(acknowledged)).append("\n");
    sb.append("    resolved24h: ").append(toIndentedString(resolved24h)).append("\n");
    sb.append("    criticalCount: ").append(toIndentedString(criticalCount)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    warningCount: ").append(toIndentedString(warningCount)).append("\n");
    sb.append("    topProducers: ").append(toIndentedString(topProducers)).append("\n");
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

