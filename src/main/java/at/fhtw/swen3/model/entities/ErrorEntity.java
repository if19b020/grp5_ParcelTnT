package at.fhtw.swen3.model.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

//import javax.persistence.*;

@Getter
@Setter
//@Entity(name="error")
public class ErrorEntity {
    //@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column
    private String errorMessage = null;
}

/**
 * @Service
 * mit @Autowired
 * siehe slides
 * für businesslayer und testing
 * + entities mit ...Entity versehen
 * fr oder samstag nochmal checken, punkte
 */
