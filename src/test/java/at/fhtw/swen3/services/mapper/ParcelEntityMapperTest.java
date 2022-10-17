package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.ParcelEntity;
import at.fhtw.swen3.services.dto.*;
import org.hibernate.validator.constraints.NotEmpty;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class ParcelEntityMapperTest {

    @Test
    public void multipleDtoToEntity() {
        RecipientDto recipientDto = new RecipientDto();
            recipientDto.setName("Max Mustermann");
            recipientDto.setStreet("Schönbrunner Strasse");
            recipientDto.setPostalCode("1220");
            recipientDto.setCity("Vienna");
            recipientDto.setCountry("Austria");

        ParcelDto parcel = new ParcelDto();
            parcel.setWeight((float) 12.34);
            parcel.setRecipient(recipientDto);
            parcel.setSender(recipientDto);

        NewParcelInfoDto newParcelInfo = new NewParcelInfoDto();
            newParcelInfo.setTrackingId("123456789");

        HopArrivalDto hopArrivalDto1 = new HopArrivalDto();
            hopArrivalDto1.setCode("1");
            hopArrivalDto1.setDescription("1");
        HopArrivalDto hopArrivalDto2 = new HopArrivalDto();
            hopArrivalDto2.setCode("2");
            hopArrivalDto2.setDescription("2");
            //hopArrivalDto.setDateTime();
        List<HopArrivalDto> visitedHops = new ArrayList<HopArrivalDto>();
            visitedHops.add(hopArrivalDto1);
            visitedHops.add(hopArrivalDto2);

        TrackingInformationDto trackingInformation = new TrackingInformationDto();
            trackingInformation.setState(TrackingInformationDto.StateEnum.INTRANSPORT);
            trackingInformation.setVisitedHops(visitedHops);

        ParcelEntity parcelEntity = ParcelEntityMapper.INSTANCE.dtoToEntity(parcel,newParcelInfo,trackingInformation);

        //assertEquals( "1234", ParcelEntity);

        System.out.println(parcelEntity);
    }
    @Test
    public void entityToParcelDto(){
        RecipientDto recipientDto = new RecipientDto();
            recipientDto.setName("Max Mustermann");
            recipientDto.setStreet("Schönbrunner Strasse");
            recipientDto.setPostalCode("1220");
            recipientDto.setCity("Vienna");
            recipientDto.setCountry("Austria");

        ParcelEntity parcelEntity = new ParcelEntity();
            parcelEntity.setWeight((float) 12.34);
            parcelEntity.setRecipient(recipientDto);
            parcelEntity.setSender(recipientDto);
            parcelEntity.setTrackingId("1234");
            parcelEntity.setState(TrackingInformationDto.StateEnum.INTRANSPORT);

        ParcelDto parcelDto = ParcelEntityMapper.INSTANCE.entityToParcelDto(parcelEntity);

        assertEquals( "12.34", parcelDto.getWeight().toString());
        assertEquals( "Max Mustermann", parcelDto.getRecipient().getName());
        assertEquals( "Max Mustermann", parcelDto.getSender().getName());
    }
    @Test
    public void entityToNewParcelInfoDto(){
        ParcelEntity parcelEntity = new ParcelEntity();
        parcelEntity.setWeight((float) 12.34);
        parcelEntity.setRecipient(new RecipientDto());
        parcelEntity.setSender(new RecipientDto());
        parcelEntity.setTrackingId("1234");
        parcelEntity.setState(TrackingInformationDto.StateEnum.INTRANSPORT);

        NewParcelInfoDto newParcelInfoDto = ParcelEntityMapper.INSTANCE.entityToNewParcelInfoDto(parcelEntity);

        assertEquals( "1234", newParcelInfoDto.getTrackingId());
    }

}
