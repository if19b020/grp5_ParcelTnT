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

    public TrackingInformation.StateEnum getState() {
        return state;
    }

    public void setState(TrackingInformation.StateEnum state) {
        this.state = state;
    }

    public List<HopArrival> getVisitedHops() {
        return visitedHops;
    }

    public void setVisitedHops(List<HopArrival> visitedHops) {
        this.visitedHops = visitedHops;
    }

    public List<HopArrival> getFutureHops() {
        return futureHops;
    }

    public void setFutureHops(List<HopArrival> futureHops) {
        this.futureHops = futureHops;
    }
}
