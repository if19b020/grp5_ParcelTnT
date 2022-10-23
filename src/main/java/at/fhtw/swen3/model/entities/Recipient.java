package at.fhtw.swen3.model.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Recipient {
    private String name = null;
    private String street = null;
    private String postalCode = null;
    private String city = null;
    private String country = null;
}