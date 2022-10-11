package at.fhtw.swen3.services.mapper;


import at.fhtw.swen3.persistence.Recipient;
import at.fhtw.swen3.services.dto.RecipientDto;
import org.mapstruct.factory.Mappers;

public interface RecipientMapper {
    RecipientMapper INSTANCE = Mappers.getMapper(RecipientMapper.class);

    RecipientDto entityToDto(Recipient recipient);
    Recipient DtoToEntity(RecipientDto recipient);
}
