package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ContractViolationStats
 */
@JsonTypeName("Contract_violationStats")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-06T13:30:58.296556692Z[GMT]")public class ContractViolationStats {

  private Integer last24h;

  private Integer last7d;

  private Integer last30d;

  /**
   * Gets or Sets topViolationType
   */
  public enum TopViolationTypeEnum {
    SCHEMA_MISMATCH("SCHEMA_MISMATCH"),
    
    MISSING_FIELD("MISSING_FIELD"),
    
    EXTRA_FIELD("EXTRA_FIELD"),
    
    TYPE_MISMATCH("TYPE_MISMATCH"),
    
    NULL_VIOLATION("NULL_VIOLATION"),
    
    COMPATIBILITY_BREAK("COMPATIBILITY_BREAK"),
    
    ENUM_VIOLATION("ENUM_VIOLATION");

    private String value;

    TopViolationTypeEnum(String value) {
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
    public static TopViolationTypeEnum fromValue(String value) {
      for (TopViolationTypeEnum b : TopViolationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private TopViolationTypeEnum topViolationType;

  private String topProducerViolating;

  public ContractViolationStats last24h(Integer last24h) {
    this.last24h = last24h;
    return this;
  }

  /**
   * Get last24h
   * @return last24h
  */
    @Schema(name = "last24h", example = "47", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last24h")
  public Integer getLast24h() {
    return last24h;
  }

  public void setLast24h(Integer last24h) {
    this.last24h = last24h;
  }

  public ContractViolationStats last7d(Integer last7d) {
    this.last7d = last7d;
    return this;
  }

  /**
   * Get last7d
   * @return last7d
  */
    @Schema(name = "last7d", example = "312", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last7d")
  public Integer getLast7d() {
    return last7d;
  }

  public void setLast7d(Integer last7d) {
    this.last7d = last7d;
  }

  public ContractViolationStats last30d(Integer last30d) {
    this.last30d = last30d;
    return this;
  }

  /**
   * Get last30d
   * @return last30d
  */
    @Schema(name = "last30d", example = "1248", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last30d")
  public Integer getLast30d() {
    return last30d;
  }

  public void setLast30d(Integer last30d) {
    this.last30d = last30d;
  }

  public ContractViolationStats topViolationType(TopViolationTypeEnum topViolationType) {
    this.topViolationType = topViolationType;
    return this;
  }

  /**
   * Get topViolationType
   * @return topViolationType
  */
    @Schema(name = "topViolationType", example = "MISSING_FIELD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topViolationType")
  public TopViolationTypeEnum getTopViolationType() {
    return topViolationType;
  }

  public void setTopViolationType(TopViolationTypeEnum topViolationType) {
    this.topViolationType = topViolationType;
  }

  public ContractViolationStats topProducerViolating(String topProducerViolating) {
    this.topProducerViolating = topProducerViolating;
    return this;
  }

  /**
   * Get topProducerViolating
   * @return topProducerViolating
  */
    @Schema(name = "topProducerViolating", example = "payment-processor-legacy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topProducerViolating")
  public String getTopProducerViolating() {
    return topProducerViolating;
  }

  public void setTopProducerViolating(String topProducerViolating) {
    this.topProducerViolating = topProducerViolating;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractViolationStats contractViolationStats = (ContractViolationStats) o;
    return Objects.equals(this.last24h, contractViolationStats.last24h) &&
        Objects.equals(this.last7d, contractViolationStats.last7d) &&
        Objects.equals(this.last30d, contractViolationStats.last30d) &&
        Objects.equals(this.topViolationType, contractViolationStats.topViolationType) &&
        Objects.equals(this.topProducerViolating, contractViolationStats.topProducerViolating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(last24h, last7d, last30d, topViolationType, topProducerViolating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractViolationStats {\n");
    sb.append("    last24h: ").append(toIndentedString(last24h)).append("\n");
    sb.append("    last7d: ").append(toIndentedString(last7d)).append("\n");
    sb.append("    last30d: ").append(toIndentedString(last30d)).append("\n");
    sb.append("    topViolationType: ").append(toIndentedString(topViolationType)).append("\n");
    sb.append("    topProducerViolating: ").append(toIndentedString(topProducerViolating)).append("\n");
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

