package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Position
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-01T12:06:10.099Z[GMT]")
public class Position   {
  @JsonProperty("idPosition")
  private Integer idPosition = null;

  @JsonProperty("building")
  private String building = null;

  @JsonProperty("room")
  private String room = null;

  @JsonProperty("level")
  private String level = null;

  public Position idPosition(Integer idPosition) {
    this.idPosition = idPosition;
    return this;
  }

  /**
   * Get idPosition
   * @return idPosition
  **/
  @ApiModelProperty(example = "5", required = true, value = "")
  @NotNull

  public Integer getIdPosition() {
    return idPosition;
  }

  public void setIdPosition(Integer idPosition) {
    this.idPosition = idPosition;
  }

  public Position building(String building) {
    this.building = building;
    return this;
  }

  /**
   * Get building
   * @return building
  **/
  @ApiModelProperty(example = "geb 5", required = true, value = "")
  @NotNull

  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public Position room(String room) {
    this.room = room;
    return this;
  }

  /**
   * Get room
   * @return room
  **/
  @ApiModelProperty(example = "5a", required = true, value = "")
  @NotNull

  public String getRoom() {
    return room;
  }

  public void setRoom(String room) {
    this.room = room;
  }

  public Position level(String level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(example = "10", required = true, value = "")
  @NotNull

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Position position = (Position) o;
    return Objects.equals(this.idPosition, position.idPosition) &&
        Objects.equals(this.building, position.building) &&
        Objects.equals(this.room, position.room) &&
        Objects.equals(this.level, position.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPosition, building, room, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    
    sb.append("    idPosition: ").append(toIndentedString(idPosition)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
