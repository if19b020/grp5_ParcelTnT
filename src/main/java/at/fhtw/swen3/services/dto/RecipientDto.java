package at.fhtw.swen3.services.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Recipient
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-24T14:06:20.958Z[GMT]")


public class RecipientDto {
  @JsonProperty("name")
  @Pattern(regexp = "^[A-Z][A-Za-z-]+$")
  private String name = null;

  @JsonProperty("street")
  @Pattern(regexp = "^[A-Za-z\\u00c4\\u00e4\\u00d6\\u00f6\\u00dc\\u00fc\\u00df]+\\s[0-9][A-Za-z0-9/]+$") // also match umlaut and ß
  private String street = null;

  @JsonProperty("postalCode")
  @Pattern(regexp = "^A-[0-9]{4}$")
  private String postalCode = null;

  @JsonProperty("city")
  @Pattern(regexp = "^[A-Z][A-Za-z]+$")
  private String city = null;

  @JsonProperty("country")
  private String country = null;

  public RecipientDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of person or company.
   * @return name
   **/
  @Schema(required = true, description = "Name of person or company.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RecipientDto street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Street
   * @return street
   **/
  @Schema(required = true, description = "Street")
      @NotNull

    public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public RecipientDto postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postalcode
   * @return postalCode
   **/
  @Schema(required = true, description = "Postalcode")
      @NotNull

    public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public RecipientDto city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City
   * @return city
   **/
  @Schema(required = true, description = "City")
      @NotNull

    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public RecipientDto country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country
   * @return country
   **/
  @Schema(required = true, description = "Country")
      @NotNull

    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientDto recipient = (RecipientDto) o;
    return Objects.equals(this.name, recipient.name) &&
        Objects.equals(this.street, recipient.street) &&
        Objects.equals(this.postalCode, recipient.postalCode) &&
        Objects.equals(this.city, recipient.city) &&
        Objects.equals(this.country, recipient.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, street, postalCode, city, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipient {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
