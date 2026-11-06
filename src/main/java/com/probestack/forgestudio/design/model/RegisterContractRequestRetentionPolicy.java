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
 * Optional. Retention contract for the topic.
 */
@Schema(name = "registerContract_request_retentionPolicy", description = "Optional. Retention contract for the topic.")
@JsonTypeName("registerContract_request_retentionPolicy")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-06T13:30:58.296556692Z[GMT]")public class RegisterContractRequestRetentionPolicy {

  private Integer retentionDays;

  /**
   * Gets or Sets deletionMode
   */
  public enum DeletionModeEnum {
    HARD_DELETE("HARD_DELETE"),
    
    TOMBSTONE("TOMBSTONE");

    private String value;

    DeletionModeEnum(String value) {
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
    public static DeletionModeEnum fromValue(String value) {
      for (DeletionModeEnum b : DeletionModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private DeletionModeEnum deletionMode;

  public RegisterContractRequestRetentionPolicy retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

  /**
   * Get retentionDays
   * @return retentionDays
  */
    @Schema(name = "retentionDays", example = "365", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retentionDays")
  public Integer getRetentionDays() {
    return retentionDays;
  }

  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }

  public RegisterContractRequestRetentionPolicy deletionMode(DeletionModeEnum deletionMode) {
    this.deletionMode = deletionMode;
    return this;
  }

  /**
   * Get deletionMode
   * @return deletionMode
  */
    @Schema(name = "deletionMode", example = "TOMBSTONE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletionMode")
  public DeletionModeEnum getDeletionMode() {
    return deletionMode;
  }

  public void setDeletionMode(DeletionModeEnum deletionMode) {
    this.deletionMode = deletionMode;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterContractRequestRetentionPolicy registerContractRequestRetentionPolicy = (RegisterContractRequestRetentionPolicy) o;
    return Objects.equals(this.retentionDays, registerContractRequestRetentionPolicy.retentionDays) &&
        Objects.equals(this.deletionMode, registerContractRequestRetentionPolicy.deletionMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retentionDays, deletionMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterContractRequestRetentionPolicy {\n");
    sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
    sb.append("    deletionMode: ").append(toIndentedString(deletionMode)).append("\n");
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

