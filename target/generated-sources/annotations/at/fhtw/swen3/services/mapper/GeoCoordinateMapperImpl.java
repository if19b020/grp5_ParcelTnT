package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.GeoCoordinateEntity;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-06T20:07:38+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class GeoCoordinateMapperImpl implements GeoCoordinateMapper {

    @Override
    public GeoCoordinateEntity dtoToEntity(GeoCoordinate geoCoordinate) {
        if ( geoCoordinate == null ) {
            return null;
        }

        GeoCoordinateEntity geoCoordinateEntity = new GeoCoordinateEntity();

        geoCoordinateEntity.setLat( geoCoordinate.getLat() );
        geoCoordinateEntity.setLon( geoCoordinate.getLon() );

        return geoCoordinateEntity;
    }

    @Override
    public GeoCoordinate entityToDto(GeoCoordinateEntity geoCoordinate) {
        if ( geoCoordinate == null ) {
            return null;
        }

        GeoCoordinate geoCoordinate1 = new GeoCoordinate();

        geoCoordinate1.setLat( geoCoordinate.getLat() );
        geoCoordinate1.setLon( geoCoordinate.getLon() );

        return geoCoordinate1;
    }
}
