package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.GeoCoordinateEntity;
import at.fhtw.swen3.persistence.entity.HopEntity;
import at.fhtw.swen3.persistence.entity.WarehouseEntity;
import at.fhtw.swen3.persistence.entity.WarehouseNextHopsEntity;
import at.fhtw.swen3.services.dto.GeoCoordinateDto;
import at.fhtw.swen3.services.dto.HopDto;
import at.fhtw.swen3.services.dto.WarehouseDto;
import at.fhtw.swen3.services.dto.WarehouseNextHopsDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T20:38:03+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class WarehouseMapperImpl implements WarehouseMapper {

    @Override
    public WarehouseEntity dtoToEntity(WarehouseDto warehouseDto) {
        if ( warehouseDto == null ) {
            return null;
        }

        WarehouseEntity warehouse = new WarehouseEntity();

        warehouse.setLevel( warehouseDto.getLevel() );
        warehouse.setNextHops( warehouseNextHopsDtoListToWarehouseNextHopsList( warehouseDto.getNextHops() ) );

        return warehouse;
    }

    @Override
    public WarehouseDto entityToDto(WarehouseEntity warehouse) {
        if ( warehouse == null ) {
            return null;
        }

        WarehouseDto warehouseDto = new WarehouseDto();

        warehouseDto.setLevel( warehouse.getLevel() );
        warehouseDto.setNextHops( warehouseNextHopsListToWarehouseNextHopsDtoList( warehouse.getNextHops() ) );

        return warehouseDto;
    }

    protected GeoCoordinateEntity geoCoordinateDtoToGeoCoordinate(GeoCoordinateDto geoCoordinateDto) {
        if ( geoCoordinateDto == null ) {
            return null;
        }

        GeoCoordinateEntity geoCoordinate = new GeoCoordinateEntity();

        geoCoordinate.setLat( geoCoordinateDto.getLat() );
        geoCoordinate.setLon( geoCoordinateDto.getLon() );

        return geoCoordinate;
    }

    protected HopEntity hopDtoToHop(HopDto hopDto) {
        if ( hopDto == null ) {
            return null;
        }

        HopEntity hop = new HopEntity();

        hop.setHopType( hopDto.getHopType() );
        hop.setCode( hopDto.getCode() );
        hop.setDescription( hopDto.getDescription() );
        hop.setProcessingDelayMins( hopDto.getProcessingDelayMins() );
        hop.setLocationName( hopDto.getLocationName() );
        hop.setLocationCoordinates( geoCoordinateDtoToGeoCoordinate( hopDto.getLocationCoordinates() ) );

        return hop;
    }

    protected WarehouseNextHopsEntity warehouseNextHopsDtoToWarehouseNextHops(WarehouseNextHopsDto warehouseNextHopsDto) {
        if ( warehouseNextHopsDto == null ) {
            return null;
        }

        WarehouseNextHopsEntity warehouseNextHops = new WarehouseNextHopsEntity();

        warehouseNextHops.setTraveltimeMins( warehouseNextHopsDto.getTraveltimeMins() );
        warehouseNextHops.setHop( hopDtoToHop( warehouseNextHopsDto.getHop() ) );

        return warehouseNextHops;
    }

    protected List<WarehouseNextHopsEntity> warehouseNextHopsDtoListToWarehouseNextHopsList(List<WarehouseNextHopsDto> list) {
        if ( list == null ) {
            return null;
        }

        List<WarehouseNextHopsEntity> list1 = new ArrayList<WarehouseNextHopsEntity>( list.size() );
        for ( WarehouseNextHopsDto warehouseNextHopsDto : list ) {
            list1.add( warehouseNextHopsDtoToWarehouseNextHops( warehouseNextHopsDto ) );
        }

        return list1;
    }

    protected GeoCoordinateDto geoCoordinateToGeoCoordinateDto(GeoCoordinateEntity geoCoordinate) {
        if ( geoCoordinate == null ) {
            return null;
        }

        GeoCoordinateDto geoCoordinateDto = new GeoCoordinateDto();

        geoCoordinateDto.setLat( geoCoordinate.getLat() );
        geoCoordinateDto.setLon( geoCoordinate.getLon() );

        return geoCoordinateDto;
    }

    protected HopDto hopToHopDto(HopEntity hop) {
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

    protected WarehouseNextHopsDto warehouseNextHopsToWarehouseNextHopsDto(WarehouseNextHopsEntity warehouseNextHops) {
        if ( warehouseNextHops == null ) {
            return null;
        }

        WarehouseNextHopsDto warehouseNextHopsDto = new WarehouseNextHopsDto();

        warehouseNextHopsDto.setTraveltimeMins( warehouseNextHops.getTraveltimeMins() );
        warehouseNextHopsDto.setHop( hopToHopDto( warehouseNextHops.getHop() ) );

        return warehouseNextHopsDto;
    }

    protected List<WarehouseNextHopsDto> warehouseNextHopsListToWarehouseNextHopsDtoList(List<WarehouseNextHopsEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<WarehouseNextHopsDto> list1 = new ArrayList<WarehouseNextHopsDto>( list.size() );
        for ( WarehouseNextHopsEntity warehouseNextHops : list ) {
            list1.add( warehouseNextHopsToWarehouseNextHopsDto( warehouseNextHops ) );
        }

        return list1;
    }
}
