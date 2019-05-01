package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssetType;
import io.swagger.model.Task;
import io.swagger.model.TaskTemplate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Checkpoints
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-01T12:06:10.099Z[GMT]")
public class Checkpoints   {
  @JsonProperty("idCheckpoints")
  private Integer idCheckpoints = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("defaultValue")
  private String defaultValue = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("AssetType_idAssetType")
  private AssetType assetTypeIdAssetType = null;

  @JsonProperty("Task_idTask")
  private Task taskIdTask = null;

  @JsonProperty("TaskTemplate_idTastTemplate")
  private TaskTemplate taskTemplateIdTastTemplate = null;

  public Checkpoints idCheckpoints(Integer idCheckpoints) {
    this.idCheckpoints = idCheckpoints;
    return this;
  }

  /**
   * Get idCheckpoints
   * @return idCheckpoints
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull

  public Integer getIdCheckpoints() {
    return idCheckpoints;
  }

  public void setIdCheckpoints(Integer idCheckpoints) {
    this.idCheckpoints = idCheckpoints;
  }

  public Checkpoints name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "batterie", required = true, value = "")
  @NotNull

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Checkpoints value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "80%", required = true, value = "")
  @NotNull

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Checkpoints defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Get defaultValue
   * @return defaultValue
  **/
  @ApiModelProperty(example = "100%", required = true, value = "")
  @NotNull

  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public Checkpoints type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "Duracell", required = true, value = "")
  @NotNull

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Checkpoints description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "geprüft am...", required = true, value = "")
  @NotNull

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Checkpoints assetTypeIdAssetType(AssetType assetTypeIdAssetType) {
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

  public Checkpoints taskIdTask(Task taskIdTask) {
    this.taskIdTask = taskIdTask;
    return this;
  }

  /**
   * Get taskIdTask
   * @return taskIdTask
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Task getTaskIdTask() {
    return taskIdTask;
  }

  public void setTaskIdTask(Task taskIdTask) {
    this.taskIdTask = taskIdTask;
  }

  public Checkpoints taskTemplateIdTastTemplate(TaskTemplate taskTemplateIdTastTemplate) {
    this.taskTemplateIdTastTemplate = taskTemplateIdTastTemplate;
    return this;
  }

  /**
   * Get taskTemplateIdTastTemplate
   * @return taskTemplateIdTastTemplate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public TaskTemplate getTaskTemplateIdTastTemplate() {
    return taskTemplateIdTastTemplate;
  }

  public void setTaskTemplateIdTastTemplate(TaskTemplate taskTemplateIdTastTemplate) {
    this.taskTemplateIdTastTemplate = taskTemplateIdTastTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Checkpoints checkpoints = (Checkpoints) o;
    return Objects.equals(this.idCheckpoints, checkpoints.idCheckpoints) &&
        Objects.equals(this.name, checkpoints.name) &&
        Objects.equals(this.value, checkpoints.value) &&
        Objects.equals(this.defaultValue, checkpoints.defaultValue) &&
        Objects.equals(this.type, checkpoints.type) &&
        Objects.equals(this.description, checkpoints.description) &&
        Objects.equals(this.assetTypeIdAssetType, checkpoints.assetTypeIdAssetType) &&
        Objects.equals(this.taskIdTask, checkpoints.taskIdTask) &&
        Objects.equals(this.taskTemplateIdTastTemplate, checkpoints.taskTemplateIdTastTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCheckpoints, name, value, defaultValue, type, description, assetTypeIdAssetType, taskIdTask, taskTemplateIdTastTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Checkpoints {\n");
    
    sb.append("    idCheckpoints: ").append(toIndentedString(idCheckpoints)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    assetTypeIdAssetType: ").append(toIndentedString(assetTypeIdAssetType)).append("\n");
    sb.append("    taskIdTask: ").append(toIndentedString(taskIdTask)).append("\n");
    sb.append("    taskTemplateIdTastTemplate: ").append(toIndentedString(taskTemplateIdTastTemplate)).append("\n");
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
