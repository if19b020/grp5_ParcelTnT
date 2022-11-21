package at.fhtw.swen3.persistence.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Getter
@Setter
//@Entity
//@Table(name = "error")
public class ErrorEntity {
    //@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String errorMessage = null;

}
