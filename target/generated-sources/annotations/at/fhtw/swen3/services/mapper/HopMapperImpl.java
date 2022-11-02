package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.GeoCoordinate;
import at.fhtw.swen3.persistence.entity.Hop;
import at.fhtw.swen3.services.dto.GeoCoordinateDto;
import at.fhtw.swen3.services.dto.HopDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T20:24:21+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class HopMapperImpl implements HopMapper {

    @Override
    public Hop dtoToEntity(HopDto hop) {
        if ( hop == null ) {
            return null;
        }

        Hop hop1 = new Hop();

        hop1.setHopType( hop.getHopType() );
        hop1.setCode( hop.getCode() );
        hop1.setDescription( hop.getDescription() );
        hop1.setProcessingDelayMins( hop.getProcessingDelayMins() );
        hop1.setLocationName( hop.getLocationName() );
        hop1.setLocationCoordinates( geoCoordinateDtoToGeoCoordinate( hop.getLocationCoordinates() ) );

        return hop1;
    }

    @Override
    public HopDto entityToDto(Hop hop) {
        if ( hop == null ) {
            return null;
        }

        HopDto hopDto = new HopDto();

        hopDto.setHopType( hop.getHopType() );
        hopDto.setCode( hop.getCode() );
        hopDto.setDescription( hop.getDescription() );
        hopDto.setProcessingDelayMins( hop.getProcessingDelayMins() );
        hopDto.setLocationName( hop.getLocationName() );
        hopDto.setLocationCoordinates( geoCoordinateToGeoCoordinateDto( hop.getLocationCoordinates() ) );

        return hopDto;
    }

    protected GeoCoordinate geoCoordinateDtoToGeoCoordinate(GeoCoordinateDto geoCoordinateDto) {
        if ( geoCoordinateDto == null ) {
            return null;
        }

        GeoCoordinate geoCoordinate = new GeoCoordinate();

        geoCoordinate.setLat( geoCoordinateDto.getLat() );
        geoCoordinate.setLon( geoCoordinateDto.getLon() );

        return geoCoordinate;
    }

    protected GeoCoordinateDto geoCoordinateToGeoCoordinateDto(GeoCoordinate geoCoordinate) {
        if ( geoCoordinate == null ) {
            return null;
        }

        GeoCoordinateDto geoCoordinateDto = new GeoCoordinateDto();

        geoCoordinateDto.setLat( geoCoordinate.getLat() );
        geoCoordinateDto.setLon( geoCoordinate.getLon() );

        return geoCoordinateDto;
    }
}
