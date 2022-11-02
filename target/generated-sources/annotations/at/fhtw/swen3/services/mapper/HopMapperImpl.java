package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.Hop;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T18:21:49+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class HopMapperImpl implements HopMapper {

    @Override
    public Hop dtoToEntity(at.fhtw.swen3.services.dto.Hop hop) {
        if ( hop == null ) {
            return null;
        }

        Hop hop1 = new Hop();

        return hop1;
    }

    @Override
    public at.fhtw.swen3.services.dto.Hop entityToDto(Hop hop) {
        if ( hop == null ) {
            return null;
        }

        at.fhtw.swen3.services.dto.Hop hop1 = new at.fhtw.swen3.services.dto.Hop();

        return hop1;
    }
}
