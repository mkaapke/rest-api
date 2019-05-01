package database.entyties;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Checkpoints {
    private int idCheckpoints;
    private String name;
    private String value;
    private String description;
    private String type;
    private String defaultValue;
    private int assetTypeIdAssetType;
    private int taskTemplateIdTaskTemplate;
    private int taskIdTask;

    @Id
    @Column(name = "idCheckpoints", nullable = false)
    public int getIdCheckpoints() {
        return idCheckpoints;
    }

    public void setIdCheckpoints(int idCheckpoints) {
        this.idCheckpoints = idCheckpoints;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "value", nullable = true, length = 45)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 45)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "defaultValue", nullable = true, length = 45)
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Basic
    @Column(name = "AssetType_idAssetType", nullable = false)
    public int getAssetTypeIdAssetType() {
        return assetTypeIdAssetType;
    }

    public void setAssetTypeIdAssetType(int assetTypeIdAssetType) {
        this.assetTypeIdAssetType = assetTypeIdAssetType;
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
    @Column(name = "Task_idTask", nullable = false)
    public int getTaskIdTask() {
        return taskIdTask;
    }

    public void setTaskIdTask(int taskIdTask) {
        this.taskIdTask = taskIdTask;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Checkpoints that = (Checkpoints) o;

        if (idCheckpoints != that.idCheckpoints) return false;
        if (assetTypeIdAssetType != that.assetTypeIdAssetType) return false;
        if (taskTemplateIdTaskTemplate != that.taskTemplateIdTaskTemplate) return false;
        if (taskIdTask != that.taskIdTask) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (defaultValue != null ? !defaultValue.equals(that.defaultValue) : that.defaultValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCheckpoints;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (defaultValue != null ? defaultValue.hashCode() : 0);
        result = 31 * result + assetTypeIdAssetType;
        result = 31 * result + taskTemplateIdTaskTemplate;
        result = 31 * result + taskIdTask;
        return result;
    }
}
