package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.ContractConsumerHealthInner;
import com.probestack.forgestudio.design.model.ContractPendingBreakingChange;
import com.probestack.forgestudio.design.model.ContractViolationStats;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * Contract
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-06T13:30:58.296556692Z[GMT]")public class Contract {

  private UUID contractId;

  private String topicName;

  private String clusterName;

  /**
   * Gets or Sets schemaFormat
   */
  public enum SchemaFormatEnum {
    AVRO("AVRO"),
    
    PROTOBUF("PROTOBUF"),
    
    JSON_SCHEMA("JSON_SCHEMA");

    private String value;

    SchemaFormatEnum(String value) {
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
    public static SchemaFormatEnum fromValue(String value) {
      for (SchemaFormatEnum b : SchemaFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private SchemaFormatEnum schemaFormat;

  @Valid
  private Map<String, Object> schema = new HashMap<>();

  private Integer schemaVersion;

  /**
   * Gets or Sets compatibilityMode
   */
  public enum CompatibilityModeEnum {
    BACKWARD("BACKWARD"),
    
    FORWARD("FORWARD"),
    
    FULL("FULL"),
    
    NONE("NONE"),
    
    BACKWARD_TRANSITIVE("BACKWARD_TRANSITIVE"),
    
    FORWARD_TRANSITIVE("FORWARD_TRANSITIVE"),
    
    FULL_TRANSITIVE("FULL_TRANSITIVE");

    private String value;

    CompatibilityModeEnum(String value) {
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
    public static CompatibilityModeEnum fromValue(String value) {
      for (CompatibilityModeEnum b : CompatibilityModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private CompatibilityModeEnum compatibilityMode;

  /**
   * Gets or Sets enforcementLevel
   */
  public enum EnforcementLevelEnum {
    BLOCK("BLOCK"),
    
    WARN("WARN"),
    
    AUDIT_ONLY("AUDIT_ONLY");

    private String value;

    EnforcementLevelEnum(String value) {
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
    public static EnforcementLevelEnum fromValue(String value) {
      for (EnforcementLevelEnum b : EnforcementLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private EnforcementLevelEnum enforcementLevel;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    PENDING_CONSUMER_APPROVAL("PENDING_CONSUMER_APPROVAL"),
    
    DEPRECATED("DEPRECATED"),
    
    SUSPENDED("SUSPENDED");

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

  private String producerTeam;

  private String producerService;

  @Valid
  private List<String> consumerTeams;

  @Valid
  private List<String> piiFields;

  private ContractPendingBreakingChange pendingBreakingChange;

  private ContractViolationStats violationStats;

  @Valid
  private List<@Valid ContractConsumerHealthInner> consumerHealth;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  private String auditReference;

  public Contract() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Contract(UUID contractId, String topicName, String clusterName, SchemaFormatEnum schemaFormat, Integer schemaVersion, CompatibilityModeEnum compatibilityMode, EnforcementLevelEnum enforcementLevel, StatusEnum status, String producerTeam, OffsetDateTime createdAt) {
    this.contractId = contractId;
    this.topicName = topicName;
    this.clusterName = clusterName;
    this.schemaFormat = schemaFormat;
    this.schemaVersion = schemaVersion;
    this.compatibilityMode = compatibilityMode;
    this.enforcementLevel = enforcementLevel;
    this.status = status;
    this.producerTeam = producerTeam;
    this.createdAt = createdAt;
  }

  public Contract contractId(UUID contractId) {
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

  public Contract topicName(String topicName) {
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

  public Contract clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * Get clusterName
   * @return clusterName
  */
  @NotNull   @Schema(name = "clusterName", example = "prod-kafka-us-east-1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public Contract schemaFormat(SchemaFormatEnum schemaFormat) {
    this.schemaFormat = schemaFormat;
    return this;
  }

  /**
   * Get schemaFormat
   * @return schemaFormat
  */
  @NotNull   @Schema(name = "schemaFormat", example = "AVRO", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schemaFormat")
  public SchemaFormatEnum getSchemaFormat() {
    return schemaFormat;
  }

  public void setSchemaFormat(SchemaFormatEnum schemaFormat) {
    this.schemaFormat = schemaFormat;
  }

  public Contract schema(Map<String, Object> schema) {
    this.schema = schema;
    return this;
  }

  public Contract putSchemaItem(String key, Object schemaItem) {
    if (this.schema == null) {
      this.schema = new HashMap<>();
    }
    this.schema.put(key, schemaItem);
    return this;
  }

  /**
   * Current schema definition.
   * @return schema
  */
    @Schema(name = "schema", description = "Current schema definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schema")
  public Map<String, Object> getSchema() {
    return schema;
  }

  public void setSchema(Map<String, Object> schema) {
    this.schema = schema;
  }

  public Contract schemaVersion(Integer schemaVersion) {
    this.schemaVersion = schemaVersion;
    return this;
  }

  /**
   * Get schemaVersion
   * @return schemaVersion
  */
  @NotNull   @Schema(name = "schemaVersion", example = "3", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schemaVersion")
  public Integer getSchemaVersion() {
    return schemaVersion;
  }

  public void setSchemaVersion(Integer schemaVersion) {
    this.schemaVersion = schemaVersion;
  }

  public Contract compatibilityMode(CompatibilityModeEnum compatibilityMode) {
    this.compatibilityMode = compatibilityMode;
    return this;
  }

  /**
   * Get compatibilityMode
   * @return compatibilityMode
  */
  @NotNull   @Schema(name = "compatibilityMode", example = "FULL_TRANSITIVE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("compatibilityMode")
  public CompatibilityModeEnum getCompatibilityMode() {
    return compatibilityMode;
  }

  public void setCompatibilityMode(CompatibilityModeEnum compatibilityMode) {
    this.compatibilityMode = compatibilityMode;
  }

  public Contract enforcementLevel(EnforcementLevelEnum enforcementLevel) {
    this.enforcementLevel = enforcementLevel;
    return this;
  }

  /**
   * Get enforcementLevel
   * @return enforcementLevel
  */
  @NotNull   @Schema(name = "enforcementLevel", example = "BLOCK", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("enforcementLevel")
  public EnforcementLevelEnum getEnforcementLevel() {
    return enforcementLevel;
  }

  public void setEnforcementLevel(EnforcementLevelEnum enforcementLevel) {
    this.enforcementLevel = enforcementLevel;
  }

  public Contract status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "ACTIVE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Contract producerTeam(String producerTeam) {
    this.producerTeam = producerTeam;
    return this;
  }

  /**
   * Get producerTeam
   * @return producerTeam
  */
  @NotNull   @Schema(name = "producerTeam", example = "payments-team", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("producerTeam")
  public String getProducerTeam() {
    return producerTeam;
  }

  public void setProducerTeam(String producerTeam) {
    this.producerTeam = producerTeam;
  }

  public Contract producerService(String producerService) {
    this.producerService = producerService;
    return this;
  }

  /**
   * Get producerService
   * @return producerService
  */
    @Schema(name = "producerService", example = "payment-processor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("producerService")
  public String getProducerService() {
    return producerService;
  }

  public void setProducerService(String producerService) {
    this.producerService = producerService;
  }

  public Contract consumerTeams(List<String> consumerTeams) {
    this.consumerTeams = consumerTeams;
    return this;
  }

  public Contract addConsumerTeamsItem(String consumerTeamsItem) {
    if (this.consumerTeams == null) {
      this.consumerTeams = new ArrayList<>();
    }
    this.consumerTeams.add(consumerTeamsItem);
    return this;
  }

  /**
   * Get consumerTeams
   * @return consumerTeams
  */
    @Schema(name = "consumerTeams", example = "[\"analytics-team\",\"risk-team\",\"customer-dashboard-team\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("consumerTeams")
  public List<String> getConsumerTeams() {
    return consumerTeams;
  }

  public void setConsumerTeams(List<String> consumerTeams) {
    this.consumerTeams = consumerTeams;
  }

  public Contract piiFields(List<String> piiFields) {
    this.piiFields = piiFields;
    return this;
  }

  public Contract addPiiFieldsItem(String piiFieldsItem) {
    if (this.piiFields == null) {
      this.piiFields = new ArrayList<>();
    }
    this.piiFields.add(piiFieldsItem);
    return this;
  }

  /**
   * Get piiFields
   * @return piiFields
  */
    @Schema(name = "piiFields", example = "[\"customerId\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("piiFields")
  public List<String> getPiiFields() {
    return piiFields;
  }

  public void setPiiFields(List<String> piiFields) {
    this.piiFields = piiFields;
  }

  public Contract pendingBreakingChange(ContractPendingBreakingChange pendingBreakingChange) {
    this.pendingBreakingChange = pendingBreakingChange;
    return this;
  }

  /**
   * Get pendingBreakingChange
   * @return pendingBreakingChange
  */
  @Valid   @Schema(name = "pendingBreakingChange", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pendingBreakingChange")
  public ContractPendingBreakingChange getPendingBreakingChange() {
    return pendingBreakingChange;
  }

  public void setPendingBreakingChange(ContractPendingBreakingChange pendingBreakingChange) {
    this.pendingBreakingChange = pendingBreakingChange;
  }

  public Contract violationStats(ContractViolationStats violationStats) {
    this.violationStats = violationStats;
    return this;
  }

  /**
   * Get violationStats
   * @return violationStats
  */
  @Valid   @Schema(name = "violationStats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("violationStats")
  public ContractViolationStats getViolationStats() {
    return violationStats;
  }

  public void setViolationStats(ContractViolationStats violationStats) {
    this.violationStats = violationStats;
  }

  public Contract consumerHealth(List<@Valid ContractConsumerHealthInner> consumerHealth) {
    this.consumerHealth = consumerHealth;
    return this;
  }

  public Contract addConsumerHealthItem(ContractConsumerHealthInner consumerHealthItem) {
    if (this.consumerHealth == null) {
      this.consumerHealth = new ArrayList<>();
    }
    this.consumerHealth.add(consumerHealthItem);
    return this;
  }

  /**
   * Per-consumer compatibility status.
   * @return consumerHealth
  */
  @Valid   @Schema(name = "consumerHealth", description = "Per-consumer compatibility status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("consumerHealth")
  public List<@Valid ContractConsumerHealthInner> getConsumerHealth() {
    return consumerHealth;
  }

  public void setConsumerHealth(List<@Valid ContractConsumerHealthInner> consumerHealth) {
    this.consumerHealth = consumerHealth;
  }

  public Contract createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @NotNull @Valid   @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Contract updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid   @Schema(name = "updatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Contract auditReference(String auditReference) {
    this.auditReference = auditReference;
    return this;
  }

  /**
   * Get auditReference
   * @return auditReference
  */
    @Schema(name = "auditReference", example = "audit://data-contract/contract-9c8f1a3b", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Contract contract = (Contract) o;
    return Objects.equals(this.contractId, contract.contractId) &&
        Objects.equals(this.topicName, contract.topicName) &&
        Objects.equals(this.clusterName, contract.clusterName) &&
        Objects.equals(this.schemaFormat, contract.schemaFormat) &&
        Objects.equals(this.schema, contract.schema) &&
        Objects.equals(this.schemaVersion, contract.schemaVersion) &&
        Objects.equals(this.compatibilityMode, contract.compatibilityMode) &&
        Objects.equals(this.enforcementLevel, contract.enforcementLevel) &&
        Objects.equals(this.status, contract.status) &&
        Objects.equals(this.producerTeam, contract.producerTeam) &&
        Objects.equals(this.producerService, contract.producerService) &&
        Objects.equals(this.consumerTeams, contract.consumerTeams) &&
        Objects.equals(this.piiFields, contract.piiFields) &&
        Objects.equals(this.pendingBreakingChange, contract.pendingBreakingChange) &&
        Objects.equals(this.violationStats, contract.violationStats) &&
        Objects.equals(this.consumerHealth, contract.consumerHealth) &&
        Objects.equals(this.createdAt, contract.createdAt) &&
        Objects.equals(this.updatedAt, contract.updatedAt) &&
        Objects.equals(this.auditReference, contract.auditReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, topicName, clusterName, schemaFormat, schema, schemaVersion, compatibilityMode, enforcementLevel, status, producerTeam, producerService, consumerTeams, piiFields, pendingBreakingChange, violationStats, consumerHealth, createdAt, updatedAt, auditReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contract {\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    schemaFormat: ").append(toIndentedString(schemaFormat)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    compatibilityMode: ").append(toIndentedString(compatibilityMode)).append("\n");
    sb.append("    enforcementLevel: ").append(toIndentedString(enforcementLevel)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    producerTeam: ").append(toIndentedString(producerTeam)).append("\n");
    sb.append("    producerService: ").append(toIndentedString(producerService)).append("\n");
    sb.append("    consumerTeams: ").append(toIndentedString(consumerTeams)).append("\n");
    sb.append("    piiFields: ").append(toIndentedString(piiFields)).append("\n");
    sb.append("    pendingBreakingChange: ").append(toIndentedString(pendingBreakingChange)).append("\n");
    sb.append("    violationStats: ").append(toIndentedString(violationStats)).append("\n");
    sb.append("    consumerHealth: ").append(toIndentedString(consumerHealth)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

