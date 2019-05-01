package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssetType;
import io.swagger.model.Position;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Asset
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-01T12:06:10.099Z[GMT]")
public class Asset   {
  @JsonProperty("idAsset")
  private Integer idAsset = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("inspected")
  private Boolean inspected = null;

  @JsonProperty("operative")
  private Boolean operative = null;

  @JsonProperty("Position_idPosition")
  private Position positionIdPosition = null;

  @JsonProperty("AssetType_idAssetType")
  private AssetType assetTypeIdAssetType = null;

  public Asset idAsset(Integer idAsset) {
    this.idAsset = idAsset;
    return this;
  }

  /**
   * Get idAsset
   * @return idAsset
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull

  public Integer getIdAsset() {
    return idAsset;
  }

  public void setIdAsset(Integer idAsset) {
    this.idAsset = idAsset;
  }

  public Asset name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Bett", required = true, value = "")
  @NotNull

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Asset inspected(Boolean inspected) {
    this.inspected = inspected;
    return this;
  }

  /**
   * Get inspected
   * @return inspected
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
  @NotNull

  public Boolean isInspected() {
    return inspected;
  }

  public void setInspected(Boolean inspected) {
    this.inspected = inspected;
  }

  public Asset operative(Boolean operative) {
    this.operative = operative;
    return this;
  }

  /**
   * Get operative
   * @return operative
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  @NotNull

  public Boolean isOperative() {
    return operative;
  }

  public void setOperative(Boolean operative) {
    this.operative = operative;
  }

  public Asset positionIdPosition(Position positionIdPosition) {
    this.positionIdPosition = positionIdPosition;
    return this;
  }

  /**
   * Get positionIdPosition
   * @return positionIdPosition
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Position getPositionIdPosition() {
    return positionIdPosition;
  }

  public void setPositionIdPosition(Position positionIdPosition) {
    this.positionIdPosition = positionIdPosition;
  }

  public Asset assetTypeIdAssetType(AssetType assetTypeIdAssetType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Asset asset = (Asset) o;
    return Objects.equals(this.idAsset, asset.idAsset) &&
        Objects.equals(this.name, asset.name) &&
        Objects.equals(this.inspected, asset.inspected) &&
        Objects.equals(this.operative, asset.operative) &&
        Objects.equals(this.positionIdPosition, asset.positionIdPosition) &&
        Objects.equals(this.assetTypeIdAssetType, asset.assetTypeIdAssetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAsset, name, inspected, operative, positionIdPosition, assetTypeIdAssetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asset {\n");
    
    sb.append("    idAsset: ").append(toIndentedString(idAsset)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inspected: ").append(toIndentedString(inspected)).append("\n");
    sb.append("    operative: ").append(toIndentedString(operative)).append("\n");
    sb.append("    positionIdPosition: ").append(toIndentedString(positionIdPosition)).append("\n");
    sb.append("    assetTypeIdAssetType: ").append(toIndentedString(assetTypeIdAssetType)).append("\n");
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
