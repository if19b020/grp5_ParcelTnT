package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.TruckEntity;
import at.fhtw.swen3.services.dto.Truck;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-06T20:07:38+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
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

        Truck truck1 = new Truck();

        truck1.setRegionGeoJson( truck.getRegionGeoJson() );
        truck1.setNumberPlate( truck.getNumberPlate() );

        return truck1;
    }
}
