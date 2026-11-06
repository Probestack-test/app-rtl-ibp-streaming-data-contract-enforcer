package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Violation
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-06T13:30:58.296556692Z[GMT]")public class Violation {

  private UUID violationId;

  private UUID contractId;

  private String topicName;

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

  /**
   * Gets or Sets severity
   */
  public enum SeverityEnum {
    WARNING("WARNING"),
    
    ERROR("ERROR"),
    
    CRITICAL("CRITICAL");

    private String value;

    SeverityEnum(String value) {
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
    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private SeverityEnum severity;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OPEN("OPEN"),
    
    ACKNOWLEDGED("ACKNOWLEDGED"),
    
    RESOLVED("RESOLVED"),
    
    IGNORED("IGNORED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StatusEnum status;

  private String producerService;

  private String producerInstance;

  private String producerTeam;

  private String affectedField;

  private String errorDetail;

  @Valid
  private Map<String, Object> samplePayload = new HashMap<>();

  private Integer occurrenceCount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime firstOccurrenceAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastOccurrenceAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime detectedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime acknowledgedAt;

  private String acknowledgedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime resolvedAt;

  private String resolvedBy;

  private String resolutionNotes;

  private String auditReference;

  public Violation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Violation(UUID violationId, UUID contractId, String topicName, ViolationTypeEnum violationType, SeverityEnum severity, StatusEnum status, String producerService, OffsetDateTime detectedAt) {
    this.violationId = violationId;
    this.contractId = contractId;
    this.topicName = topicName;
    this.violationType = violationType;
    this.severity = severity;
    this.status = status;
    this.producerService = producerService;
    this.detectedAt = detectedAt;
  }

  public Violation violationId(UUID violationId) {
    this.violationId = violationId;
    return this;
  }

  /**
   * Get violationId
   * @return violationId
  */
  @NotNull @Valid   @Schema(name = "violationId", example = "c1a2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("violationId")
  public UUID getViolationId() {
    return violationId;
  }

  public void setViolationId(UUID violationId) {
    this.violationId = violationId;
  }

  public Violation contractId(UUID contractId) {
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

  public Violation topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

  /**
   * Get topicName
   * @return topicName
  */
  @NotNull   @Schema(name = "topicName", example = "payments.transactions.v1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("topicName")
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public Violation violationType(ViolationTypeEnum violationType) {
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

  public Violation severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
  */
  @NotNull   @Schema(name = "severity", example = "CRITICAL", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public Violation status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "OPEN", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Violation producerService(String producerService) {
    this.producerService = producerService;
    return this;
  }

  /**
   * Get producerService
   * @return producerService
  */
  @NotNull   @Schema(name = "producerService", example = "payment-processor-legacy", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("producerService")
  public String getProducerService() {
    return producerService;
  }

  public void setProducerService(String producerService) {
    this.producerService = producerService;
  }

  public Violation producerInstance(String producerInstance) {
    this.producerInstance = producerInstance;
    return this;
  }

  /**
   * Get producerInstance
   * @return producerInstance
  */
    @Schema(name = "producerInstance", example = "payment-processor-legacy-pod-4d5e6f", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("producerInstance")
  public String getProducerInstance() {
    return producerInstance;
  }

  public void setProducerInstance(String producerInstance) {
    this.producerInstance = producerInstance;
  }

  public Violation producerTeam(String producerTeam) {
    this.producerTeam = producerTeam;
    return this;
  }

  /**
   * Get producerTeam
   * @return producerTeam
  */
    @Schema(name = "producerTeam", example = "payments-team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("producerTeam")
  public String getProducerTeam() {
    return producerTeam;
  }

  public void setProducerTeam(String producerTeam) {
    this.producerTeam = producerTeam;
  }

  public Violation affectedField(String affectedField) {
    this.affectedField = affectedField;
    return this;
  }

  /**
   * Get affectedField
   * @return affectedField
  */
    @Schema(name = "affectedField", example = "customerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("affectedField")
  public String getAffectedField() {
    return affectedField;
  }

  public void setAffectedField(String affectedField) {
    this.affectedField = affectedField;
  }

  public Violation errorDetail(String errorDetail) {
    this.errorDetail = errorDetail;
    return this;
  }

  /**
   * Get errorDetail
   * @return errorDetail
  */
    @Schema(name = "errorDetail", example = "Required field 'customerId' missing from 847 messages in last hour.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorDetail")
  public String getErrorDetail() {
    return errorDetail;
  }

  public void setErrorDetail(String errorDetail) {
    this.errorDetail = errorDetail;
  }

  public Violation samplePayload(Map<String, Object> samplePayload) {
    this.samplePayload = samplePayload;
    return this;
  }

  public Violation putSamplePayloadItem(String key, Object samplePayloadItem) {
    if (this.samplePayload == null) {
      this.samplePayload = new HashMap<>();
    }
    this.samplePayload.put(key, samplePayloadItem);
    return this;
  }

  /**
   * Redacted sample of the violating message.
   * @return samplePayload
  */
    @Schema(name = "samplePayload", example = "{\"transactionId\":\"txn-12345\",\"amount\":149.99}", description = "Redacted sample of the violating message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("samplePayload")
  public Map<String, Object> getSamplePayload() {
    return samplePayload;
  }

  public void setSamplePayload(Map<String, Object> samplePayload) {
    this.samplePayload = samplePayload;
  }

  public Violation occurrenceCount(Integer occurrenceCount) {
    this.occurrenceCount = occurrenceCount;
    return this;
  }

  /**
   * How many times this violation was observed.
   * @return occurrenceCount
  */
    @Schema(name = "occurrenceCount", example = "847", description = "How many times this violation was observed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("occurrenceCount")
  public Integer getOccurrenceCount() {
    return occurrenceCount;
  }

  public void setOccurrenceCount(Integer occurrenceCount) {
    this.occurrenceCount = occurrenceCount;
  }

  public Violation firstOccurrenceAt(OffsetDateTime firstOccurrenceAt) {
    this.firstOccurrenceAt = firstOccurrenceAt;
    return this;
  }

  /**
   * Get firstOccurrenceAt
   * @return firstOccurrenceAt
  */
  @Valid   @Schema(name = "firstOccurrenceAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstOccurrenceAt")
  public OffsetDateTime getFirstOccurrenceAt() {
    return firstOccurrenceAt;
  }

  public void setFirstOccurrenceAt(OffsetDateTime firstOccurrenceAt) {
    this.firstOccurrenceAt = firstOccurrenceAt;
  }

  public Violation lastOccurrenceAt(OffsetDateTime lastOccurrenceAt) {
    this.lastOccurrenceAt = lastOccurrenceAt;
    return this;
  }

  /**
   * Get lastOccurrenceAt
   * @return lastOccurrenceAt
  */
  @Valid   @Schema(name = "lastOccurrenceAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastOccurrenceAt")
  public OffsetDateTime getLastOccurrenceAt() {
    return lastOccurrenceAt;
  }

  public void setLastOccurrenceAt(OffsetDateTime lastOccurrenceAt) {
    this.lastOccurrenceAt = lastOccurrenceAt;
  }

  public Violation detectedAt(OffsetDateTime detectedAt) {
    this.detectedAt = detectedAt;
    return this;
  }

  /**
   * Get detectedAt
   * @return detectedAt
  */
  @NotNull @Valid   @Schema(name = "detectedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detectedAt")
  public OffsetDateTime getDetectedAt() {
    return detectedAt;
  }

  public void setDetectedAt(OffsetDateTime detectedAt) {
    this.detectedAt = detectedAt;
  }

  public Violation acknowledgedAt(OffsetDateTime acknowledgedAt) {
    this.acknowledgedAt = acknowledgedAt;
    return this;
  }

  /**
   * Get acknowledgedAt
   * @return acknowledgedAt
  */
  @Valid   @Schema(name = "acknowledgedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acknowledgedAt")
  public OffsetDateTime getAcknowledgedAt() {
    return acknowledgedAt;
  }

  public void setAcknowledgedAt(OffsetDateTime acknowledgedAt) {
    this.acknowledgedAt = acknowledgedAt;
  }

  public Violation acknowledgedBy(String acknowledgedBy) {
    this.acknowledgedBy = acknowledgedBy;
    return this;
  }

  /**
   * Get acknowledgedBy
   * @return acknowledgedBy
  */
    @Schema(name = "acknowledgedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acknowledgedBy")
  public String getAcknowledgedBy() {
    return acknowledgedBy;
  }

  public void setAcknowledgedBy(String acknowledgedBy) {
    this.acknowledgedBy = acknowledgedBy;
  }

  public Violation resolvedAt(OffsetDateTime resolvedAt) {
    this.resolvedAt = resolvedAt;
    return this;
  }

  /**
   * Get resolvedAt
   * @return resolvedAt
  */
  @Valid   @Schema(name = "resolvedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolvedAt")
  public OffsetDateTime getResolvedAt() {
    return resolvedAt;
  }

  public void setResolvedAt(OffsetDateTime resolvedAt) {
    this.resolvedAt = resolvedAt;
  }

  public Violation resolvedBy(String resolvedBy) {
    this.resolvedBy = resolvedBy;
    return this;
  }

  /**
   * Get resolvedBy
   * @return resolvedBy
  */
    @Schema(name = "resolvedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolvedBy")
  public String getResolvedBy() {
    return resolvedBy;
  }

  public void setResolvedBy(String resolvedBy) {
    this.resolvedBy = resolvedBy;
  }

  public Violation resolutionNotes(String resolutionNotes) {
    this.resolutionNotes = resolutionNotes;
    return this;
  }

  /**
   * Get resolutionNotes
   * @return resolutionNotes
  */
    @Schema(name = "resolutionNotes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolutionNotes")
  public String getResolutionNotes() {
    return resolutionNotes;
  }

  public void setResolutionNotes(String resolutionNotes) {
    this.resolutionNotes = resolutionNotes;
  }

  public Violation auditReference(String auditReference) {
    this.auditReference = auditReference;
    return this;
  }

  /**
   * Get auditReference
   * @return auditReference
  */
    @Schema(name = "auditReference", example = "audit://data-contract/violation-c1a2c3d4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Violation violation = (Violation) o;
    return Objects.equals(this.violationId, violation.violationId) &&
        Objects.equals(this.contractId, violation.contractId) &&
        Objects.equals(this.topicName, violation.topicName) &&
        Objects.equals(this.violationType, violation.violationType) &&
        Objects.equals(this.severity, violation.severity) &&
        Objects.equals(this.status, violation.status) &&
        Objects.equals(this.producerService, violation.producerService) &&
        Objects.equals(this.producerInstance, violation.producerInstance) &&
        Objects.equals(this.producerTeam, violation.producerTeam) &&
        Objects.equals(this.affectedField, violation.affectedField) &&
        Objects.equals(this.errorDetail, violation.errorDetail) &&
        Objects.equals(this.samplePayload, violation.samplePayload) &&
        Objects.equals(this.occurrenceCount, violation.occurrenceCount) &&
        Objects.equals(this.firstOccurrenceAt, violation.firstOccurrenceAt) &&
        Objects.equals(this.lastOccurrenceAt, violation.lastOccurrenceAt) &&
        Objects.equals(this.detectedAt, violation.detectedAt) &&
        Objects.equals(this.acknowledgedAt, violation.acknowledgedAt) &&
        Objects.equals(this.acknowledgedBy, violation.acknowledgedBy) &&
        Objects.equals(this.resolvedAt, violation.resolvedAt) &&
        Objects.equals(this.resolvedBy, violation.resolvedBy) &&
        Objects.equals(this.resolutionNotes, violation.resolutionNotes) &&
        Objects.equals(this.auditReference, violation.auditReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(violationId, contractId, topicName, violationType, severity, status, producerService, producerInstance, producerTeam, affectedField, errorDetail, samplePayload, occurrenceCount, firstOccurrenceAt, lastOccurrenceAt, detectedAt, acknowledgedAt, acknowledgedBy, resolvedAt, resolvedBy, resolutionNotes, auditReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Violation {\n");
    sb.append("    violationId: ").append(toIndentedString(violationId)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    violationType: ").append(toIndentedString(violationType)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    producerService: ").append(toIndentedString(producerService)).append("\n");
    sb.append("    producerInstance: ").append(toIndentedString(producerInstance)).append("\n");
    sb.append("    producerTeam: ").append(toIndentedString(producerTeam)).append("\n");
    sb.append("    affectedField: ").append(toIndentedString(affectedField)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
    sb.append("    samplePayload: ").append(toIndentedString(samplePayload)).append("\n");
    sb.append("    occurrenceCount: ").append(toIndentedString(occurrenceCount)).append("\n");
    sb.append("    firstOccurrenceAt: ").append(toIndentedString(firstOccurrenceAt)).append("\n");
    sb.append("    lastOccurrenceAt: ").append(toIndentedString(lastOccurrenceAt)).append("\n");
    sb.append("    detectedAt: ").append(toIndentedString(detectedAt)).append("\n");
    sb.append("    acknowledgedAt: ").append(toIndentedString(acknowledgedAt)).append("\n");
    sb.append("    acknowledgedBy: ").append(toIndentedString(acknowledgedBy)).append("\n");
    sb.append("    resolvedAt: ").append(toIndentedString(resolvedAt)).append("\n");
    sb.append("    resolvedBy: ").append(toIndentedString(resolvedBy)).append("\n");
    sb.append("    resolutionNotes: ").append(toIndentedString(resolutionNotes)).append("\n");
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

