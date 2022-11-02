package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.GeoCoordinateEntity;
import at.fhtw.swen3.persistence.entity.HopEntity;
import at.fhtw.swen3.persistence.entity.WarehouseEntity;
import at.fhtw.swen3.persistence.entity.WarehouseNextHopsEntity;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import at.fhtw.swen3.services.dto.Hop;
import at.fhtw.swen3.services.dto.Warehouse;
import at.fhtw.swen3.services.dto.WarehouseNextHops;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T20:59:40+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
public class WarehouseMapperImpl implements WarehouseMapper {

    @Override
    public WarehouseEntity dtoToEntity(Warehouse warehouseDto) {
        if ( warehouseDto == null ) {
            return null;
        }

        WarehouseEntity warehouseEntity = new WarehouseEntity();

        warehouseEntity.setLevel( warehouseDto.getLevel() );
        warehouseEntity.setNextHops( warehouseNextHopsDtoListToWarehouseNextHopsEntityList( warehouseDto.getNextHops() ) );

        return warehouseEntity;
    }

    @Override
    public Warehouse entityToDto(WarehouseEntity warehouse) {
        if ( warehouse == null ) {
            return null;
        }

        Warehouse warehouseDto = new Warehouse();

        warehouseDto.setLevel( warehouse.getLevel() );
        warehouseDto.setNextHops( warehouseNextHopsEntityListToWarehouseNextHopsDtoList( warehouse.getNextHops() ) );

        return warehouseDto;
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

    protected HopEntity hopDtoToHopEntity(Hop hop) {
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

    protected WarehouseNextHopsEntity warehouseNextHopsDtoToWarehouseNextHopsEntity(WarehouseNextHops warehouseNextHops) {
        if ( warehouseNextHops == null ) {
            return null;
        }

        WarehouseNextHopsEntity warehouseNextHopsEntity = new WarehouseNextHopsEntity();

        warehouseNextHopsEntity.setTraveltimeMins( warehouseNextHops.getTraveltimeMins() );
        warehouseNextHopsEntity.setHop( hopDtoToHopEntity( warehouseNextHops.getHop() ) );

        return warehouseNextHopsEntity;
    }

    protected List<WarehouseNextHopsEntity> warehouseNextHopsDtoListToWarehouseNextHopsEntityList(List<WarehouseNextHops> list) {
        if ( list == null ) {
            return null;
        }

        List<WarehouseNextHopsEntity> list1 = new ArrayList<WarehouseNextHopsEntity>( list.size() );
        for ( WarehouseNextHops warehouseNextHops : list ) {
            list1.add( warehouseNextHopsDtoToWarehouseNextHopsEntity(warehouseNextHops) );
        }

        return list1;
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

    protected Hop hopEntityToHopDto(HopEntity hopEntity) {
        if ( hopEntity == null ) {
            return null;
        }

        Hop hop = new Hop();

        hop.setHopType( hopEntity.getHopType() );
        hop.setCode( hopEntity.getCode() );
        hop.setDescription( hopEntity.getDescription() );
        hop.setProcessingDelayMins( hopEntity.getProcessingDelayMins() );
        hop.setLocationName( hopEntity.getLocationName() );
        hop.setLocationCoordinates( geoCoordinateEntityToGeoCoordinateDto( hopEntity.getLocationCoordinates() ) );

        return hop;
    }

    protected WarehouseNextHops warehouseNextHopsEntityToWarehouseNextHopsDto(WarehouseNextHopsEntity warehouseNextHopsEntity) {
        if ( warehouseNextHopsEntity == null ) {
            return null;
        }

        WarehouseNextHops warehouseNextHops = new WarehouseNextHops();

        warehouseNextHops.setTraveltimeMins( warehouseNextHopsEntity.getTraveltimeMins() );
        warehouseNextHops.setHop( hopEntityToHopDto( warehouseNextHopsEntity.getHop() ) );

        return warehouseNextHops;
    }

    protected List<WarehouseNextHops> warehouseNextHopsEntityListToWarehouseNextHopsDtoList(List<WarehouseNextHopsEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<WarehouseNextHops> list1 = new ArrayList<WarehouseNextHops>( list.size() );
        for ( WarehouseNextHopsEntity warehouseNextHopsEntity : list ) {
            list1.add( warehouseNextHopsEntityToWarehouseNextHopsDto( warehouseNextHopsEntity ) );
        }

        return list1;
    }
}
