package at.fhtw.swen3.model.entities;

import lombok.Getter;
import lombok.Setter;
import org.threeten.bp.OffsetDateTime;

@Getter
@Setter
public class HopArrival {
    private String code = null;
    private String description = null;
    private OffsetDateTime dateTime = null;
}