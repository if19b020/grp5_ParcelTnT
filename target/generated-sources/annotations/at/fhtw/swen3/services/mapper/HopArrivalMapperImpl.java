package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.HopArrivalEntity;
import at.fhtw.swen3.services.dto.HopArrivalDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T20:38:03+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class HopArrivalMapperImpl implements HopArrivalMapper {

    @Override
    public HopArrivalEntity dtoToEntity(HopArrivalDto hopArrival) {
        if ( hopArrival == null ) {
            return null;
        }

        HopArrivalEntity hopArrival1 = new HopArrivalEntity();

        hopArrival1.setCode( hopArrival.getCode() );
        hopArrival1.setDescription( hopArrival.getDescription() );
        hopArrival1.setDateTime( hopArrival.getDateTime() );

        return hopArrival1;
    }

    @Override
    public HopArrivalDto entityToDto(HopArrivalEntity hopArrival) {
        if ( hopArrival == null ) {
            return null;
        }

        HopArrivalDto hopArrivalDto = new HopArrivalDto();

        hopArrivalDto.setCode( hopArrival.getCode() );
        hopArrivalDto.setDescription( hopArrival.getDescription() );
        hopArrivalDto.setDateTime( hopArrival.getDateTime() );

        return hopArrivalDto;
    }
}
