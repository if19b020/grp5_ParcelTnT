package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.TrackingInformationDto;
import at.fhtw.swen3.persistence.entity.TrackingInformation;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class TrackingInformationMapperTest {

    @Test
    public void entityToDto() {
        TrackingInformationDto trackingInformation = new TrackingInformationDto();
        trackingInformation.setState(TrackingInformationDto.StateEnum.INTRANSPORT);
        System.out.println(trackingInformation);

        TrackingInformation trackingInformationDto = TrackingInformationMapper.INSTANCE.entityToDto(trackingInformation);

        assertEquals(TrackingInformationDto.StateEnum.INTRANSPORT, trackingInformationDto.getState());

        System.out.println(trackingInformationDto);
    }

    @Test
    public void dtoToEntity() {
        TrackingInformation trackingInformationDto = new TrackingInformation();
        trackingInformationDto.setState(TrackingInformationDto.StateEnum.INTRANSPORT);
        System.out.println(trackingInformationDto);

        TrackingInformationDto trackingInformation = TrackingInformationMapper.INSTANCE.dtoToEntity(trackingInformationDto);

        assertEquals(TrackingInformationDto.StateEnum.INTRANSPORT, trackingInformation.getState());

        System.out.println(trackingInformation);
    }

}
