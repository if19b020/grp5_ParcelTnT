package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.Hop;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import at.fhtw.swen3.services.dto.WarehouseNextHops;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T18:26:22+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class WarehouseNextHopsMapperImpl implements WarehouseNextHopsMapper {

    @Override
    public at.fhtw.swen3.persistence.entity.WarehouseNextHops dtoToEntity(WarehouseNextHops warehouseNextHopsDto) {
        if ( warehouseNextHopsDto == null ) {
            return null;
        }

        at.fhtw.swen3.persistence.entity.WarehouseNextHops warehouseNextHops = new at.fhtw.swen3.persistence.entity.WarehouseNextHops();

        warehouseNextHops.setTraveltimeMins( warehouseNextHopsDto.getTraveltimeMins() );
        warehouseNextHops.setHop( hopToHop( warehouseNextHopsDto.getHop() ) );

        return warehouseNextHops;
    }

    @Override
    public WarehouseNextHops entityToDto(at.fhtw.swen3.persistence.entity.WarehouseNextHops warehouseNextHops) {
        if ( warehouseNextHops == null ) {
            return null;
        }

        WarehouseNextHops warehouseNextHops1 = new WarehouseNextHops();

        warehouseNextHops1.setTraveltimeMins( warehouseNextHops.getTraveltimeMins() );
        warehouseNextHops1.setHop( hopToHop1( warehouseNextHops.getHop() ) );

        return warehouseNextHops1;
    }

    protected at.fhtw.swen3.persistence.entity.GeoCoordinate geoCoordinateToGeoCoordinate(GeoCoordinate geoCoordinate) {
        if ( geoCoordinate == null ) {
            return null;
        }

        at.fhtw.swen3.persistence.entity.GeoCoordinate geoCoordinate1 = new at.fhtw.swen3.persistence.entity.GeoCoordinate();

        geoCoordinate1.setLat( geoCoordinate.getLat() );
        geoCoordinate1.setLon( geoCoordinate.getLon() );

        return geoCoordinate1;
    }

    protected Hop hopToHop(at.fhtw.swen3.services.dto.Hop hop) {
        if ( hop == null ) {
            return null;
        }

        Hop hop1 = new Hop();

        hop1.setHopType( hop.getHopType() );
        hop1.setCode( hop.getCode() );
        hop1.setDescription( hop.getDescription() );
        hop1.setProcessingDelayMins( hop.getProcessingDelayMins() );
        hop1.setLocationName( hop.getLocationName() );
        hop1.setLocationCoordinates( geoCoordinateToGeoCoordinate( hop.getLocationCoordinates() ) );

        return hop1;
    }

    protected GeoCoordinate geoCoordinateToGeoCoordinate1(at.fhtw.swen3.persistence.entity.GeoCoordinate geoCoordinate) {
        if ( geoCoordinate == null ) {
            return null;
        }

        GeoCoordinate geoCoordinate1 = new GeoCoordinate();

        geoCoordinate1.setLat( geoCoordinate.getLat() );
        geoCoordinate1.setLon( geoCoordinate.getLon() );

        return geoCoordinate1;
    }

    protected at.fhtw.swen3.services.dto.Hop hopToHop1(Hop hop) {
        if ( hop == null ) {
            return null;
        }

        at.fhtw.swen3.services.dto.Hop hop1 = new at.fhtw.swen3.services.dto.Hop();

        hop1.setHopType( hop.getHopType() );
        hop1.setCode( hop.getCode() );
        hop1.setDescription( hop.getDescription() );
        hop1.setProcessingDelayMins( hop.getProcessingDelayMins() );
        hop1.setLocationName( hop.getLocationName() );
        hop1.setLocationCoordinates( geoCoordinateToGeoCoordinate1( hop.getLocationCoordinates() ) );

        return hop1;
    }
}
