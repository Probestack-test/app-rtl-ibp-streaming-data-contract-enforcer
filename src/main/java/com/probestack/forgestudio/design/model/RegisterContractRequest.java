package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.RegisterContractRequestRetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RegisterContractRequest
 */
@JsonTypeName("registerContract_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-06T13:30:58.296556692Z[GMT]")public class RegisterContractRequest {

  private String topicName;

  private String clusterName;

  /**
   * Schema serialization format.
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
   * Schema evolution compatibility rules.
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
   * How strictly to enforce at publish time.
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

  private String producerTeam;

  private String producerService;

  @Valid
  private List<String> consumerTeams;

  @Valid
  private List<String> piiFields;

  private RegisterContractRequestRetentionPolicy retentionPolicy;

  /**
   * Gets or Sets notifyChannels
   */
  public enum NotifyChannelsEnum {
    EMAIL("EMAIL"),
    
    SLACK("SLACK"),
    
    PAGERDUTY("PAGERDUTY"),
    
    WEBHOOK("WEBHOOK");

    private String value;

    NotifyChannelsEnum(String value) {
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
    public static NotifyChannelsEnum fromValue(String value) {
      for (NotifyChannelsEnum b : NotifyChannelsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  @Valid
  private List<NotifyChannelsEnum> notifyChannels;

  public RegisterContractRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RegisterContractRequest(String topicName, SchemaFormatEnum schemaFormat, Map<String, Object> schema, CompatibilityModeEnum compatibilityMode, String producerTeam) {
    this.topicName = topicName;
    this.schemaFormat = schemaFormat;
    this.schema = schema;
    this.compatibilityMode = compatibilityMode;
    this.producerTeam = producerTeam;
  }

  public RegisterContractRequest topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

  /**
   * Kafka topic this contract applies to.
   * @return topicName
  */
  @NotNull   @Schema(name = "topicName", example = "payments.transactions.v1", description = "Kafka topic this contract applies to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("topicName")
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public RegisterContractRequest clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * Kafka cluster hosting the topic.
   * @return clusterName
  */
    @Schema(name = "clusterName", example = "prod-kafka-us-east-1", description = "Kafka cluster hosting the topic.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public RegisterContractRequest schemaFormat(SchemaFormatEnum schemaFormat) {
    this.schemaFormat = schemaFormat;
    return this;
  }

  /**
   * Schema serialization format.
   * @return schemaFormat
  */
  @NotNull   @Schema(name = "schemaFormat", example = "AVRO", description = "Schema serialization format.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schemaFormat")
  public SchemaFormatEnum getSchemaFormat() {
    return schemaFormat;
  }

  public void setSchemaFormat(SchemaFormatEnum schemaFormat) {
    this.schemaFormat = schemaFormat;
  }

  public RegisterContractRequest schema(Map<String, Object> schema) {
    this.schema = schema;
    return this;
  }

  public RegisterContractRequest putSchemaItem(String key, Object schemaItem) {
    if (this.schema == null) {
      this.schema = new HashMap<>();
    }
    this.schema.put(key, schemaItem);
    return this;
  }

  /**
   * The schema definition (format-specific).
   * @return schema
  */
  @NotNull   @Schema(name = "schema", example = "{\"type\":\"record\",\"name\":\"PaymentTransaction\",\"namespace\":\"com.forgesphere.payments\",\"fields\":[{\"name\":\"transactionId\",\"type\":\"string\"},{\"name\":\"amount\",\"type\":\"double\"},{\"name\":\"currency\",\"type\":\"string\"},{\"name\":\"customerId\",\"type\":\"string\"},{\"name\":\"timestamp\",\"type\":\"long\"}]}", description = "The schema definition (format-specific).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schema")
  public Map<String, Object> getSchema() {
    return schema;
  }

  public void setSchema(Map<String, Object> schema) {
    this.schema = schema;
  }

  public RegisterContractRequest schemaVersion(Integer schemaVersion) {
    this.schemaVersion = schemaVersion;
    return this;
  }

  /**
   * Version number for this schema.
   * @return schemaVersion
  */
    @Schema(name = "schemaVersion", example = "3", description = "Version number for this schema.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schemaVersion")
  public Integer getSchemaVersion() {
    return schemaVersion;
  }

  public void setSchemaVersion(Integer schemaVersion) {
    this.schemaVersion = schemaVersion;
  }

  public RegisterContractRequest compatibilityMode(CompatibilityModeEnum compatibilityMode) {
    this.compatibilityMode = compatibilityMode;
    return this;
  }

  /**
   * Schema evolution compatibility rules.
   * @return compatibilityMode
  */
  @NotNull   @Schema(name = "compatibilityMode", example = "FULL_TRANSITIVE", description = "Schema evolution compatibility rules.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("compatibilityMode")
  public CompatibilityModeEnum getCompatibilityMode() {
    return compatibilityMode;
  }

  public void setCompatibilityMode(CompatibilityModeEnum compatibilityMode) {
    this.compatibilityMode = compatibilityMode;
  }

  public RegisterContractRequest enforcementLevel(EnforcementLevelEnum enforcementLevel) {
    this.enforcementLevel = enforcementLevel;
    return this;
  }

  /**
   * How strictly to enforce at publish time.
   * @return enforcementLevel
  */
    @Schema(name = "enforcementLevel", example = "BLOCK", description = "How strictly to enforce at publish time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enforcementLevel")
  public EnforcementLevelEnum getEnforcementLevel() {
    return enforcementLevel;
  }

  public void setEnforcementLevel(EnforcementLevelEnum enforcementLevel) {
    this.enforcementLevel = enforcementLevel;
  }

  public RegisterContractRequest producerTeam(String producerTeam) {
    this.producerTeam = producerTeam;
    return this;
  }

  /**
   * Team owning the producer.
   * @return producerTeam
  */
  @NotNull   @Schema(name = "producerTeam", example = "payments-team", description = "Team owning the producer.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("producerTeam")
  public String getProducerTeam() {
    return producerTeam;
  }

  public void setProducerTeam(String producerTeam) {
    this.producerTeam = producerTeam;
  }

  public RegisterContractRequest producerService(String producerService) {
    this.producerService = producerService;
    return this;
  }

  /**
   * Specific producer service name.
   * @return producerService
  */
    @Schema(name = "producerService", example = "payment-processor", description = "Specific producer service name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("producerService")
  public String getProducerService() {
    return producerService;
  }

  public void setProducerService(String producerService) {
    this.producerService = producerService;
  }

  public RegisterContractRequest consumerTeams(List<String> consumerTeams) {
    this.consumerTeams = consumerTeams;
    return this;
  }

  public RegisterContractRequest addConsumerTeamsItem(String consumerTeamsItem) {
    if (this.consumerTeams == null) {
      this.consumerTeams = new ArrayList<>();
    }
    this.consumerTeams.add(consumerTeamsItem);
    return this;
  }

  /**
   * All teams consuming this topic.
   * @return consumerTeams
  */
    @Schema(name = "consumerTeams", example = "[\"analytics-team\",\"risk-team\",\"customer-dashboard-team\"]", description = "All teams consuming this topic.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("consumerTeams")
  public List<String> getConsumerTeams() {
    return consumerTeams;
  }

  public void setConsumerTeams(List<String> consumerTeams) {
    this.consumerTeams = consumerTeams;
  }

  public RegisterContractRequest piiFields(List<String> piiFields) {
    this.piiFields = piiFields;
    return this;
  }

  public RegisterContractRequest addPiiFieldsItem(String piiFieldsItem) {
    if (this.piiFields == null) {
      this.piiFields = new ArrayList<>();
    }
    this.piiFields.add(piiFieldsItem);
    return this;
  }

  /**
   * Fields containing PII (for compliance tracking).
   * @return piiFields
  */
    @Schema(name = "piiFields", example = "[\"customerId\"]", description = "Fields containing PII (for compliance tracking).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("piiFields")
  public List<String> getPiiFields() {
    return piiFields;
  }

  public void setPiiFields(List<String> piiFields) {
    this.piiFields = piiFields;
  }

  public RegisterContractRequest retentionPolicy(RegisterContractRequestRetentionPolicy retentionPolicy) {
    this.retentionPolicy = retentionPolicy;
    return this;
  }

  /**
   * Get retentionPolicy
   * @return retentionPolicy
  */
  @Valid   @Schema(name = "retentionPolicy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retentionPolicy")
  public RegisterContractRequestRetentionPolicy getRetentionPolicy() {
    return retentionPolicy;
  }

  public void setRetentionPolicy(RegisterContractRequestRetentionPolicy retentionPolicy) {
    this.retentionPolicy = retentionPolicy;
  }

  public RegisterContractRequest notifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
    return this;
  }

  public RegisterContractRequest addNotifyChannelsItem(NotifyChannelsEnum notifyChannelsItem) {
    if (this.notifyChannels == null) {
      this.notifyChannels = new ArrayList<>();
    }
    this.notifyChannels.add(notifyChannelsItem);
    return this;
  }

  /**
   * Where to send violation alerts.
   * @return notifyChannels
  */
    @Schema(name = "notifyChannels", example = "[\"SLACK\"]", description = "Where to send violation alerts.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifyChannels")
  public List<NotifyChannelsEnum> getNotifyChannels() {
    return notifyChannels;
  }

  public void setNotifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterContractRequest registerContractRequest = (RegisterContractRequest) o;
    return Objects.equals(this.topicName, registerContractRequest.topicName) &&
        Objects.equals(this.clusterName, registerContractRequest.clusterName) &&
        Objects.equals(this.schemaFormat, registerContractRequest.schemaFormat) &&
        Objects.equals(this.schema, registerContractRequest.schema) &&
        Objects.equals(this.schemaVersion, registerContractRequest.schemaVersion) &&
        Objects.equals(this.compatibilityMode, registerContractRequest.compatibilityMode) &&
        Objects.equals(this.enforcementLevel, registerContractRequest.enforcementLevel) &&
        Objects.equals(this.producerTeam, registerContractRequest.producerTeam) &&
        Objects.equals(this.producerService, registerContractRequest.producerService) &&
        Objects.equals(this.consumerTeams, registerContractRequest.consumerTeams) &&
        Objects.equals(this.piiFields, registerContractRequest.piiFields) &&
        Objects.equals(this.retentionPolicy, registerContractRequest.retentionPolicy) &&
        Objects.equals(this.notifyChannels, registerContractRequest.notifyChannels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topicName, clusterName, schemaFormat, schema, schemaVersion, compatibilityMode, enforcementLevel, producerTeam, producerService, consumerTeams, piiFields, retentionPolicy, notifyChannels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterContractRequest {\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    schemaFormat: ").append(toIndentedString(schemaFormat)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    compatibilityMode: ").append(toIndentedString(compatibilityMode)).append("\n");
    sb.append("    enforcementLevel: ").append(toIndentedString(enforcementLevel)).append("\n");
    sb.append("    producerTeam: ").append(toIndentedString(producerTeam)).append("\n");
    sb.append("    producerService: ").append(toIndentedString(producerService)).append("\n");
    sb.append("    consumerTeams: ").append(toIndentedString(consumerTeams)).append("\n");
    sb.append("    piiFields: ").append(toIndentedString(piiFields)).append("\n");
    sb.append("    retentionPolicy: ").append(toIndentedString(retentionPolicy)).append("\n");
    sb.append("    notifyChannels: ").append(toIndentedString(notifyChannels)).append("\n");
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

