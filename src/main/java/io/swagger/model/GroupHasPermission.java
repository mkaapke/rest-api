package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Group;
import io.swagger.model.Permission;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GroupHasPermission
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-01T12:06:10.099Z[GMT]")
public class GroupHasPermission   {
  @JsonProperty("Group_idGroup")
  private Group groupIdGroup = null;

  @JsonProperty("Permission_idPermission")
  private Permission permissionIdPermission = null;

  public GroupHasPermission groupIdGroup(Group groupIdGroup) {
    this.groupIdGroup = groupIdGroup;
    return this;
  }

  /**
   * Get groupIdGroup
   * @return groupIdGroup
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Group getGroupIdGroup() {
    return groupIdGroup;
  }

  public void setGroupIdGroup(Group groupIdGroup) {
    this.groupIdGroup = groupIdGroup;
  }

  public GroupHasPermission permissionIdPermission(Permission permissionIdPermission) {
    this.permissionIdPermission = permissionIdPermission;
    return this;
  }

  /**
   * Get permissionIdPermission
   * @return permissionIdPermission
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Permission getPermissionIdPermission() {
    return permissionIdPermission;
  }

  public void setPermissionIdPermission(Permission permissionIdPermission) {
    this.permissionIdPermission = permissionIdPermission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupHasPermission groupHasPermission = (GroupHasPermission) o;
    return Objects.equals(this.groupIdGroup, groupHasPermission.groupIdGroup) &&
        Objects.equals(this.permissionIdPermission, groupHasPermission.permissionIdPermission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupIdGroup, permissionIdPermission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupHasPermission {\n");
    
    sb.append("    groupIdGroup: ").append(toIndentedString(groupIdGroup)).append("\n");
    sb.append("    permissionIdPermission: ").append(toIndentedString(permissionIdPermission)).append("\n");
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
