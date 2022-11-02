package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.RecipientEntity;
import at.fhtw.swen3.services.dto.Recipient;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T20:59:40+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
public class RecipientMapperImpl implements RecipientMapper {

    @Override
    public RecipientEntity dtoToEntity(Recipient recipient) {
        if ( recipient == null ) {
            return null;
        }

        RecipientEntity recipientEntity = new RecipientEntity();

        recipientEntity.setName( recipient.getName() );
        recipientEntity.setStreet( recipient.getStreet() );
        recipientEntity.setPostalCode( recipient.getPostalCode() );
        recipientEntity.setCity( recipient.getCity() );
        recipientEntity.setCountry( recipient.getCountry() );

        return recipientEntity;
    }

    @Override
    public Recipient entityToDto(RecipientEntity recipient) {
        if ( recipient == null ) {
            return null;
        }

        Recipient recipientDto = new Recipient();

        recipientDto.setName( recipient.getName() );
        recipientDto.setStreet( recipient.getStreet() );
        recipientDto.setPostalCode( recipient.getPostalCode() );
        recipientDto.setCity( recipient.getCity() );
        recipientDto.setCountry( recipient.getCountry() );

        return recipientDto;
    }
}
