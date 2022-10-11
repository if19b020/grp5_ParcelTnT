package at.fhtw.swen3.services.dto;

import at.fhtw.swen3.persistence.HopArrival;
import at.fhtw.swen3.persistence.entity.TrackingInformation;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;

public class TrackingInformationDto {

    private TrackingInformation.StateEnum state = null;
    private List<HopArrival> visitedHops = new ArrayList<HopArrival>();
    private List<HopArrival> futureHops = new ArrayList<HopArrival>();
}
