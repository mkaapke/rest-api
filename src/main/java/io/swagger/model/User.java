package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Group;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-01T12:06:10.099Z[GMT]")
public class User   {
  @JsonProperty("idUser")
  private Integer idUser = null;

  @JsonProperty("forename")
  private String forename = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("department")
  private String department = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("personalID")
  private String personalID = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("Group_idGroup")
  private Group groupIdGroup = null;

  public User idUser(Integer idUser) {
    this.idUser = idUser;
    return this;
  }

  /**
   * Get idUser
   * @return idUser
  **/
  @ApiModelProperty(example = "150", required = true, value = "")
  @NotNull

  public Integer getIdUser() {
    return idUser;
  }

  public void setIdUser(Integer idUser) {
    this.idUser = idUser;
  }

  public User forename(String forename) {
    this.forename = forename;
    return this;
  }

  /**
   * Get forename
   * @return forename
  **/
  @ApiModelProperty(example = "Max", required = true, value = "")
  @NotNull

  public String getForename() {
    return forename;
  }

  public void setForename(String forename) {
    this.forename = forename;
  }

  public User surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  **/
  @ApiModelProperty(example = "Mustermann", required = true, value = "")
  @NotNull

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public User department(String department) {
    this.department = department;
    return this;
  }

  /**
   * Get department
   * @return department
  **/
  @ApiModelProperty(example = "IT", required = true, value = "")
  @NotNull

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(example = "Pswd123!", required = true, value = "")
  @NotNull

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User personalID(String personalID) {
    this.personalID = personalID;
    return this;
  }

  /**
   * Get personalID
   * @return personalID
  **/
  @ApiModelProperty(example = "it-5", required = true, value = "")
  @NotNull

  public String getPersonalID() {
    return personalID;
  }

  public void setPersonalID(String personalID) {
    this.personalID = personalID;
  }

  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "+49 151 2222 222", required = true, value = "")
  @NotNull

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "max.mustermann@gmail.com", required = true, value = "")
  @NotNull

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User groupIdGroup(Group groupIdGroup) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.idUser, user.idUser) &&
        Objects.equals(this.forename, user.forename) &&
        Objects.equals(this.surname, user.surname) &&
        Objects.equals(this.department, user.department) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.personalID, user.personalID) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.groupIdGroup, user.groupIdGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUser, forename, surname, department, password, personalID, phone, email, groupIdGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
    sb.append("    forename: ").append(toIndentedString(forename)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    personalID: ").append(toIndentedString(personalID)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    groupIdGroup: ").append(toIndentedString(groupIdGroup)).append("\n");
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
