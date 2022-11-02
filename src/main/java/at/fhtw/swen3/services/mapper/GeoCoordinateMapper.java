package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.GeoCoordinate;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GeoCoordinateMapper {
    GeoCoordinateMapper INSTANCE = Mappers.getMapper(GeoCoordinateMapper.class);

    at.fhtw.swen3.persistence.entity.GeoCoordinate dtoToEntity(GeoCoordinate geoCoordinate);
    GeoCoordinate entityToDto(at.fhtw.swen3.persistence.entity.GeoCoordinate geoCoordinate);
}
