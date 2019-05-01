package database.entyties;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class GroupHasPermissionPK implements Serializable {
    private int groupIdGroup;
    private int permissionIdPermission;

    @Column(name = "Group_idGroup", nullable = false)
    @Id
    public int getGroupIdGroup() {
        return groupIdGroup;
    }

    public void setGroupIdGroup(int groupIdGroup) {
        this.groupIdGroup = groupIdGroup;
    }

    @Column(name = "Permission_idPermission", nullable = false)
    @Id
    public int getPermissionIdPermission() {
        return permissionIdPermission;
    }

    public void setPermissionIdPermission(int permissionIdPermission) {
        this.permissionIdPermission = permissionIdPermission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupHasPermissionPK that = (GroupHasPermissionPK) o;

        if (groupIdGroup != that.groupIdGroup) return false;
        if (permissionIdPermission != that.permissionIdPermission) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = groupIdGroup;
        result = 31 * result + permissionIdPermission;
        return result;
    }
}
