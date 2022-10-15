package at.fhtw.swen3.persistence.entity;

import at.fhtw.swen3.services.dto.HopArrivalDto;
import at.fhtw.swen3.services.dto.TrackingInformationDto;

import java.util.ArrayList;
import java.util.List;

public class TrackingInformation {
    private TrackingInformationDto.StateEnum state = null;
    private List<HopArrivalDto> visitedHops = new ArrayList<HopArrivalDto>();
    private List<HopArrivalDto> futureHops = new ArrayList<HopArrivalDto>();

    public TrackingInformationDto.StateEnum getState() {
        return state;
    }

    public void setState(TrackingInformationDto.StateEnum state) {
        this.state = state;
    }

    public List<HopArrivalDto> getVisitedHops() {
        return visitedHops;
    }

    public void setVisitedHops(List<HopArrivalDto> visitedHops) {
        this.visitedHops = visitedHops;
    }

    public List<HopArrivalDto> getFutureHops() {
        return futureHops;
    }

    public void setFutureHops(List<HopArrivalDto> futureHops) {
        this.futureHops = futureHops;
    }
}
