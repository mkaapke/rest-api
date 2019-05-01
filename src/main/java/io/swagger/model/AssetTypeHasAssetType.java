package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssetType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssetTypeHasAssetType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-01T12:06:10.099Z[GMT]")
public class AssetTypeHasAssetType   {
  @JsonProperty("AssetType_idAssetType")
  private AssetType assetTypeIdAssetType = null;

  @JsonProperty("AssetType_idAssetType1")
  private AssetType assetTypeIdAssetType1 = null;

  public AssetTypeHasAssetType assetTypeIdAssetType(AssetType assetTypeIdAssetType) {
    this.assetTypeIdAssetType = assetTypeIdAssetType;
    return this;
  }

  /**
   * Get assetTypeIdAssetType
   * @return assetTypeIdAssetType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public AssetType getAssetTypeIdAssetType() {
    return assetTypeIdAssetType;
  }

  public void setAssetTypeIdAssetType(AssetType assetTypeIdAssetType) {
    this.assetTypeIdAssetType = assetTypeIdAssetType;
  }

  public AssetTypeHasAssetType assetTypeIdAssetType1(AssetType assetTypeIdAssetType1) {
    this.assetTypeIdAssetType1 = assetTypeIdAssetType1;
    return this;
  }

  /**
   * Get assetTypeIdAssetType1
   * @return assetTypeIdAssetType1
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public AssetType getAssetTypeIdAssetType1() {
    return assetTypeIdAssetType1;
  }

  public void setAssetTypeIdAssetType1(AssetType assetTypeIdAssetType1) {
    this.assetTypeIdAssetType1 = assetTypeIdAssetType1;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetTypeHasAssetType assetTypeHasAssetType = (AssetTypeHasAssetType) o;
    return Objects.equals(this.assetTypeIdAssetType, assetTypeHasAssetType.assetTypeIdAssetType) &&
        Objects.equals(this.assetTypeIdAssetType1, assetTypeHasAssetType.assetTypeIdAssetType1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetTypeIdAssetType, assetTypeIdAssetType1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetTypeHasAssetType {\n");
    
    sb.append("    assetTypeIdAssetType: ").append(toIndentedString(assetTypeIdAssetType)).append("\n");
    sb.append("    assetTypeIdAssetType1: ").append(toIndentedString(assetTypeIdAssetType1)).append("\n");
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
