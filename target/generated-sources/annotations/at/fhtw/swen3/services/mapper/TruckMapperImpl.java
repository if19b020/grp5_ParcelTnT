package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.Truck;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T18:26:22+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class TruckMapperImpl implements TruckMapper {

    @Override
    public Truck dtoToEntity(at.fhtw.swen3.services.dto.Truck truckDto) {
        if ( truckDto == null ) {
            return null;
        }

        Truck truck = new Truck();

        truck.setRegionGeoJson( truckDto.getRegionGeoJson() );
        truck.setNumberPlate( truckDto.getNumberPlate() );

        return truck;
    }

    @Override
    public at.fhtw.swen3.services.dto.Truck entityToDto(Truck truck) {
        if ( truck == null ) {
            return null;
        }

        at.fhtw.swen3.services.dto.Truck truck1 = new at.fhtw.swen3.services.dto.Truck();

        truck1.setRegionGeoJson( truck.getRegionGeoJson() );
        truck1.setNumberPlate( truck.getNumberPlate() );

        return truck1;
    }
}
