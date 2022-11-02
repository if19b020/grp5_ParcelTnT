package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.HopArrival;
import at.fhtw.swen3.persistence.entity.ParcelEntity;
import at.fhtw.swen3.persistence.entity.ParcelEntity.StateEnum;
import at.fhtw.swen3.persistence.entity.Recipient;
import at.fhtw.swen3.services.dto.HopArrivalDto;
import at.fhtw.swen3.services.dto.NewParcelInfoDto;
import at.fhtw.swen3.services.dto.ParcelDto;
import at.fhtw.swen3.services.dto.RecipientDto;
import at.fhtw.swen3.services.dto.TrackingInformationDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T20:24:13+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class ParcelEntityMapperImpl implements ParcelEntityMapper {

    @Override
    public ParcelEntity dtoToEntity(ParcelDto parcelDto, NewParcelInfoDto newParcelInfoDto, TrackingInformationDto trackingInformationDto) {
        if ( parcelDto == null && newParcelInfoDto == null && trackingInformationDto == null ) {
            return null;
        }

        ParcelEntity parcelEntity = new ParcelEntity();

        if ( parcelDto != null ) {
            parcelEntity.setWeight( parcelDto.getWeight() );
            parcelEntity.setRecipient( recipientDtoToRecipient( parcelDto.getRecipient() ) );
            parcelEntity.setSender( recipientDtoToRecipient( parcelDto.getSender() ) );
        }
        if ( newParcelInfoDto != null ) {
            parcelEntity.setTrackingId( newParcelInfoDto.getTrackingId() );
        }
        if ( trackingInformationDto != null ) {
            parcelEntity.setState( stateEnumToStateEnum( trackingInformationDto.getState() ) );
            parcelEntity.setVisitedHops( hopArrivalDtoListToHopArrivalList( trackingInformationDto.getVisitedHops() ) );
            parcelEntity.setFutureHops( hopArrivalDtoListToHopArrivalList( trackingInformationDto.getFutureHops() ) );
        }

        return parcelEntity;
    }

    @Override
    public ParcelDto entityToParcelDto(ParcelEntity parcelEntity) {
        if ( parcelEntity == null ) {
            return null;
        }

        ParcelDto parcelDto = new ParcelDto();

        parcelDto.setWeight( parcelEntity.getWeight() );
        parcelDto.setRecipient( recipientToRecipientDto( parcelEntity.getRecipient() ) );
        parcelDto.setSender( recipientToRecipientDto( parcelEntity.getSender() ) );

        return parcelDto;
    }

    @Override
    public NewParcelInfoDto entityToNewParcelInfoDto(ParcelEntity parcelEntity) {
        if ( parcelEntity == null ) {
            return null;
        }

        NewParcelInfoDto newParcelInfoDto = new NewParcelInfoDto();

        newParcelInfoDto.setTrackingId( parcelEntity.getTrackingId() );

        return newParcelInfoDto;
    }

    @Override
    public TrackingInformationDto entityToTrackingInformationDto(ParcelEntity parcelEntity) {
        if ( parcelEntity == null ) {
            return null;
        }

        TrackingInformationDto trackingInformationDto = new TrackingInformationDto();

        trackingInformationDto.setState( stateEnumToStateEnum1( parcelEntity.getState() ) );
        trackingInformationDto.setVisitedHops( hopArrivalListToHopArrivalDtoList( parcelEntity.getVisitedHops() ) );
        trackingInformationDto.setFutureHops( hopArrivalListToHopArrivalDtoList( parcelEntity.getFutureHops() ) );

        return trackingInformationDto;
    }

    protected Recipient recipientDtoToRecipient(RecipientDto recipientDto) {
        if ( recipientDto == null ) {
            return null;
        }

        Recipient recipient = new Recipient();

        recipient.setName( recipientDto.getName() );
        recipient.setStreet( recipientDto.getStreet() );
        recipient.setPostalCode( recipientDto.getPostalCode() );
        recipient.setCity( recipientDto.getCity() );
        recipient.setCountry( recipientDto.getCountry() );

        return recipient;
    }

    protected StateEnum stateEnumToStateEnum(at.fhtw.swen3.services.dto.TrackingInformationDto.StateEnum stateEnum) {
        if ( stateEnum == null ) {
            return null;
        }

        StateEnum stateEnum1;

        switch ( stateEnum ) {
            case PICKUP: stateEnum1 = StateEnum.PICKUP;
            break;
            case INTRANSPORT: stateEnum1 = StateEnum.INTRANSPORT;
            break;
            case INTRUCKDELIVERY: stateEnum1 = StateEnum.INTRUCKDELIVERY;
            break;
            case TRANSFERRED: stateEnum1 = StateEnum.TRANSFERRED;
            break;
            case DELIVERED: stateEnum1 = StateEnum.DELIVERED;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + stateEnum );
        }

        return stateEnum1;
    }

    protected HopArrival hopArrivalDtoToHopArrival(HopArrivalDto hopArrivalDto) {
        if ( hopArrivalDto == null ) {
            return null;
        }

        HopArrival hopArrival = new HopArrival();

        hopArrival.setCode( hopArrivalDto.getCode() );
        hopArrival.setDescription( hopArrivalDto.getDescription() );
        hopArrival.setDateTime( hopArrivalDto.getDateTime() );

        return hopArrival;
    }

    protected List<HopArrival> hopArrivalDtoListToHopArrivalList(List<HopArrivalDto> list) {
        if ( list == null ) {
            return null;
        }

        List<HopArrival> list1 = new ArrayList<HopArrival>( list.size() );
        for ( HopArrivalDto hopArrivalDto : list ) {
            list1.add( hopArrivalDtoToHopArrival( hopArrivalDto ) );
        }

        return list1;
    }

    protected RecipientDto recipientToRecipientDto(Recipient recipient) {
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

    protected at.fhtw.swen3.services.dto.TrackingInformationDto.StateEnum stateEnumToStateEnum1(StateEnum stateEnum) {
        if ( stateEnum == null ) {
            return null;
        }

        at.fhtw.swen3.services.dto.TrackingInformationDto.StateEnum stateEnum1;

        switch ( stateEnum ) {
            case PICKUP: stateEnum1 = at.fhtw.swen3.services.dto.TrackingInformationDto.StateEnum.PICKUP;
            break;
            case INTRANSPORT: stateEnum1 = at.fhtw.swen3.services.dto.TrackingInformationDto.StateEnum.INTRANSPORT;
            break;
            case INTRUCKDELIVERY: stateEnum1 = at.fhtw.swen3.services.dto.TrackingInformationDto.StateEnum.INTRUCKDELIVERY;
            break;
            case TRANSFERRED: stateEnum1 = at.fhtw.swen3.services.dto.TrackingInformationDto.StateEnum.TRANSFERRED;
            break;
            case DELIVERED: stateEnum1 = at.fhtw.swen3.services.dto.TrackingInformationDto.StateEnum.DELIVERED;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + stateEnum );
        }

        return stateEnum1;
    }

    protected HopArrivalDto hopArrivalToHopArrivalDto(HopArrival hopArrival) {
        if ( hopArrival == null ) {
            return null;
        }

        HopArrivalDto hopArrivalDto = new HopArrivalDto();

        hopArrivalDto.setCode( hopArrival.getCode() );
        hopArrivalDto.setDescription( hopArrival.getDescription() );
        hopArrivalDto.setDateTime( hopArrival.getDateTime() );

        return hopArrivalDto;
    }

    protected List<HopArrivalDto> hopArrivalListToHopArrivalDtoList(List<HopArrival> list) {
        if ( list == null ) {
            return null;
        }

        List<HopArrivalDto> list1 = new ArrayList<HopArrivalDto>( list.size() );
        for ( HopArrival hopArrival : list ) {
            list1.add( hopArrivalToHopArrivalDto( hopArrival ) );
        }

        return list1;
    }
}
