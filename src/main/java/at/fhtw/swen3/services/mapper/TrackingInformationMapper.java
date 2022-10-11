package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.TrackingInformation;
import at.fhtw.swen3.services.dto.TrackingInformationDto;
import org.mapstruct.factory.Mappers;

public interface TrackingInformationMapper {
    TrackingInformationMapper INSTANCE = Mappers.getMapper(TrackingInformationMapper.class);

    TrackingInformationDto entityToDto(TrackingInformation trackingInformation);
    TrackingInformation DtoToEntity(TrackingInformationDto trackingInformationDto);
}
