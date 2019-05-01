package database.entyties;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MultimediaFile {
    private int idMultimediaFile;
    private String token;
    private String type;
    private String name;
    private Long size;
    private int taskTemplateIdTaskTemplate;
    private int taskIdTask;

    @Id
    @Column(name = "idMultimediaFile", nullable = false)
    public int getIdMultimediaFile() {
        return idMultimediaFile;
    }

    public void setIdMultimediaFile(int idMultimediaFile) {
        this.idMultimediaFile = idMultimediaFile;
    }

    @Basic
    @Column(name = "token", nullable = true, length = 45)
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "size", nullable = true)
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
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

        MultimediaFile that = (MultimediaFile) o;

        if (idMultimediaFile != that.idMultimediaFile) return false;
        if (taskTemplateIdTaskTemplate != that.taskTemplateIdTaskTemplate) return false;
        if (taskIdTask != that.taskIdTask) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMultimediaFile;
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + taskTemplateIdTaskTemplate;
        result = 31 * result + taskIdTask;
        return result;
    }
}
