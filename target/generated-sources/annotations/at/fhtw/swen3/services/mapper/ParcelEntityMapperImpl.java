package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.HopArrivalEntity;
import at.fhtw.swen3.persistence.entities.ParcelEntity;
import at.fhtw.swen3.persistence.entities.ParcelEntity.StateEnum;
import at.fhtw.swen3.persistence.entities.RecipientEntity;
import at.fhtw.swen3.services.dto.HopArrival;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.dto.Recipient;
import at.fhtw.swen3.services.dto.TrackingInformation;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-06T20:44:09+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class ParcelEntityMapperImpl implements ParcelEntityMapper {

    @Override
    public ParcelEntity dtoToEntity(Parcel parcel, NewParcelInfo newParcelInfo, TrackingInformation trackingInformation) {
        if ( parcel == null && newParcelInfo == null && trackingInformation == null ) {
            return null;
        }

        ParcelEntity parcelEntity = new ParcelEntity();

        if ( parcel != null ) {
            parcelEntity.setWeight( parcel.getWeight() );
            parcelEntity.setRecipient( recipientToRecipientEntity( parcel.getRecipient() ) );
            parcelEntity.setSender( recipientToRecipientEntity( parcel.getSender() ) );
        }
        if ( newParcelInfo != null ) {
            parcelEntity.setTrackingId( newParcelInfo.getTrackingId() );
        }
        if ( trackingInformation != null ) {
            parcelEntity.setState( stateEnumToStateEnum( trackingInformation.getState() ) );
            parcelEntity.setVisitedHops( hopArrivalListToHopArrivalEntityList( trackingInformation.getVisitedHops() ) );
            parcelEntity.setFutureHops( hopArrivalListToHopArrivalEntityList( trackingInformation.getFutureHops() ) );
        }

        return parcelEntity;
    }

    @Override
    public Parcel entityToParcelDto(ParcelEntity parcelEntity) {
        if ( parcelEntity == null ) {
            return null;
        }

        Parcel parcel = new Parcel();

        parcel.setWeight( parcelEntity.getWeight() );
        parcel.setRecipient( recipientEntityToRecipient( parcelEntity.getRecipient() ) );
        parcel.setSender( recipientEntityToRecipient( parcelEntity.getSender() ) );

        return parcel;
    }

    @Override
    public NewParcelInfo entityToNewParcelInfoDto(ParcelEntity parcelEntity) {
        if ( parcelEntity == null ) {
            return null;
        }

        NewParcelInfo newParcelInfo = new NewParcelInfo();

        newParcelInfo.setTrackingId( parcelEntity.getTrackingId() );

        return newParcelInfo;
    }

    @Override
    public TrackingInformation entityToTrackingInformationDto(ParcelEntity parcelEntity) {
        if ( parcelEntity == null ) {
            return null;
        }

        TrackingInformation trackingInformation = new TrackingInformation();

        trackingInformation.setState( stateEnumToStateEnum1( parcelEntity.getState() ) );
        trackingInformation.setVisitedHops( hopArrivalEntityListToHopArrivalList( parcelEntity.getVisitedHops() ) );
        trackingInformation.setFutureHops( hopArrivalEntityListToHopArrivalList( parcelEntity.getFutureHops() ) );

        return trackingInformation;
    }

    protected RecipientEntity recipientToRecipientEntity(Recipient recipient) {
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

    protected StateEnum stateEnumToStateEnum(at.fhtw.swen3.services.dto.TrackingInformation.StateEnum stateEnum) {
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

    protected HopArrivalEntity hopArrivalToHopArrivalEntity(HopArrival hopArrival) {
        if ( hopArrival == null ) {
            return null;
        }

        HopArrivalEntity hopArrivalEntity = new HopArrivalEntity();

        hopArrivalEntity.setCode( hopArrival.getCode() );
        hopArrivalEntity.setDescription( hopArrival.getDescription() );
        hopArrivalEntity.setDateTime( hopArrival.getDateTime() );

        return hopArrivalEntity;
    }

    protected List<HopArrivalEntity> hopArrivalListToHopArrivalEntityList(List<HopArrival> list) {
        if ( list == null ) {
            return null;
        }

        List<HopArrivalEntity> list1 = new ArrayList<HopArrivalEntity>( list.size() );
        for ( HopArrival hopArrival : list ) {
            list1.add( hopArrivalToHopArrivalEntity( hopArrival ) );
        }

        return list1;
    }

    protected Recipient recipientEntityToRecipient(RecipientEntity recipientEntity) {
        if ( recipientEntity == null ) {
            return null;
        }

        Recipient recipient = new Recipient();

        recipient.setName( recipientEntity.getName() );
        recipient.setStreet( recipientEntity.getStreet() );
        recipient.setPostalCode( recipientEntity.getPostalCode() );
        recipient.setCity( recipientEntity.getCity() );
        recipient.setCountry( recipientEntity.getCountry() );

        return recipient;
    }

    protected at.fhtw.swen3.services.dto.TrackingInformation.StateEnum stateEnumToStateEnum1(StateEnum stateEnum) {
        if ( stateEnum == null ) {
            return null;
        }

        at.fhtw.swen3.services.dto.TrackingInformation.StateEnum stateEnum1;

        switch ( stateEnum ) {
            case PICKUP: stateEnum1 = at.fhtw.swen3.services.dto.TrackingInformation.StateEnum.PICKUP;
            break;
            case INTRANSPORT: stateEnum1 = at.fhtw.swen3.services.dto.TrackingInformation.StateEnum.INTRANSPORT;
            break;
            case INTRUCKDELIVERY: stateEnum1 = at.fhtw.swen3.services.dto.TrackingInformation.StateEnum.INTRUCKDELIVERY;
            break;
            case TRANSFERRED: stateEnum1 = at.fhtw.swen3.services.dto.TrackingInformation.StateEnum.TRANSFERRED;
            break;
            case DELIVERED: stateEnum1 = at.fhtw.swen3.services.dto.TrackingInformation.StateEnum.DELIVERED;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + stateEnum );
        }

        return stateEnum1;
    }

    protected HopArrival hopArrivalEntityToHopArrival(HopArrivalEntity hopArrivalEntity) {
        if ( hopArrivalEntity == null ) {
            return null;
        }

        HopArrival hopArrival = new HopArrival();

        hopArrival.setCode( hopArrivalEntity.getCode() );
        hopArrival.setDescription( hopArrivalEntity.getDescription() );
        hopArrival.setDateTime( hopArrivalEntity.getDateTime() );

        return hopArrival;
    }

    protected List<HopArrival> hopArrivalEntityListToHopArrivalList(List<HopArrivalEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<HopArrival> list1 = new ArrayList<HopArrival>( list.size() );
        for ( HopArrivalEntity hopArrivalEntity : list ) {
            list1.add( hopArrivalEntityToHopArrival( hopArrivalEntity ) );
        }

        return list1;
    }
}
