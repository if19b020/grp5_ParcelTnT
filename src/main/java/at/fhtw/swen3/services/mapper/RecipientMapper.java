package at.fhtw.swen3.services.mapper;


import at.fhtw.swen3.services.dto.Recipient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecipientMapper {
    RecipientMapper INSTANCE = Mappers.getMapper(RecipientMapper.class);

    at.fhtw.swen3.persistence.entity.Recipient dtoToEntity(Recipient recipient);
    Recipient entityToDto(at.fhtw.swen3.persistence.entity.Recipient recipient);
}
