package at.fhtw.swen3.persistence.entity;

import at.fhtw.swen3.services.dto.HopArrivalDto;
import at.fhtw.swen3.services.dto.RecipientDto;
import at.fhtw.swen3.services.dto.TrackingInformationDto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;
/*
* either all attributes from other classes (Parcel, NewParcelInfo, TrackingInformation (deleted))
* or class that has all other classes
* */
@Getter
@Setter
public class ParcelEntity {
    @Min(value = 1, message = "Weight must be greater than 0")
    private Float weight = null;
    @NotNull
    private RecipientDto recipient = null;
    @NotNull
    private RecipientDto sender = null;

    @Pattern(regexp="^[A-Z0-9]{9}$")
    private String trackingId = null;

    private TrackingInformationDto.StateEnum state = null;
    private List<HopArrivalDto> visitedHops = new ArrayList<HopArrivalDto>();
    private List<HopArrivalDto> futureHops = new ArrayList<HopArrivalDto>();
}
