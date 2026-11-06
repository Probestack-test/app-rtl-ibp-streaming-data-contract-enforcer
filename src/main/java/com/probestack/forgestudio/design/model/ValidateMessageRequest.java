package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ValidateMessageRequest
 */
@JsonTypeName("validateMessage_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-06T13:30:58.296556692Z[GMT]")public class ValidateMessageRequest {

  @Valid
  private Map<String, Object> messagePayload = new HashMap<>();

  private String messageKey;

  private String producerService;

  private String producerInstance;

  private Integer schemaVersionOverride;

  public ValidateMessageRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ValidateMessageRequest(Map<String, Object> messagePayload) {
    this.messagePayload = messagePayload;
  }

  public ValidateMessageRequest messagePayload(Map<String, Object> messagePayload) {
    this.messagePayload = messagePayload;
    return this;
  }

  public ValidateMessageRequest putMessagePayloadItem(String key, Object messagePayloadItem) {
    if (this.messagePayload == null) {
      this.messagePayload = new HashMap<>();
    }
    this.messagePayload.put(key, messagePayloadItem);
    return this;
  }

  /**
   * The message to validate.
   * @return messagePayload
  */
  @NotNull   @Schema(name = "messagePayload", example = "{\"transactionId\":\"txn-12345\",\"amount\":149.99,\"currency\":\"USD\",\"customerId\":\"cust-789\",\"timestamp\":1730810400000}", description = "The message to validate.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("messagePayload")
  public Map<String, Object> getMessagePayload() {
    return messagePayload;
  }

  public void setMessagePayload(Map<String, Object> messagePayload) {
    this.messagePayload = messagePayload;
  }

  public ValidateMessageRequest messageKey(String messageKey) {
    this.messageKey = messageKey;
    return this;
  }

  /**
   * Kafka message key (for partition-aware validation).
   * @return messageKey
  */
    @Schema(name = "messageKey", example = "cust-789", description = "Kafka message key (for partition-aware validation).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageKey")
  public String getMessageKey() {
    return messageKey;
  }

  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

  public ValidateMessageRequest producerService(String producerService) {
    this.producerService = producerService;
    return this;
  }

  /**
   * Which service is publishing.
   * @return producerService
  */
    @Schema(name = "producerService", example = "payment-processor", description = "Which service is publishing.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("producerService")
  public String getProducerService() {
    return producerService;
  }

  public void setProducerService(String producerService) {
    this.producerService = producerService;
  }

  public ValidateMessageRequest producerInstance(String producerInstance) {
    this.producerInstance = producerInstance;
    return this;
  }

  /**
   * Specific pod/instance for debugging.
   * @return producerInstance
  */
    @Schema(name = "producerInstance", example = "payment-processor-pod-7f8b9c", description = "Specific pod/instance for debugging.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("producerInstance")
  public String getProducerInstance() {
    return producerInstance;
  }

  public void setProducerInstance(String producerInstance) {
    this.producerInstance = producerInstance;
  }

  public ValidateMessageRequest schemaVersionOverride(Integer schemaVersionOverride) {
    this.schemaVersionOverride = schemaVersionOverride;
    return this;
  }

  /**
   * Optional. Validate against a specific schema version.
   * @return schemaVersionOverride
  */
    @Schema(name = "schemaVersionOverride", example = "2", description = "Optional. Validate against a specific schema version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schemaVersionOverride")
  public Integer getSchemaVersionOverride() {
    return schemaVersionOverride;
  }

  public void setSchemaVersionOverride(Integer schemaVersionOverride) {
    this.schemaVersionOverride = schemaVersionOverride;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateMessageRequest validateMessageRequest = (ValidateMessageRequest) o;
    return Objects.equals(this.messagePayload, validateMessageRequest.messagePayload) &&
        Objects.equals(this.messageKey, validateMessageRequest.messageKey) &&
        Objects.equals(this.producerService, validateMessageRequest.producerService) &&
        Objects.equals(this.producerInstance, validateMessageRequest.producerInstance) &&
        Objects.equals(this.schemaVersionOverride, validateMessageRequest.schemaVersionOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messagePayload, messageKey, producerService, producerInstance, schemaVersionOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateMessageRequest {\n");
    sb.append("    messagePayload: ").append(toIndentedString(messagePayload)).append("\n");
    sb.append("    messageKey: ").append(toIndentedString(messageKey)).append("\n");
    sb.append("    producerService: ").append(toIndentedString(producerService)).append("\n");
    sb.append("    producerInstance: ").append(toIndentedString(producerInstance)).append("\n");
    sb.append("    schemaVersionOverride: ").append(toIndentedString(schemaVersionOverride)).append("\n");
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

