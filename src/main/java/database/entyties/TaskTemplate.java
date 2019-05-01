package database.entyties;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TaskTemplate {
    private int idTaskTemplate;
    private String type;
    private Integer repeat;
    private String taskType;
    private int assetTypeIdAssetType;

    @Id
    @Column(name = "idTaskTemplate", nullable = false)
    public int getIdTaskTemplate() {
        return idTaskTemplate;
    }

    public void setIdTaskTemplate(int idTaskTemplate) {
        this.idTaskTemplate = idTaskTemplate;
    }

    @Basic
    @Column(name = "type", nullable = false, length = 45)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "repeat", nullable = true)
    public Integer getRepeat() {
        return repeat;
    }

    public void setRepeat(Integer repeat) {
        this.repeat = repeat;
    }

    @Basic
    @Column(name = "taskType", nullable = true, length = 45)
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    @Basic
    @Column(name = "AssetType_idAssetType", nullable = false)
    public int getAssetTypeIdAssetType() {
        return assetTypeIdAssetType;
    }

    public void setAssetTypeIdAssetType(int assetTypeIdAssetType) {
        this.assetTypeIdAssetType = assetTypeIdAssetType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskTemplate that = (TaskTemplate) o;

        if (idTaskTemplate != that.idTaskTemplate) return false;
        if (assetTypeIdAssetType != that.assetTypeIdAssetType) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (repeat != null ? !repeat.equals(that.repeat) : that.repeat != null) return false;
        if (taskType != null ? !taskType.equals(that.taskType) : that.taskType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTaskTemplate;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (repeat != null ? repeat.hashCode() : 0);
        result = 31 * result + (taskType != null ? taskType.hashCode() : 0);
        result = 31 * result + assetTypeIdAssetType;
        return result;
    }
}
