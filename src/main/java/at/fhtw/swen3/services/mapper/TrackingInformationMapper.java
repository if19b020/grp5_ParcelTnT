package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.TrackingInformationDto;
import at.fhtw.swen3.persistence.entity.TrackingInformation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TrackingInformationMapper {
    TrackingInformationMapper INSTANCE = Mappers.getMapper(TrackingInformationMapper.class);

    @Mapping(source="state",target="state") //falls namen unterschiedlich
    TrackingInformation entityToDto(TrackingInformationDto trackingInformation);
    TrackingInformationDto dtoToEntity(TrackingInformation trackingInformationDto);
}
