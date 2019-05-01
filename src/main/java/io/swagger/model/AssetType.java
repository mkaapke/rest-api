package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssetType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-01T12:06:10.099Z[GMT]")
public class AssetType   {
  @JsonProperty("idAssetType")
  private Integer idAssetType = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  public AssetType idAssetType(Integer idAssetType) {
    this.idAssetType = idAssetType;
    return this;
  }

  /**
   * Get idAssetType
   * @return idAssetType
  **/
  @ApiModelProperty(example = "2", required = true, value = "")
  @NotNull

  public Integer getIdAssetType() {
    return idAssetType;
  }

  public void setIdAssetType(Integer idAssetType) {
    this.idAssetType = idAssetType;
  }

  public AssetType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Brandschutztür", required = true, value = "")
  @NotNull

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssetType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Keine Flammen kommt durch!", required = true, value = "")
  @NotNull

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetType assetType = (AssetType) o;
    return Objects.equals(this.idAssetType, assetType.idAssetType) &&
        Objects.equals(this.name, assetType.name) &&
        Objects.equals(this.description, assetType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAssetType, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetType {\n");
    
    sb.append("    idAssetType: ").append(toIndentedString(idAssetType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
