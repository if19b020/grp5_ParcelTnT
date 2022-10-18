package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.HopArrivalDto;
import at.fhtw.swen3.persistence.HopArrival;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HopArrivalMapper {
    HopArrivalMapper INSTANCE = Mappers.getMapper(HopArrivalMapper.class);

    HopArrival dtoToEntity(HopArrivalDto hopArrival);
    HopArrivalDto entityToDto(HopArrival hopArrival);
}
