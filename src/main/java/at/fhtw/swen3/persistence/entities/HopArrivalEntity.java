package at.fhtw.swen3.persistence.entities;

import lombok.Getter;
import lombok.Setter;
import org.threeten.bp.OffsetDateTime;

import javax.validation.constraints.Pattern;

@Getter
@Setter
public class HopArrivalEntity {
    @Pattern(regexp = "^[A-Z0-9]{9}$")
    private String code = null;
    @Pattern(regexp = "^[A-Za-z]+[0-9-]+$")
    private String description = null;
    private OffsetDateTime dateTime = null;
}
