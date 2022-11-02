package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.HopArrivalEntity;
import at.fhtw.swen3.services.dto.HopArrival;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T20:59:40+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
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

        HopArrival hopArrivalDto = new HopArrival();

        hopArrivalDto.setCode( hopArrival.getCode() );
        hopArrivalDto.setDescription( hopArrival.getDescription() );
        hopArrivalDto.setDateTime( hopArrival.getDateTime() );

        return hopArrivalDto;
    }
}
