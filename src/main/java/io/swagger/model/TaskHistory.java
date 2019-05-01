package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Task;
import io.swagger.model.User;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaskHistory
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-01T12:06:10.099Z[GMT]")
public class TaskHistory   {
  @JsonProperty("idTaskHistory")
  private Integer idTaskHistory = null;

  @JsonProperty("timestamp")
  private Integer timestamp = null;

  @JsonProperty("sourceTaskState")
  private String sourceTaskState = null;

  @JsonProperty("targetTaskState")
  private String targetTaskState = null;

  @JsonProperty("Task_idTask")
  private Task taskIdTask = null;

  @JsonProperty("User_idUser")
  private User userIdUser = null;

  public TaskHistory idTaskHistory(Integer idTaskHistory) {
    this.idTaskHistory = idTaskHistory;
    return this;
  }

  /**
   * Get idTaskHistory
   * @return idTaskHistory
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull

  public Integer getIdTaskHistory() {
    return idTaskHistory;
  }

  public void setIdTaskHistory(Integer idTaskHistory) {
    this.idTaskHistory = idTaskHistory;
  }

  public TaskHistory timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "20181224201500", required = true, value = "")
  @NotNull

  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public TaskHistory sourceTaskState(String sourceTaskState) {
    this.sourceTaskState = sourceTaskState;
    return this;
  }

  /**
   * Get sourceTaskState
   * @return sourceTaskState
  **/
  @ApiModelProperty(example = "unfertig", required = true, value = "")
  @NotNull

  public String getSourceTaskState() {
    return sourceTaskState;
  }

  public void setSourceTaskState(String sourceTaskState) {
    this.sourceTaskState = sourceTaskState;
  }

  public TaskHistory targetTaskState(String targetTaskState) {
    this.targetTaskState = targetTaskState;
    return this;
  }

  /**
   * Get targetTaskState
   * @return targetTaskState
  **/
  @ApiModelProperty(example = "fertig", required = true, value = "")
  @NotNull

  public String getTargetTaskState() {
    return targetTaskState;
  }

  public void setTargetTaskState(String targetTaskState) {
    this.targetTaskState = targetTaskState;
  }

  public TaskHistory taskIdTask(Task taskIdTask) {
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

  public TaskHistory userIdUser(User userIdUser) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskHistory taskHistory = (TaskHistory) o;
    return Objects.equals(this.idTaskHistory, taskHistory.idTaskHistory) &&
        Objects.equals(this.timestamp, taskHistory.timestamp) &&
        Objects.equals(this.sourceTaskState, taskHistory.sourceTaskState) &&
        Objects.equals(this.targetTaskState, taskHistory.targetTaskState) &&
        Objects.equals(this.taskIdTask, taskHistory.taskIdTask) &&
        Objects.equals(this.userIdUser, taskHistory.userIdUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTaskHistory, timestamp, sourceTaskState, targetTaskState, taskIdTask, userIdUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskHistory {\n");
    
    sb.append("    idTaskHistory: ").append(toIndentedString(idTaskHistory)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    sourceTaskState: ").append(toIndentedString(sourceTaskState)).append("\n");
    sb.append("    targetTaskState: ").append(toIndentedString(targetTaskState)).append("\n");
    sb.append("    taskIdTask: ").append(toIndentedString(taskIdTask)).append("\n");
    sb.append("    userIdUser: ").append(toIndentedString(userIdUser)).append("\n");
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
