package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.HopArrivalEntity;
import at.fhtw.swen3.services.dto.HopArrival;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-06T20:07:38+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class HopArrivalMapperImpl implements HopArrivalMapper {

    @Override
    public HopArrivalEntity dtoToEntity(HopArrival hopArrival) {
        if ( hopArrival == null ) {
            return null;
        }

        HopArrivalEntity hopArrivalEntity = new HopArrivalEntity();

        hopArrivalEntity.setCode( hopArrival.getCode() );
        hopArrivalEntity.setDescription( hopArrival.getDescription() );
        hopArrivalEntity.setDateTime( hopArrival.getDateTime() );

        return hopArrivalEntity;
    }

    @Override
    public HopArrival entityToDto(HopArrivalEntity hopArrival) {
        if ( hopArrival == null ) {
            return null;
        }

        HopArrival hopArrival1 = new HopArrival();

        hopArrival1.setCode( hopArrival.getCode() );
        hopArrival1.setDescription( hopArrival.getDescription() );
        hopArrival1.setDateTime( hopArrival.getDateTime() );

        return hopArrival1;
    }
}
