package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.HopArrival;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T18:26:22+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class HopArrivalMapperImpl implements HopArrivalMapper {

    @Override
    public HopArrival dtoToEntity(at.fhtw.swen3.services.dto.HopArrival hopArrival) {
        if ( hopArrival == null ) {
            return null;
        }

        HopArrival hopArrival1 = new HopArrival();

        hopArrival1.setCode( hopArrival.getCode() );
        hopArrival1.setDescription( hopArrival.getDescription() );
        hopArrival1.setDateTime( hopArrival.getDateTime() );

        return hopArrival1;
    }

    @Override
    public at.fhtw.swen3.services.dto.HopArrival entityToDto(HopArrival hopArrival) {
        if ( hopArrival == null ) {
            return null;
        }

        at.fhtw.swen3.services.dto.HopArrival hopArrival1 = new at.fhtw.swen3.services.dto.HopArrival();

        hopArrival1.setCode( hopArrival.getCode() );
        hopArrival1.setDescription( hopArrival.getDescription() );
        hopArrival1.setDateTime( hopArrival.getDateTime() );

        return hopArrival1;
    }
}
