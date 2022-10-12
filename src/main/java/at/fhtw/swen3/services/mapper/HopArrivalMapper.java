package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.HopArrival;
import at.fhtw.swen3.services.dto.HopArrivalDto;
import org.mapstruct.factory.Mappers;

public interface HopArrivalMapper {
    HopArrivalMapper INSTANCE = Mappers.getMapper(HopArrivalMapper.class);

    HopArrivalDto entityToDto(HopArrival hopArrival);
    HopArrival DtoToEntity(HopArrivalDto hopArrival);
}
