package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.GeoCoordinateDto;
import at.fhtw.swen3.persistence.entity.GeoCoordinateEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GeoCoordinateMapper {
    GeoCoordinateMapper INSTANCE = Mappers.getMapper(GeoCoordinateMapper.class);

    GeoCoordinateEntity dtoToEntity(GeoCoordinateDto geoCoordinate);
    GeoCoordinateDto entityToDto(GeoCoordinateEntity geoCoordinate);
}
