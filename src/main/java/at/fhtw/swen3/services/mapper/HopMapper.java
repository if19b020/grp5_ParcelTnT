package at.fhtw.swen3.services.mapper;


import at.fhtw.swen3.persistence.Hop;
import at.fhtw.swen3.services.dto.HopDto;
import org.mapstruct.factory.Mappers;

public interface HopMapper {
    HopMapper INSTANCE = Mappers.getMapper(HopMapper.class);

    HopDto entityToDto(Hop hop);
    Hop DtoToEntity(HopDto hop);
}
