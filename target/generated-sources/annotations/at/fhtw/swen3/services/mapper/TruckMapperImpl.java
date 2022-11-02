package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.Truck;
import at.fhtw.swen3.services.dto.TruckDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T20:38:03+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class TruckMapperImpl implements TruckMapper {

    @Override
    public Truck dtoToEntity(TruckDto truckDto) {
        if ( truckDto == null ) {
            return null;
        }

        Truck truck = new Truck();

        truck.setRegionGeoJson( truckDto.getRegionGeoJson() );
        truck.setNumberPlate( truckDto.getNumberPlate() );

        return truck;
    }

    @Override
    public TruckDto entityToDto(Truck truck) {
        if ( truck == null ) {
            return null;
        }

        TruckDto truckDto = new TruckDto();

        truckDto.setRegionGeoJson( truck.getRegionGeoJson() );
        truckDto.setNumberPlate( truck.getNumberPlate() );

        return truckDto;
    }
}
