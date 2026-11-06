package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ContractConsumerHealthInner
 */
@JsonTypeName("Contract_consumerHealth_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-06T13:30:58.296556692Z[GMT]")public class ContractConsumerHealthInner {

  private String consumerTeam;

  /**
   * Gets or Sets compatibilityStatus
   */
  public enum CompatibilityStatusEnum {
    COMPATIBLE("COMPATIBLE"),
    
    WARNING("WARNING"),
    
    INCOMPATIBLE("INCOMPATIBLE");

    private String value;

    CompatibilityStatusEnum(String value) {
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
    public static CompatibilityStatusEnum fromValue(String value) {
      for (CompatibilityStatusEnum b : CompatibilityStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private CompatibilityStatusEnum compatibilityStatus;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastValidatedAt;

  public ContractConsumerHealthInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContractConsumerHealthInner(String consumerTeam, CompatibilityStatusEnum compatibilityStatus) {
    this.consumerTeam = consumerTeam;
    this.compatibilityStatus = compatibilityStatus;
  }

  public ContractConsumerHealthInner consumerTeam(String consumerTeam) {
    this.consumerTeam = consumerTeam;
    return this;
  }

  /**
   * Get consumerTeam
   * @return consumerTeam
  */
  @NotNull   @Schema(name = "consumerTeam", example = "analytics-team", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("consumerTeam")
  public String getConsumerTeam() {
    return consumerTeam;
  }

  public void setConsumerTeam(String consumerTeam) {
    this.consumerTeam = consumerTeam;
  }

  public ContractConsumerHealthInner compatibilityStatus(CompatibilityStatusEnum compatibilityStatus) {
    this.compatibilityStatus = compatibilityStatus;
    return this;
  }

  /**
   * Get compatibilityStatus
   * @return compatibilityStatus
  */
  @NotNull   @Schema(name = "compatibilityStatus", example = "COMPATIBLE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("compatibilityStatus")
  public CompatibilityStatusEnum getCompatibilityStatus() {
    return compatibilityStatus;
  }

  public void setCompatibilityStatus(CompatibilityStatusEnum compatibilityStatus) {
    this.compatibilityStatus = compatibilityStatus;
  }

  public ContractConsumerHealthInner lastValidatedAt(OffsetDateTime lastValidatedAt) {
    this.lastValidatedAt = lastValidatedAt;
    return this;
  }

  /**
   * Get lastValidatedAt
   * @return lastValidatedAt
  */
  @Valid   @Schema(name = "lastValidatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastValidatedAt")
  public OffsetDateTime getLastValidatedAt() {
    return lastValidatedAt;
  }

  public void setLastValidatedAt(OffsetDateTime lastValidatedAt) {
    this.lastValidatedAt = lastValidatedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractConsumerHealthInner contractConsumerHealthInner = (ContractConsumerHealthInner) o;
    return Objects.equals(this.consumerTeam, contractConsumerHealthInner.consumerTeam) &&
        Objects.equals(this.compatibilityStatus, contractConsumerHealthInner.compatibilityStatus) &&
        Objects.equals(this.lastValidatedAt, contractConsumerHealthInner.lastValidatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerTeam, compatibilityStatus, lastValidatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractConsumerHealthInner {\n");
    sb.append("    consumerTeam: ").append(toIndentedString(consumerTeam)).append("\n");
    sb.append("    compatibilityStatus: ").append(toIndentedString(compatibilityStatus)).append("\n");
    sb.append("    lastValidatedAt: ").append(toIndentedString(lastValidatedAt)).append("\n");
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

