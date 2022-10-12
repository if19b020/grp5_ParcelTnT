package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.Recipient;
import at.fhtw.swen3.persistence.entity.Parcel;
import at.fhtw.swen3.persistence.entity.TrackingInformation;
import at.fhtw.swen3.services.dto.ParcelDto;
import at.fhtw.swen3.services.dto.TrackingInformationDto;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class TrackingInformationMapperTest {

    @Test
    public void entityToDto() {
        TrackingInformation trackingInformation = new TrackingInformation();
        trackingInformation.setState(TrackingInformation.StateEnum.INTRANSPORT);
        System.out.println(trackingInformation);

        TrackingInformationDto trackingInformationDto = TrackingInformationMapper.INSTANCE.entityToDto(trackingInformation);

        assertEquals(TrackingInformation.StateEnum.INTRANSPORT, trackingInformationDto.getState());

        System.out.println(trackingInformationDto);
    }

    @Test
    public void dtoToEntity() {
        TrackingInformationDto trackingInformationDto = new TrackingInformationDto();
        trackingInformationDto.setState(TrackingInformation.StateEnum.INTRANSPORT);
        System.out.println(trackingInformationDto);

        TrackingInformation trackingInformation = TrackingInformationMapper.INSTANCE.dtoToEntity(trackingInformationDto);

        assertEquals(TrackingInformation.StateEnum.INTRANSPORT, trackingInformation.getState());

        System.out.println(trackingInformation);
    }

}
