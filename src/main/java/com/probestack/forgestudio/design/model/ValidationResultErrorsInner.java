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
 * ValidationResultErrorsInner
 */
@JsonTypeName("ValidationResult_errors_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-06T13:30:58.296556692Z[GMT]")public class ValidationResultErrorsInner {

  private String field;

  /**
   * Gets or Sets violationType
   */
  public enum ViolationTypeEnum {
    SCHEMA_MISMATCH("SCHEMA_MISMATCH"),
    
    MISSING_FIELD("MISSING_FIELD"),
    
    EXTRA_FIELD("EXTRA_FIELD"),
    
    TYPE_MISMATCH("TYPE_MISMATCH"),
    
    NULL_VIOLATION("NULL_VIOLATION"),
    
    COMPATIBILITY_BREAK("COMPATIBILITY_BREAK"),
    
    ENUM_VIOLATION("ENUM_VIOLATION");

    private String value;

    ViolationTypeEnum(String value) {
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
    public static ViolationTypeEnum fromValue(String value) {
      for (ViolationTypeEnum b : ViolationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ViolationTypeEnum violationType;

  private String message;

  private String expectedType;

  private String actualType;

  private String suggestedFix;

  public ValidationResultErrorsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ValidationResultErrorsInner(String field, ViolationTypeEnum violationType, String message) {
    this.field = field;
    this.violationType = violationType;
    this.message = message;
  }

  public ValidationResultErrorsInner field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
  */
  @NotNull   @Schema(name = "field", example = "customerId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ValidationResultErrorsInner violationType(ViolationTypeEnum violationType) {
    this.violationType = violationType;
    return this;
  }

  /**
   * Get violationType
   * @return violationType
  */
  @NotNull   @Schema(name = "violationType", example = "MISSING_FIELD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("violationType")
  public ViolationTypeEnum getViolationType() {
    return violationType;
  }

  public void setViolationType(ViolationTypeEnum violationType) {
    this.violationType = violationType;
  }

  public ValidationResultErrorsInner message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @NotNull   @Schema(name = "message", example = "Required field 'customerId' is missing from payload.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ValidationResultErrorsInner expectedType(String expectedType) {
    this.expectedType = expectedType;
    return this;
  }

  /**
   * Get expectedType
   * @return expectedType
  */
    @Schema(name = "expectedType", example = "string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expectedType")
  public String getExpectedType() {
    return expectedType;
  }

  public void setExpectedType(String expectedType) {
    this.expectedType = expectedType;
  }

  public ValidationResultErrorsInner actualType(String actualType) {
    this.actualType = actualType;
    return this;
  }

  /**
   * Get actualType
   * @return actualType
  */
    @Schema(name = "actualType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actualType")
  public String getActualType() {
    return actualType;
  }

  public void setActualType(String actualType) {
    this.actualType = actualType;
  }

  public ValidationResultErrorsInner suggestedFix(String suggestedFix) {
    this.suggestedFix = suggestedFix;
    return this;
  }

  /**
   * Get suggestedFix
   * @return suggestedFix
  */
    @Schema(name = "suggestedFix", example = "Add 'customerId' to the payload before publishing.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suggestedFix")
  public String getSuggestedFix() {
    return suggestedFix;
  }

  public void setSuggestedFix(String suggestedFix) {
    this.suggestedFix = suggestedFix;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationResultErrorsInner validationResultErrorsInner = (ValidationResultErrorsInner) o;
    return Objects.equals(this.field, validationResultErrorsInner.field) &&
        Objects.equals(this.violationType, validationResultErrorsInner.violationType) &&
        Objects.equals(this.message, validationResultErrorsInner.message) &&
        Objects.equals(this.expectedType, validationResultErrorsInner.expectedType) &&
        Objects.equals(this.actualType, validationResultErrorsInner.actualType) &&
        Objects.equals(this.suggestedFix, validationResultErrorsInner.suggestedFix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, violationType, message, expectedType, actualType, suggestedFix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationResultErrorsInner {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    violationType: ").append(toIndentedString(violationType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    expectedType: ").append(toIndentedString(expectedType)).append("\n");
    sb.append("    actualType: ").append(toIndentedString(actualType)).append("\n");
    sb.append("    suggestedFix: ").append(toIndentedString(suggestedFix)).append("\n");
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

