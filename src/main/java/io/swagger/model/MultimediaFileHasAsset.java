package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Asset;
import io.swagger.model.MultimediaFile;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MultimediaFileHasAsset
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-01T12:06:10.099Z[GMT]")
public class MultimediaFileHasAsset   {
  @JsonProperty("MultimediaFile_idMultimediaFile")
  private MultimediaFile multimediaFileIdMultimediaFile = null;

  @JsonProperty("Asset_idAsset")
  private Asset assetIdAsset = null;

  public MultimediaFileHasAsset multimediaFileIdMultimediaFile(MultimediaFile multimediaFileIdMultimediaFile) {
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

  public MultimediaFileHasAsset assetIdAsset(Asset assetIdAsset) {
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
    MultimediaFileHasAsset multimediaFileHasAsset = (MultimediaFileHasAsset) o;
    return Objects.equals(this.multimediaFileIdMultimediaFile, multimediaFileHasAsset.multimediaFileIdMultimediaFile) &&
        Objects.equals(this.assetIdAsset, multimediaFileHasAsset.assetIdAsset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multimediaFileIdMultimediaFile, assetIdAsset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultimediaFileHasAsset {\n");
    
    sb.append("    multimediaFileIdMultimediaFile: ").append(toIndentedString(multimediaFileIdMultimediaFile)).append("\n");
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
