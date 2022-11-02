package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.ParcelEntity;
import at.fhtw.swen3.services.dto.*;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class ParcelEntityMapperTest {

    @Test
    public void multipleDtosToEntity() {
        Recipient recipientDto = new Recipient();
            recipientDto.setName("some name...");
            recipientDto.setStreet("some street...");
            recipientDto.setPostalCode("some code...");
            recipientDto.setCity("some city...");
            recipientDto.setCountry("some country...");
        Parcel parcelDto = new Parcel();
            parcelDto.setWeight(12.34f);
            parcelDto.setRecipient(recipientDto);
            parcelDto.setSender(recipientDto);

        NewParcelInfo newParcelInfoDto = new NewParcelInfo();
            newParcelInfoDto.setTrackingId("some tracking id...");

        OffsetDateTime time = OffsetDateTime.now();
        HopArrival hopArrivalDto = new HopArrival();
            hopArrivalDto.setCode("some code...");
            hopArrivalDto.setDescription("some description...");
            hopArrivalDto.setDateTime(time);
        List<HopArrival> visitedHopsDto = new ArrayList<HopArrival>();
            visitedHopsDto.add(hopArrivalDto);

        TrackingInformation trackingInformationDto = new TrackingInformation();
            trackingInformationDto.setState(TrackingInformation.StateEnum.INTRANSPORT);
            trackingInformationDto.setVisitedHops(visitedHopsDto);
            trackingInformationDto.setFutureHops(visitedHopsDto);

        ParcelEntity parcelEntity = ParcelEntityMapper.INSTANCE.dtoToEntity(parcelDto,newParcelInfoDto,trackingInformationDto);

        assertEquals("12.34",parcelEntity.getWeight().toString());
        assertEquals("some name...",parcelEntity.getRecipient().getName());
        assertEquals("some street...",parcelEntity.getRecipient().getStreet());
        assertEquals("some code...",parcelEntity.getRecipient().getPostalCode());
        assertEquals("some city...",parcelEntity.getRecipient().getCity());
        assertEquals("some country...",parcelEntity.getRecipient().getCountry());
        assertEquals("some name...",parcelEntity.getSender().getName());
        assertEquals("some street...",parcelEntity.getSender().getStreet());
        assertEquals("some code...",parcelEntity.getSender().getPostalCode());
        assertEquals("some city...",parcelEntity.getSender().getCity());
        assertEquals("some country...",parcelEntity.getSender().getCountry());
        assertEquals("some tracking id...",parcelEntity.getTrackingId());
        assertEquals("INTRANSPORT",parcelEntity.getState().toString());
        assertEquals("some code...",parcelEntity.getVisitedHops().get(0).getCode());
        assertEquals("some description...",parcelEntity.getVisitedHops().get(0).getDescription());
        assertEquals(time,parcelEntity.getVisitedHops().get(0).getDateTime());
        assertEquals("some code...",parcelEntity.getFutureHops().get(0).getCode());
        assertEquals("some description...",parcelEntity.getFutureHops().get(0).getDescription());
        assertEquals(time,parcelEntity.getFutureHops().get(0).getDateTime());

    }
    @Test
    public void entityToParcelDto(){
        at.fhtw.swen3.persistence.entity.Recipient recipient = new at.fhtw.swen3.persistence.entity.Recipient();
            recipient.setName("some name...");
            recipient.setStreet("some street...");
            recipient.setPostalCode("some code...");
            recipient.setCity("some city...");
            recipient.setCountry("some country...");

        OffsetDateTime time = OffsetDateTime.now();
        at.fhtw.swen3.persistence.entity.HopArrival hopArrival = new at.fhtw.swen3.persistence.entity.HopArrival();
            hopArrival.setCode("some code...");
            hopArrival.setDescription("some description...");
            hopArrival.setDateTime(time);
        List<at.fhtw.swen3.persistence.entity.HopArrival> visitedHops = new ArrayList<at.fhtw.swen3.persistence.entity.HopArrival>();
            visitedHops.add(hopArrival);

        ParcelEntity parcelEntity = new ParcelEntity();
            parcelEntity.setWeight(12.34f);
            parcelEntity.setRecipient(recipient);
            parcelEntity.setSender(recipient);
            parcelEntity.setTrackingId("some tracking id...");
            parcelEntity.setState(ParcelEntity.StateEnum.INTRANSPORT);
            parcelEntity.setVisitedHops(visitedHops);
            parcelEntity.setFutureHops(visitedHops);

        Parcel parcelDto = ParcelEntityMapper.INSTANCE.entityToParcelDto(parcelEntity);

        assertEquals( "12.34", parcelDto.getWeight().toString());
        assertEquals( "some name...", parcelDto.getRecipient().getName());
        assertEquals( "some street...", parcelDto.getRecipient().getStreet());
        assertEquals( "some code...", parcelDto.getRecipient().getPostalCode());
        assertEquals( "some city...", parcelDto.getRecipient().getCity());
        assertEquals( "some country...", parcelDto.getRecipient().getCountry());
        assertEquals( "some name...", parcelDto.getSender().getName());
        assertEquals( "some street...", parcelDto.getSender().getStreet());
        assertEquals( "some code...", parcelDto.getSender().getPostalCode());
        assertEquals( "some city...", parcelDto.getSender().getCity());
        assertEquals( "some country...", parcelDto.getSender().getCountry());
    }
    @Test
    public void entityToNewParcelInfoDto(){
        at.fhtw.swen3.persistence.entity.Recipient recipient = new at.fhtw.swen3.persistence.entity.Recipient();
        recipient.setName("some name...");
        recipient.setStreet("some street...");
        recipient.setPostalCode("some code...");
        recipient.setCity("some city...");
        recipient.setCountry("some country...");

        OffsetDateTime time = OffsetDateTime.now();
        at.fhtw.swen3.persistence.entity.HopArrival hopArrival = new at.fhtw.swen3.persistence.entity.HopArrival();
        hopArrival.setCode("some code...");
        hopArrival.setDescription("some description...");
        hopArrival.setDateTime(time);
        List<at.fhtw.swen3.persistence.entity.HopArrival> visitedHops = new ArrayList<at.fhtw.swen3.persistence.entity.HopArrival>();
        visitedHops.add(hopArrival);

        ParcelEntity parcelEntity = new ParcelEntity();
        parcelEntity.setWeight(12.34f);
        parcelEntity.setRecipient(recipient);
        parcelEntity.setSender(recipient);
        parcelEntity.setTrackingId("some tracking id...");
        parcelEntity.setState(ParcelEntity.StateEnum.INTRANSPORT);
        parcelEntity.setVisitedHops(visitedHops);
        parcelEntity.setFutureHops(visitedHops);

        NewParcelInfo newParcelInfoDto = ParcelEntityMapper.INSTANCE.entityToNewParcelInfoDto(parcelEntity);

        assertEquals( "some tracking id...", newParcelInfoDto.getTrackingId());
    }
    @Test
    public void entityToTrackingInformationDto(){
        at.fhtw.swen3.persistence.entity.Recipient recipient = new at.fhtw.swen3.persistence.entity.Recipient();
        recipient.setName("some name...");
        recipient.setStreet("some street...");
        recipient.setPostalCode("some code...");
        recipient.setCity("some city...");
        recipient.setCountry("some country...");

        OffsetDateTime time = OffsetDateTime.now();
        at.fhtw.swen3.persistence.entity.HopArrival hopArrival = new at.fhtw.swen3.persistence.entity.HopArrival();
        hopArrival.setCode("some code...");
        hopArrival.setDescription("some description...");
        hopArrival.setDateTime(time);
        List<at.fhtw.swen3.persistence.entity.HopArrival> visitedHops = new ArrayList<at.fhtw.swen3.persistence.entity.HopArrival>();
        visitedHops.add(hopArrival);

        ParcelEntity parcelEntity = new ParcelEntity();
        parcelEntity.setWeight(12.34f);
        parcelEntity.setRecipient(recipient);
        parcelEntity.setSender(recipient);
        parcelEntity.setTrackingId("some tracking id...");
        parcelEntity.setState(ParcelEntity.StateEnum.INTRANSPORT);
        parcelEntity.setVisitedHops(visitedHops);
        parcelEntity.setFutureHops(visitedHops);

        TrackingInformation trackingInformationDto = ParcelEntityMapper.INSTANCE.entityToTrackingInformationDto(parcelEntity);

        assertEquals( "InTransport", trackingInformationDto.getState().toString());
        assertEquals("some code...",trackingInformationDto.getVisitedHops().get(0).getCode());
        assertEquals("some description...",trackingInformationDto.getVisitedHops().get(0).getDescription());
        assertEquals(time,trackingInformationDto.getVisitedHops().get(0).getDateTime());
        assertEquals("some code...",trackingInformationDto.getFutureHops().get(0).getCode());
        assertEquals("some description...",trackingInformationDto.getFutureHops().get(0).getDescription());
        assertEquals(time,trackingInformationDto.getFutureHops().get(0).getDateTime());
    }

}
