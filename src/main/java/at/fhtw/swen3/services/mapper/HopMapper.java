package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.Hop;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HopMapper {
    HopMapper INSTANCE = Mappers.getMapper(HopMapper.class);

    at.fhtw.swen3.persistence.entity.Hop dtoToEntity(Hop hop);
    Hop entityToDto(at.fhtw.swen3.persistence.entity.Hop hop);
}
