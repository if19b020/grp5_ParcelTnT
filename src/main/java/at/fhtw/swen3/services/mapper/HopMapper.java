package at.fhtw.swen3.services.mapper;


import at.fhtw.swen3.services.dto.HopDto;
import at.fhtw.swen3.persistence.Hop;
import org.mapstruct.factory.Mappers;

public interface HopMapper {
    HopMapper INSTANCE = Mappers.getMapper(HopMapper.class);

    Hop entityToDto(HopDto hop);
    HopDto DtoToEntity(Hop hop);
}
