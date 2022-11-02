package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.Error;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T18:26:22+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class ErrorMapperImpl implements ErrorMapper {

    @Override
    public Error entityToDto(at.fhtw.swen3.persistence.entity.Error error) {
        if ( error == null ) {
            return null;
        }

        Error error1 = new Error();

        error1.setErrorMessage( error.getErrorMessage() );

        return error1;
    }

    @Override
    public at.fhtw.swen3.persistence.entity.Error dtoToEntity(Error errorDto) {
        if ( errorDto == null ) {
            return null;
        }

        at.fhtw.swen3.persistence.entity.Error error = new at.fhtw.swen3.persistence.entity.Error();

        error.setErrorMessage( errorDto.getErrorMessage() );

        return error;
    }
}
