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
 * TaskTemplate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-01T12:06:10.099Z[GMT]")
public class TaskTemplate   {
  @JsonProperty("idTaskTemplate")
  private Integer idTaskTemplate = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("repeat")
  private Integer repeat = null;

  @JsonProperty("taskType")
  private String taskType = null;

  @JsonProperty("AssetType_idAssetType")
  private AssetType assetTypeIdAssetType = null;

  public TaskTemplate idTaskTemplate(Integer idTaskTemplate) {
    this.idTaskTemplate = idTaskTemplate;
    return this;
  }

  /**
   * Get idTaskTemplate
   * @return idTaskTemplate
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull

  public Integer getIdTaskTemplate() {
    return idTaskTemplate;
  }

  public void setIdTaskTemplate(Integer idTaskTemplate) {
    this.idTaskTemplate = idTaskTemplate;
  }

  public TaskTemplate type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "Pumpenanlage pruefen", required = true, value = "")
  @NotNull

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TaskTemplate repeat(Integer repeat) {
    this.repeat = repeat;
    return this;
  }

  /**
   * Get repeat
   * @return repeat
  **/
  @ApiModelProperty(example = "7", required = true, value = "")
  @NotNull

  public Integer getRepeat() {
    return repeat;
  }

  public void setRepeat(Integer repeat) {
    this.repeat = repeat;
  }

  public TaskTemplate taskType(String taskType) {
    this.taskType = taskType;
    return this;
  }

  /**
   * Get taskType
   * @return taskType
  **/
  @ApiModelProperty(example = "transport", required = true, value = "")
  @NotNull

  public String getTaskType() {
    return taskType;
  }

  public void setTaskType(String taskType) {
    this.taskType = taskType;
  }

  public TaskTemplate assetTypeIdAssetType(AssetType assetTypeIdAssetType) {
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
    TaskTemplate taskTemplate = (TaskTemplate) o;
    return Objects.equals(this.idTaskTemplate, taskTemplate.idTaskTemplate) &&
        Objects.equals(this.type, taskTemplate.type) &&
        Objects.equals(this.repeat, taskTemplate.repeat) &&
        Objects.equals(this.taskType, taskTemplate.taskType) &&
        Objects.equals(this.assetTypeIdAssetType, taskTemplate.assetTypeIdAssetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTaskTemplate, type, repeat, taskType, assetTypeIdAssetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskTemplate {\n");
    
    sb.append("    idTaskTemplate: ").append(toIndentedString(idTaskTemplate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    repeat: ").append(toIndentedString(repeat)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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
