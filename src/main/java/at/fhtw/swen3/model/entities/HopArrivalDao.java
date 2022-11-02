package at.fhtw.swen3.model.entities;

import lombok.Getter;
import lombok.Setter;
import org.threeten.bp.OffsetDateTime;

//import javax.persistence.*;

@Getter
@Setter
//@Entity
public class HopArrivalDao {
    //@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column
    private String code = null;
    //@Column
    private String description = null;
    //@Column
    private OffsetDateTime dateTime = null;
}