package at.fhtw.swen3.services.mapper;


import at.fhtw.swen3.services.dto.RecipientDto;
import at.fhtw.swen3.persistence.Recipient;
import org.mapstruct.factory.Mappers;

public interface RecipientMapper {
    RecipientMapper INSTANCE = Mappers.getMapper(RecipientMapper.class);

    Recipient entityToDto(RecipientDto recipient);
    RecipientDto DtoToEntity(Recipient recipient);
}
