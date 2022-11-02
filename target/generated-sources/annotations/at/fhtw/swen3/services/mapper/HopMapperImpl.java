package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.GeoCoordinateEntity;
import at.fhtw.swen3.persistence.entity.HopEntity;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import at.fhtw.swen3.services.dto.Hop;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T20:59:40+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
public class HopMapperImpl implements HopMapper {

    @Override
    public HopEntity dtoToEntity(Hop hop) {
        if ( hop == null ) {
            return null;
        }

        HopEntity hopEntity = new HopEntity();

        hopEntity.setHopType( hop.getHopType() );
        hopEntity.setCode( hop.getCode() );
        hopEntity.setDescription( hop.getDescription() );
        hopEntity.setProcessingDelayMins( hop.getProcessingDelayMins() );
        hopEntity.setLocationName( hop.getLocationName() );
        hopEntity.setLocationCoordinates( geoCoordinateDtoToGeoCoordinateEntity( hop.getLocationCoordinates() ) );

        return hopEntity;
    }

    @Override
    public Hop entityToDto(HopEntity hop) {
        if ( hop == null ) {
            return null;
        }

        Hop hopDto = new Hop();

        hopDto.setHopType( hop.getHopType() );
        hopDto.setCode( hop.getCode() );
        hopDto.setDescription( hop.getDescription() );
        hopDto.setProcessingDelayMins( hop.getProcessingDelayMins() );
        hopDto.setLocationName( hop.getLocationName() );
        hopDto.setLocationCoordinates( geoCoordinateEntityToGeoCoordinateDto( hop.getLocationCoordinates() ) );

        return hopDto;
    }

    protected GeoCoordinateEntity geoCoordinateDtoToGeoCoordinateEntity(GeoCoordinate geoCoordinate) {
        if ( geoCoordinate == null ) {
            return null;
        }

        GeoCoordinateEntity geoCoordinateEntity = new GeoCoordinateEntity();

        geoCoordinateEntity.setLat( geoCoordinate.getLat() );
        geoCoordinateEntity.setLon( geoCoordinate.getLon() );

        return geoCoordinateEntity;
    }

    protected GeoCoordinate geoCoordinateEntityToGeoCoordinateDto(GeoCoordinateEntity geoCoordinateEntity) {
        if ( geoCoordinateEntity == null ) {
            return null;
        }

        GeoCoordinate geoCoordinate = new GeoCoordinate();

        geoCoordinate.setLat( geoCoordinateEntity.getLat() );
        geoCoordinate.setLon( geoCoordinateEntity.getLon() );

        return geoCoordinate;
    }
}
