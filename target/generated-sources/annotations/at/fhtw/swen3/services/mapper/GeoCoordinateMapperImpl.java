package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.GeoCoordinate;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T18:26:22+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class GeoCoordinateMapperImpl implements GeoCoordinateMapper {

    @Override
    public at.fhtw.swen3.persistence.entity.GeoCoordinate dtoToEntity(GeoCoordinate geoCoordinate) {
        if ( geoCoordinate == null ) {
            return null;
        }

        at.fhtw.swen3.persistence.entity.GeoCoordinate geoCoordinate1 = new at.fhtw.swen3.persistence.entity.GeoCoordinate();

        geoCoordinate1.setLat( geoCoordinate.getLat() );
        geoCoordinate1.setLon( geoCoordinate.getLon() );

        return geoCoordinate1;
    }

    @Override
    public GeoCoordinate entityToDto(at.fhtw.swen3.persistence.entity.GeoCoordinate geoCoordinate) {
        if ( geoCoordinate == null ) {
            return null;
        }

        GeoCoordinate geoCoordinate1 = new GeoCoordinate();

        geoCoordinate1.setLat( geoCoordinate.getLat() );
        geoCoordinate1.setLon( geoCoordinate.getLon() );

        return geoCoordinate1;
    }
}
