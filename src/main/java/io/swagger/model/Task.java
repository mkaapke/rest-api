package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Asset;
import io.swagger.model.Position;
import io.swagger.model.TaskTemplate;
import io.swagger.model.User;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Task
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-01T12:06:10.099Z[GMT]")
public class Task   {
  @JsonProperty("idTask")
  private Integer idTask = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("startDate")
  private Integer startDate = null;

  @JsonProperty("finishDate")
  private Integer finishDate = null;

  @JsonProperty("TaskTemplate_idTaskTemplate")
  private TaskTemplate taskTemplateIdTaskTemplate = null;

  @JsonProperty("User_idUser")
  private User userIdUser = null;

  @JsonProperty("Position_idPosition")
  private Position positionIdPosition = null;

  @JsonProperty("Asset_idAsset")
  private Asset assetIdAsset = null;

  public Task idTask(Integer idTask) {
    this.idTask = idTask;
    return this;
  }

  /**
   * Get idTask
   * @return idTask
  **/
  @ApiModelProperty(example = "10", required = true, value = "")
  @NotNull

  public Integer getIdTask() {
    return idTask;
  }

  public void setIdTask(Integer idTask) {
    this.idTask = idTask;
  }

  public Task title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "Bett schieben nach...", required = true, value = "")
  @NotNull

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Task startDate(Integer startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public Integer getStartDate() {
    return startDate;
  }

  public void setStartDate(Integer startDate) {
    this.startDate = startDate;
  }

  public Task finishDate(Integer finishDate) {
    this.finishDate = finishDate;
    return this;
  }

  /**
   * Get finishDate
   * @return finishDate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public Integer getFinishDate() {
    return finishDate;
  }

  public void setFinishDate(Integer finishDate) {
    this.finishDate = finishDate;
  }

  public Task taskTemplateIdTaskTemplate(TaskTemplate taskTemplateIdTaskTemplate) {
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

  public Task userIdUser(User userIdUser) {
    this.userIdUser = userIdUser;
    return this;
  }

  /**
   * Get userIdUser
   * @return userIdUser
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public User getUserIdUser() {
    return userIdUser;
  }

  public void setUserIdUser(User userIdUser) {
    this.userIdUser = userIdUser;
  }

  public Task positionIdPosition(Position positionIdPosition) {
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

  public Task assetIdAsset(Asset assetIdAsset) {
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
    Task task = (Task) o;
    return Objects.equals(this.idTask, task.idTask) &&
        Objects.equals(this.title, task.title) &&
        Objects.equals(this.startDate, task.startDate) &&
        Objects.equals(this.finishDate, task.finishDate) &&
        Objects.equals(this.taskTemplateIdTaskTemplate, task.taskTemplateIdTaskTemplate) &&
        Objects.equals(this.userIdUser, task.userIdUser) &&
        Objects.equals(this.positionIdPosition, task.positionIdPosition) &&
        Objects.equals(this.assetIdAsset, task.assetIdAsset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTask, title, startDate, finishDate, taskTemplateIdTaskTemplate, userIdUser, positionIdPosition, assetIdAsset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    idTask: ").append(toIndentedString(idTask)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
    sb.append("    taskTemplateIdTaskTemplate: ").append(toIndentedString(taskTemplateIdTaskTemplate)).append("\n");
    sb.append("    userIdUser: ").append(toIndentedString(userIdUser)).append("\n");
    sb.append("    positionIdPosition: ").append(toIndentedString(positionIdPosition)).append("\n");
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
