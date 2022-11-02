package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.GeoCoordinate;
import at.fhtw.swen3.persistence.entity.Hop;
import at.fhtw.swen3.persistence.entity.Warehouse;
import at.fhtw.swen3.persistence.entity.WarehouseNextHops;
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
    public Warehouse dtoToEntity(WarehouseDto warehouseDto) {
        if ( warehouseDto == null ) {
            return null;
        }

        Warehouse warehouse = new Warehouse();

        warehouse.setLevel( warehouseDto.getLevel() );
        warehouse.setNextHops( warehouseNextHopsDtoListToWarehouseNextHopsList( warehouseDto.getNextHops() ) );

        return warehouse;
    }

    @Override
    public WarehouseDto entityToDto(Warehouse warehouse) {
        if ( warehouse == null ) {
            return null;
        }

        WarehouseDto warehouseDto = new WarehouseDto();

        warehouseDto.setLevel( warehouse.getLevel() );
        warehouseDto.setNextHops( warehouseNextHopsListToWarehouseNextHopsDtoList( warehouse.getNextHops() ) );

        return warehouseDto;
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

    protected WarehouseNextHops warehouseNextHopsDtoToWarehouseNextHops(WarehouseNextHopsDto warehouseNextHopsDto) {
        if ( warehouseNextHopsDto == null ) {
            return null;
        }

        WarehouseNextHops warehouseNextHops = new WarehouseNextHops();

        warehouseNextHops.setTraveltimeMins( warehouseNextHopsDto.getTraveltimeMins() );
        warehouseNextHops.setHop( hopDtoToHop( warehouseNextHopsDto.getHop() ) );

        return warehouseNextHops;
    }

    protected List<WarehouseNextHops> warehouseNextHopsDtoListToWarehouseNextHopsList(List<WarehouseNextHopsDto> list) {
        if ( list == null ) {
            return null;
        }

        List<WarehouseNextHops> list1 = new ArrayList<WarehouseNextHops>( list.size() );
        for ( WarehouseNextHopsDto warehouseNextHopsDto : list ) {
            list1.add( warehouseNextHopsDtoToWarehouseNextHops( warehouseNextHopsDto ) );
        }

        return list1;
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

    protected WarehouseNextHopsDto warehouseNextHopsToWarehouseNextHopsDto(WarehouseNextHops warehouseNextHops) {
        if ( warehouseNextHops == null ) {
            return null;
        }

        WarehouseNextHopsDto warehouseNextHopsDto = new WarehouseNextHopsDto();

        warehouseNextHopsDto.setTraveltimeMins( warehouseNextHops.getTraveltimeMins() );
        warehouseNextHopsDto.setHop( hopToHopDto( warehouseNextHops.getHop() ) );

        return warehouseNextHopsDto;
    }

    protected List<WarehouseNextHopsDto> warehouseNextHopsListToWarehouseNextHopsDtoList(List<WarehouseNextHops> list) {
        if ( list == null ) {
            return null;
        }

        List<WarehouseNextHopsDto> list1 = new ArrayList<WarehouseNextHopsDto>( list.size() );
        for ( WarehouseNextHops warehouseNextHops : list ) {
            list1.add( warehouseNextHopsToWarehouseNextHopsDto( warehouseNextHops ) );
        }

        return list1;
    }
}
