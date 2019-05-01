package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Asset;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Tag
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-01T12:06:10.099Z[GMT]")
public class Tag   {
  @JsonProperty("idTag")
  private Integer idTag = null;

  @JsonProperty("uuid")
  private Integer uuid = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("Asset_idAsset")
  private Asset assetIdAsset = null;

  public Tag idTag(Integer idTag) {
    this.idTag = idTag;
    return this;
  }

  /**
   * Get idTag
   * @return idTag
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull

  public Integer getIdTag() {
    return idTag;
  }

  public void setIdTag(Integer idTag) {
    this.idTag = idTag;
  }

  public Tag uuid(Integer uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public Integer getUuid() {
    return uuid;
  }

  public void setUuid(Integer uuid) {
    this.uuid = uuid;
  }

  public Tag category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(example = "beacon", required = true, value = "")
  @NotNull

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Tag description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "estimote-beacon", required = true, value = "")
  @NotNull

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Tag active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
  @NotNull

  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Tag assetIdAsset(Asset assetIdAsset) {
    this.assetIdAsset = assetIdAsset;
    return this;
  }

  /**
   * Get assetIdAsset
   * @return assetIdAsset
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Asset getAssetIdAsset() {
    return assetIdAsset;
  }

  public void setAssetIdAsset(Asset assetIdAsset) {
    this.assetIdAsset = assetIdAsset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.idTag, tag.idTag) &&
        Objects.equals(this.uuid, tag.uuid) &&
        Objects.equals(this.category, tag.category) &&
        Objects.equals(this.description, tag.description) &&
        Objects.equals(this.active, tag.active) &&
        Objects.equals(this.assetIdAsset, tag.assetIdAsset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTag, uuid, category, description, active, assetIdAsset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("    idTag: ").append(toIndentedString(idTag)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    assetIdAsset: ").append(toIndentedString(assetIdAsset)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
