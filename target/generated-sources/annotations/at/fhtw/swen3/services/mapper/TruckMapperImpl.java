package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.TruckEntity;
import at.fhtw.swen3.services.dto.Truck;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T20:59:40+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
public class TruckMapperImpl implements TruckMapper {

    @Override
    public TruckEntity dtoToEntity(Truck truckDto) {
        if ( truckDto == null ) {
            return null;
        }

        TruckEntity truckEntity = new TruckEntity();

        truckEntity.setRegionGeoJson( truckDto.getRegionGeoJson() );
        truckEntity.setNumberPlate( truckDto.getNumberPlate() );

        return truckEntity;
    }

    @Override
    public Truck entityToDto(TruckEntity truck) {
        if ( truck == null ) {
            return null;
        }

        Truck truckDto = new Truck();

        truckDto.setRegionGeoJson( truck.getRegionGeoJson() );
        truckDto.setNumberPlate( truck.getNumberPlate() );

        return truckDto;
    }
}
