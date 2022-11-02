package at.fhtw.swen3.model.entities;

import lombok.Getter;
import lombok.Setter;

//import javax.persistence.*;

@Getter
@Setter
//@Entity(name="error")
public class ErrorDao {
    //@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column
    private String errorMessage = null;
}