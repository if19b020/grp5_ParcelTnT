package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.GeoCoordinateDto;
import at.fhtw.swen3.persistence.GeoCoordinate;
import org.mapstruct.factory.Mappers;

public interface GeoCoordinateMapper {
    GeoCoordinateMapper INSTANCE = Mappers.getMapper(GeoCoordinateMapper.class);

    GeoCoordinate entityToDto(GeoCoordinateDto geoCoordinate);
    GeoCoordinateDto DtoToEntity(GeoCoordinate geoCoordinate);
}
