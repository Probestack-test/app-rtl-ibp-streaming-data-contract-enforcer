package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.probestack.forgestudio.design.model.Violation;
import com.probestack.forgestudio.design.model.ViolationListSummary;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ViolationList
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-06T13:30:58.296556692Z[GMT]")public class ViolationList {

  @Valid
  private List<@Valid Violation> content = new ArrayList<>();

  private Integer totalElements;

  private Integer totalPages;

  private Integer page;

  private Integer size;

  private ViolationListSummary summary;

  public ViolationList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ViolationList(List<@Valid Violation> content, Integer totalElements, Integer totalPages) {
    this.content = content;
    this.totalElements = totalElements;
    this.totalPages = totalPages;
  }

  public ViolationList content(List<@Valid Violation> content) {
    this.content = content;
    return this;
  }

  public ViolationList addContentItem(Violation contentItem) {
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
  public List<@Valid Violation> getContent() {
    return content;
  }

  public void setContent(List<@Valid Violation> content) {
    this.content = content;
  }

  public ViolationList totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  */
  @NotNull   @Schema(name = "totalElements", example = "1543", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalElements")
  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public ViolationList totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  */
  @NotNull   @Schema(name = "totalPages", example = "78", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public ViolationList page(Integer page) {
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

  public ViolationList size(Integer size) {
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

  public ViolationList summary(ViolationListSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
  @Valid   @Schema(name = "summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public ViolationListSummary getSummary() {
    return summary;
  }

  public void setSummary(ViolationListSummary summary) {
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
    ViolationList violationList = (ViolationList) o;
    return Objects.equals(this.content, violationList.content) &&
        Objects.equals(this.totalElements, violationList.totalElements) &&
        Objects.equals(this.totalPages, violationList.totalPages) &&
        Objects.equals(this.page, violationList.page) &&
        Objects.equals(this.size, violationList.size) &&
        Objects.equals(this.summary, violationList.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, totalElements, totalPages, page, size, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViolationList {\n");
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

