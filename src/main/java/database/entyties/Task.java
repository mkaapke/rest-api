package database.entyties;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Task {
    private int idTask;
    private String title;
    private Timestamp startDate;
    private Timestamp finishDate;
    private String state;
    private int taskTemplateIdTaskTemplate;
    private int positionIdPosition;
    private int userIdUser;
    private int assetIdAsset;

    @Id
    @Column(name = "idTask", nullable = false)
    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 45)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "startDate", nullable = true)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "finishDate", nullable = true)
    public Timestamp getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Timestamp finishDate) {
        this.finishDate = finishDate;
    }

    @Basic
    @Column(name = "state", nullable = true, length = 45)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "TaskTemplate_idTaskTemplate", nullable = false)
    public int getTaskTemplateIdTaskTemplate() {
        return taskTemplateIdTaskTemplate;
    }

    public void setTaskTemplateIdTaskTemplate(int taskTemplateIdTaskTemplate) {
        this.taskTemplateIdTaskTemplate = taskTemplateIdTaskTemplate;
    }

    @Basic
    @Column(name = "Position_idPosition", nullable = false)
    public int getPositionIdPosition() {
        return positionIdPosition;
    }

    public void setPositionIdPosition(int positionIdPosition) {
        this.positionIdPosition = positionIdPosition;
    }

    @Basic
    @Column(name = "User_idUser", nullable = false)
    public int getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(int userIdUser) {
        this.userIdUser = userIdUser;
    }

    @Basic
    @Column(name = "Asset_idAsset", nullable = false)
    public int getAssetIdAsset() {
        return assetIdAsset;
    }

    public void setAssetIdAsset(int assetIdAsset) {
        this.assetIdAsset = assetIdAsset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (idTask != task.idTask) return false;
        if (taskTemplateIdTaskTemplate != task.taskTemplateIdTaskTemplate) return false;
        if (positionIdPosition != task.positionIdPosition) return false;
        if (userIdUser != task.userIdUser) return false;
        if (assetIdAsset != task.assetIdAsset) return false;
        if (title != null ? !title.equals(task.title) : task.title != null) return false;
        if (startDate != null ? !startDate.equals(task.startDate) : task.startDate != null) return false;
        if (finishDate != null ? !finishDate.equals(task.finishDate) : task.finishDate != null) return false;
        if (state != null ? !state.equals(task.state) : task.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTask;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (finishDate != null ? finishDate.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + taskTemplateIdTaskTemplate;
        result = 31 * result + positionIdPosition;
        result = 31 * result + userIdUser;
        result = 31 * result + assetIdAsset;
        return result;
    }
}
