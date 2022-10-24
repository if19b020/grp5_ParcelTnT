package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.HopDto;
import at.fhtw.swen3.persistence.entity.Hop;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HopMapper {
    HopMapper INSTANCE = Mappers.getMapper(HopMapper.class);

    Hop dtoToEntity(HopDto hop);
    HopDto entityToDto(Hop hop);
}
