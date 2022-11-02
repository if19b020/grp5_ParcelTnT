package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.Recipient;
import at.fhtw.swen3.services.dto.RecipientDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T20:38:04+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class RecipientMapperImpl implements RecipientMapper {

    @Override
    public Recipient dtoToEntity(RecipientDto recipient) {
        if ( recipient == null ) {
            return null;
        }

        Recipient recipient1 = new Recipient();

        recipient1.setName( recipient.getName() );
        recipient1.setStreet( recipient.getStreet() );
        recipient1.setPostalCode( recipient.getPostalCode() );
        recipient1.setCity( recipient.getCity() );
        recipient1.setCountry( recipient.getCountry() );

        return recipient1;
    }

    @Override
    public RecipientDto entityToDto(Recipient recipient) {
        if ( recipient == null ) {
            return null;
        }

        RecipientDto recipientDto = new RecipientDto();

        recipientDto.setName( recipient.getName() );
        recipientDto.setStreet( recipient.getStreet() );
        recipientDto.setPostalCode( recipient.getPostalCode() );
        recipientDto.setCity( recipient.getCity() );
        recipientDto.setCountry( recipient.getCountry() );

        return recipientDto;
    }
}
