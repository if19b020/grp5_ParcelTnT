package at.fhtw.swen3.persistence;

import javax.validation.constraints.Pattern;

public class Recipient {
    @Pattern(regexp = "^[A-Z][A-Za-z-]+$")
    private String name = null;
    @Pattern(regexp = "^[A-Za-z\\u00c4\\u00e4\\u00d6\\u00f6\\u00dc\\u00fc\\u00df]+\\s[0-9][A-Za-z0-9/]+$") // also match umlaut and ß
    private String street = null;
    @Pattern(regexp = "^A-[0-9]{4}$")
    private String postalCode = null;
    @Pattern(regexp = "^[A-Z][A-Za-z]+$")
    private String city = null;
    private String country = null;
}
