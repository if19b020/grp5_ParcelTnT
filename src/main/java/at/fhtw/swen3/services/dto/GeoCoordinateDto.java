package at.fhtw.swen3.services.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * GeoCoordinate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-24T14:06:20.958Z[GMT]")


public class GeoCoordinateDto {
  @JsonProperty("lat")
  private Double lat = null;

  @JsonProperty("lon")
  private Double lon = null;

  public GeoCoordinateDto lat(Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * Latitude of the coordinate.
   * @return lat
   **/
  @Schema(required = true, description = "Latitude of the coordinate.")
      @NotNull

    public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public GeoCoordinateDto lon(Double lon) {
    this.lon = lon;
    return this;
  }

  /**
   * Longitude of the coordinate.
   * @return lon
   **/
  @Schema(required = true, description = "Longitude of the coordinate.")
      @NotNull

    public Double getLon() {
    return lon;
  }

  public void setLon(Double lon) {
    this.lon = lon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoCoordinateDto geoCoordinate = (GeoCoordinateDto) o;
    return Objects.equals(this.lat, geoCoordinate.lat) &&
        Objects.equals(this.lon, geoCoordinate.lon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoCoordinate {\n");
    
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
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
