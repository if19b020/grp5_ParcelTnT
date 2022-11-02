package at.fhtw.swen3.services.mapper;


import at.fhtw.swen3.persistence.entity.RecipientEntity;
import at.fhtw.swen3.services.dto.RecipientDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecipientMapper {
    RecipientMapper INSTANCE = Mappers.getMapper(RecipientMapper.class);

    RecipientEntity dtoToEntity(RecipientDto recipient);
    RecipientDto entityToDto(RecipientEntity recipient);
}
