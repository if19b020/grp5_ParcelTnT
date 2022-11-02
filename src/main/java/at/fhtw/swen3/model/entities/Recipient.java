package at.fhtw.swen3.model.entities;

import lombok.Getter;
import lombok.Setter;

//import javax.persistence.*;

@Getter
@Setter
//@Entity
public class Recipient {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column
    private String name = null;
    //@Column
    private String street = null;
    //@Column
    private String postalCode = null;
    //@Column
    private String city = null;
    //@Column
    private String country = null;
}