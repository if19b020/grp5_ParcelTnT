package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.HopArrivalDto;
import at.fhtw.swen3.persistence.HopArrival;
import org.mapstruct.factory.Mappers;

public interface HopArrivalMapper {
    HopArrivalMapper INSTANCE = Mappers.getMapper(HopArrivalMapper.class);

    HopArrival entityToDto(HopArrivalDto hopArrival);
    HopArrivalDto DtoToEntity(HopArrival hopArrival);
}
