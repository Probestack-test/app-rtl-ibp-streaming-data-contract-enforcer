package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.probestack.forgestudio.design.model.Contract;
import com.probestack.forgestudio.design.model.ContractListSummary;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ContractList
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-06T13:30:58.296556692Z[GMT]")public class ContractList {

  @Valid
  private List<@Valid Contract> content = new ArrayList<>();

  private Integer totalElements;

  private Integer totalPages;

  private Integer page;

  private Integer size;

  private ContractListSummary summary;

  public ContractList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContractList(List<@Valid Contract> content, Integer totalElements, Integer totalPages) {
    this.content = content;
    this.totalElements = totalElements;
    this.totalPages = totalPages;
  }

  public ContractList content(List<@Valid Contract> content) {
    this.content = content;
    return this;
  }

  public ContractList addContentItem(Contract contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @NotNull @Valid   @Schema(name = "content", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content")
  public List<@Valid Contract> getContent() {
    return content;
  }

  public void setContent(List<@Valid Contract> content) {
    this.content = content;
  }

  public ContractList totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  */
  @NotNull   @Schema(name = "totalElements", example = "247", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalElements")
  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public ContractList totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  */
  @NotNull   @Schema(name = "totalPages", example = "13", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public ContractList page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  */
    @Schema(name = "page", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ContractList size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
    @Schema(name = "size", example = "20", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public ContractList summary(ContractListSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
  @Valid   @Schema(name = "summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public ContractListSummary getSummary() {
    return summary;
  }

  public void setSummary(ContractListSummary summary) {
    this.summary = summary;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractList contractList = (ContractList) o;
    return Objects.equals(this.content, contractList.content) &&
        Objects.equals(this.totalElements, contractList.totalElements) &&
        Objects.equals(this.totalPages, contractList.totalPages) &&
        Objects.equals(this.page, contractList.page) &&
        Objects.equals(this.size, contractList.size) &&
        Objects.equals(this.summary, contractList.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, totalElements, totalPages, page, size, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractList {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

