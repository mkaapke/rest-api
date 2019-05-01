package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Task;
import io.swagger.model.TaskTemplate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MultimediaFile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-01T12:06:10.099Z[GMT]")
public class MultimediaFile   {
  @JsonProperty("idMultimediaFile")
  private Integer idMultimediaFile = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("TaskTemplate_idTaskTemplate")
  private TaskTemplate taskTemplateIdTaskTemplate = null;

  @JsonProperty("Task_idTask")
  private Task taskIdTask = null;

  public MultimediaFile idMultimediaFile(Integer idMultimediaFile) {
    this.idMultimediaFile = idMultimediaFile;
    return this;
  }

  /**
   * Get idMultimediaFile
   * @return idMultimediaFile
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull

  public Integer getIdMultimediaFile() {
    return idMultimediaFile;
  }

  public void setIdMultimediaFile(Integer idMultimediaFile) {
    this.idMultimediaFile = idMultimediaFile;
  }

  public MultimediaFile token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(example = "ftp://myfileserver/example.jpg", required = true, value = "")
  @NotNull

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public MultimediaFile type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "img", required = true, value = "")
  @NotNull

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MultimediaFile name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "example.jpg", required = true, value = "")
  @NotNull

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MultimediaFile size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "2048", required = true, value = "")
  @NotNull

  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public MultimediaFile taskTemplateIdTaskTemplate(TaskTemplate taskTemplateIdTaskTemplate) {
    this.taskTemplateIdTaskTemplate = taskTemplateIdTaskTemplate;
    return this;
  }

  /**
   * Get taskTemplateIdTaskTemplate
   * @return taskTemplateIdTaskTemplate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public TaskTemplate getTaskTemplateIdTaskTemplate() {
    return taskTemplateIdTaskTemplate;
  }

  public void setTaskTemplateIdTaskTemplate(TaskTemplate taskTemplateIdTaskTemplate) {
    this.taskTemplateIdTaskTemplate = taskTemplateIdTaskTemplate;
  }

  public MultimediaFile taskIdTask(Task taskIdTask) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultimediaFile multimediaFile = (MultimediaFile) o;
    return Objects.equals(this.idMultimediaFile, multimediaFile.idMultimediaFile) &&
        Objects.equals(this.token, multimediaFile.token) &&
        Objects.equals(this.type, multimediaFile.type) &&
        Objects.equals(this.name, multimediaFile.name) &&
        Objects.equals(this.size, multimediaFile.size) &&
        Objects.equals(this.taskTemplateIdTaskTemplate, multimediaFile.taskTemplateIdTaskTemplate) &&
        Objects.equals(this.taskIdTask, multimediaFile.taskIdTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idMultimediaFile, token, type, name, size, taskTemplateIdTaskTemplate, taskIdTask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultimediaFile {\n");
    
    sb.append("    idMultimediaFile: ").append(toIndentedString(idMultimediaFile)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    taskTemplateIdTaskTemplate: ").append(toIndentedString(taskTemplateIdTaskTemplate)).append("\n");
    sb.append("    taskIdTask: ").append(toIndentedString(taskIdTask)).append("\n");
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
