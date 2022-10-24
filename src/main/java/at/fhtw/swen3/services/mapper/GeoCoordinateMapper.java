package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.GeoCoordinateDto;
import at.fhtw.swen3.persistence.entity.GeoCoordinate;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GeoCoordinateMapper {
    GeoCoordinateMapper INSTANCE = Mappers.getMapper(GeoCoordinateMapper.class);

    GeoCoordinate dtoToEntity(GeoCoordinateDto geoCoordinate);
    GeoCoordinateDto entityToDto(GeoCoordinate geoCoordinate);
}
