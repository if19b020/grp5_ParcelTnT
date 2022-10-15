package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.Error;
import org.mapstruct.factory.Mappers;

public interface ErrorMapper {
    ErrorMapper INSTANCE = Mappers.getMapper(ErrorMapper.class);

    Error entityToDto(java.lang.Error error);
    java.lang.Error DtoToEntity(Error error);
}
