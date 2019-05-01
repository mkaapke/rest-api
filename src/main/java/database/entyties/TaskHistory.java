package database.entyties;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class TaskHistory {
    private int idTaskHistory;
    private Timestamp timestamp;
    private String sourceTaskState;
    private String targetTaskState;
    private int taskIdTask;
    private int userIdUser;

    @Id
    @Column(name = "idTaskHistory", nullable = false)
    public int getIdTaskHistory() {
        return idTaskHistory;
    }

    public void setIdTaskHistory(int idTaskHistory) {
        this.idTaskHistory = idTaskHistory;
    }

    @Basic
    @Column(name = "timestamp", nullable = true)
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Basic
    @Column(name = "sourceTaskState", nullable = true, length = 45)
    public String getSourceTaskState() {
        return sourceTaskState;
    }

    public void setSourceTaskState(String sourceTaskState) {
        this.sourceTaskState = sourceTaskState;
    }

    @Basic
    @Column(name = "targetTaskState", nullable = true, length = 45)
    public String getTargetTaskState() {
        return targetTaskState;
    }

    public void setTargetTaskState(String targetTaskState) {
        this.targetTaskState = targetTaskState;
    }

    @Basic
    @Column(name = "Task_idTask", nullable = false)
    public int getTaskIdTask() {
        return taskIdTask;
    }

    public void setTaskIdTask(int taskIdTask) {
        this.taskIdTask = taskIdTask;
    }

    @Basic
    @Column(name = "User_idUser", nullable = false)
    public int getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(int userIdUser) {
        this.userIdUser = userIdUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskHistory that = (TaskHistory) o;

        if (idTaskHistory != that.idTaskHistory) return false;
        if (taskIdTask != that.taskIdTask) return false;
        if (userIdUser != that.userIdUser) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;
        if (sourceTaskState != null ? !sourceTaskState.equals(that.sourceTaskState) : that.sourceTaskState != null)
            return false;
        if (targetTaskState != null ? !targetTaskState.equals(that.targetTaskState) : that.targetTaskState != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTaskHistory;
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (sourceTaskState != null ? sourceTaskState.hashCode() : 0);
        result = 31 * result + (targetTaskState != null ? targetTaskState.hashCode() : 0);
        result = 31 * result + taskIdTask;
        result = 31 * result + userIdUser;
        return result;
    }
}
