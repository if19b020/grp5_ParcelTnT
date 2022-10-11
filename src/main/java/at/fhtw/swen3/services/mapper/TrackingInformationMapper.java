package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.TrackingInformation;
import at.fhtw.swen3.services.dto.TrackingInformationDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TrackingInformationMapper {
    TrackingInformationMapper INSTANCE = Mappers.getMapper(TrackingInformationMapper.class);

    @Mapping(source="state",target="state") //falls namen unterschiedlich
    TrackingInformationDto entityToDto(TrackingInformation trackingInformation);
    TrackingInformation dtoToEntity(TrackingInformationDto trackingInformationDto);
}
