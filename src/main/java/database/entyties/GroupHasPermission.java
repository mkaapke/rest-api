package database.entyties;

import javax.persistence.*;

@Entity
@Table(name = "Group_has_Permission", schema = "swtpj", catalog = "")
@IdClass(GroupHasPermissionPK.class)
public class GroupHasPermission {
    private int groupIdGroup;
    private int permissionIdPermission;

    @Id
    @Column(name = "Group_idGroup", nullable = false)
    public int getGroupIdGroup() {
        return groupIdGroup;
    }

    public void setGroupIdGroup(int groupIdGroup) {
        this.groupIdGroup = groupIdGroup;
    }

    @Id
    @Column(name = "Permission_idPermission", nullable = false)
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

        GroupHasPermission that = (GroupHasPermission) o;

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
