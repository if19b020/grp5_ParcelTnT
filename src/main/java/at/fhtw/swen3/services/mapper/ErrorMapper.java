package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.Error;
import at.fhtw.swen3.services.dto.ErrorDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ErrorMapper {
    ErrorMapper INSTANCE = Mappers.getMapper(ErrorMapper.class);

    ErrorDto entityToDto(Error error);
    Error dtoToEntity(ErrorDto errorDto);
}
