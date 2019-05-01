package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssetType;
import io.swagger.model.MultimediaFile;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MultimediaFileHasAssetType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-01T12:06:10.099Z[GMT]")
public class MultimediaFileHasAssetType   {
  @JsonProperty("MultimediaFile_idMultimediaFile")
  private MultimediaFile multimediaFileIdMultimediaFile = null;

  @JsonProperty("AssetType_idAssetType")
  private AssetType assetTypeIdAssetType = null;

  public MultimediaFileHasAssetType multimediaFileIdMultimediaFile(MultimediaFile multimediaFileIdMultimediaFile) {
    this.multimediaFileIdMultimediaFile = multimediaFileIdMultimediaFile;
    return this;
  }

  /**
   * Get multimediaFileIdMultimediaFile
   * @return multimediaFileIdMultimediaFile
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public MultimediaFile getMultimediaFileIdMultimediaFile() {
    return multimediaFileIdMultimediaFile;
  }

  public void setMultimediaFileIdMultimediaFile(MultimediaFile multimediaFileIdMultimediaFile) {
    this.multimediaFileIdMultimediaFile = multimediaFileIdMultimediaFile;
  }

  public MultimediaFileHasAssetType assetTypeIdAssetType(AssetType assetTypeIdAssetType) {
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
    MultimediaFileHasAssetType multimediaFileHasAssetType = (MultimediaFileHasAssetType) o;
    return Objects.equals(this.multimediaFileIdMultimediaFile, multimediaFileHasAssetType.multimediaFileIdMultimediaFile) &&
        Objects.equals(this.assetTypeIdAssetType, multimediaFileHasAssetType.assetTypeIdAssetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multimediaFileIdMultimediaFile, assetTypeIdAssetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultimediaFileHasAssetType {\n");
    
    sb.append("    multimediaFileIdMultimediaFile: ").append(toIndentedString(multimediaFileIdMultimediaFile)).append("\n");
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
