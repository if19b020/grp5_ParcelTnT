package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.GeoCoordinate;
import at.fhtw.swen3.services.dto.GeoCoordinateDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T20:24:22+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class GeoCoordinateMapperImpl implements GeoCoordinateMapper {

    @Override
    public GeoCoordinate dtoToEntity(GeoCoordinateDto geoCoordinate) {
        if ( geoCoordinate == null ) {
            return null;
        }

        GeoCoordinate geoCoordinate1 = new GeoCoordinate();

        geoCoordinate1.setLat( geoCoordinate.getLat() );
        geoCoordinate1.setLon( geoCoordinate.getLon() );

        return geoCoordinate1;
    }

    @Override
    public GeoCoordinateDto entityToDto(GeoCoordinate geoCoordinate) {
        if ( geoCoordinate == null ) {
            return null;
        }

        GeoCoordinateDto geoCoordinateDto = new GeoCoordinateDto();

        geoCoordinateDto.setLat( geoCoordinate.getLat() );
        geoCoordinateDto.setLon( geoCoordinate.getLon() );

        return geoCoordinateDto;
    }
}
