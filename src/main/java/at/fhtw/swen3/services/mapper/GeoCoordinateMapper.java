package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.GeoCoordinate;
import at.fhtw.swen3.services.dto.ErrorDto;
import at.fhtw.swen3.services.dto.GeoCoordinateDto;
import org.mapstruct.factory.Mappers;

public interface GeoCoordinateMapper {
    GeoCoordinateMapper INSTANCE = Mappers.getMapper(GeoCoordinateMapper.class);

    GeoCoordinateDto entityToDto(GeoCoordinate geoCoordinate);
    GeoCoordinate DtoToEntity(GeoCoordinateDto geoCoordinate);
}
