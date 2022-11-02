package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.GeoCoordinate;
import at.fhtw.swen3.persistence.entity.Hop;
import at.fhtw.swen3.persistence.entity.WarehouseNextHops;
import at.fhtw.swen3.services.dto.GeoCoordinateDto;
import at.fhtw.swen3.services.dto.HopDto;
import at.fhtw.swen3.services.dto.WarehouseNextHopsDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T20:24:21+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class WarehouseNextHopsMapperImpl implements WarehouseNextHopsMapper {

    @Override
    public WarehouseNextHops dtoToEntity(WarehouseNextHopsDto warehouseNextHopsDto) {
        if ( warehouseNextHopsDto == null ) {
            return null;
        }

        WarehouseNextHops warehouseNextHops = new WarehouseNextHops();

        warehouseNextHops.setTraveltimeMins( warehouseNextHopsDto.getTraveltimeMins() );
        warehouseNextHops.setHop( hopDtoToHop( warehouseNextHopsDto.getHop() ) );

        return warehouseNextHops;
    }

    @Override
    public WarehouseNextHopsDto entityToDto(WarehouseNextHops warehouseNextHops) {
        if ( warehouseNextHops == null ) {
            return null;
        }

        WarehouseNextHopsDto warehouseNextHopsDto = new WarehouseNextHopsDto();

        warehouseNextHopsDto.setTraveltimeMins( warehouseNextHops.getTraveltimeMins() );
        warehouseNextHopsDto.setHop( hopToHopDto( warehouseNextHops.getHop() ) );

        return warehouseNextHopsDto;
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

    protected Hop hopDtoToHop(HopDto hopDto) {
        if ( hopDto == null ) {
            return null;
        }

        Hop hop = new Hop();

        hop.setHopType( hopDto.getHopType() );
        hop.setCode( hopDto.getCode() );
        hop.setDescription( hopDto.getDescription() );
        hop.setProcessingDelayMins( hopDto.getProcessingDelayMins() );
        hop.setLocationName( hopDto.getLocationName() );
        hop.setLocationCoordinates( geoCoordinateDtoToGeoCoordinate( hopDto.getLocationCoordinates() ) );

        return hop;
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

    protected HopDto hopToHopDto(Hop hop) {
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
}
