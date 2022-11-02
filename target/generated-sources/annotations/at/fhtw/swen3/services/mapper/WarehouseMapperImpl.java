package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.Hop;
import at.fhtw.swen3.persistence.entity.Warehouse;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import at.fhtw.swen3.services.dto.WarehouseNextHops;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T18:26:22+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class WarehouseMapperImpl implements WarehouseMapper {

    @Override
    public Warehouse dtoToEntity(at.fhtw.swen3.services.dto.Warehouse warehouseDto) {
        if ( warehouseDto == null ) {
            return null;
        }

        Warehouse warehouse = new Warehouse();

        warehouse.setLevel( warehouseDto.getLevel() );
        warehouse.setNextHops( warehouseNextHopsListToWarehouseNextHopsList( warehouseDto.getNextHops() ) );

        return warehouse;
    }

    @Override
    public at.fhtw.swen3.services.dto.Warehouse entityToDto(Warehouse warehouse) {
        if ( warehouse == null ) {
            return null;
        }

        at.fhtw.swen3.services.dto.Warehouse warehouse1 = new at.fhtw.swen3.services.dto.Warehouse();

        warehouse1.setLevel( warehouse.getLevel() );
        warehouse1.setNextHops( warehouseNextHopsListToWarehouseNextHopsList1( warehouse.getNextHops() ) );

        return warehouse1;
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

    protected at.fhtw.swen3.persistence.entity.WarehouseNextHops warehouseNextHopsToWarehouseNextHops(WarehouseNextHops warehouseNextHops) {
        if ( warehouseNextHops == null ) {
            return null;
        }

        at.fhtw.swen3.persistence.entity.WarehouseNextHops warehouseNextHops1 = new at.fhtw.swen3.persistence.entity.WarehouseNextHops();

        warehouseNextHops1.setTraveltimeMins( warehouseNextHops.getTraveltimeMins() );
        warehouseNextHops1.setHop( hopToHop( warehouseNextHops.getHop() ) );

        return warehouseNextHops1;
    }

    protected List<at.fhtw.swen3.persistence.entity.WarehouseNextHops> warehouseNextHopsListToWarehouseNextHopsList(List<WarehouseNextHops> list) {
        if ( list == null ) {
            return null;
        }

        List<at.fhtw.swen3.persistence.entity.WarehouseNextHops> list1 = new ArrayList<at.fhtw.swen3.persistence.entity.WarehouseNextHops>( list.size() );
        for ( WarehouseNextHops warehouseNextHops : list ) {
            list1.add( warehouseNextHopsToWarehouseNextHops( warehouseNextHops ) );
        }

        return list1;
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

    protected WarehouseNextHops warehouseNextHopsToWarehouseNextHops1(at.fhtw.swen3.persistence.entity.WarehouseNextHops warehouseNextHops) {
        if ( warehouseNextHops == null ) {
            return null;
        }

        WarehouseNextHops warehouseNextHops1 = new WarehouseNextHops();

        warehouseNextHops1.setTraveltimeMins( warehouseNextHops.getTraveltimeMins() );
        warehouseNextHops1.setHop( hopToHop1( warehouseNextHops.getHop() ) );

        return warehouseNextHops1;
    }

    protected List<WarehouseNextHops> warehouseNextHopsListToWarehouseNextHopsList1(List<at.fhtw.swen3.persistence.entity.WarehouseNextHops> list) {
        if ( list == null ) {
            return null;
        }

        List<WarehouseNextHops> list1 = new ArrayList<WarehouseNextHops>( list.size() );
        for ( at.fhtw.swen3.persistence.entity.WarehouseNextHops warehouseNextHops : list ) {
            list1.add( warehouseNextHopsToWarehouseNextHops1( warehouseNextHops ) );
        }

        return list1;
    }
}
