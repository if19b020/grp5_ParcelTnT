package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.ErrorEntity;
import at.fhtw.swen3.services.dto.Error;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-19T16:28:09+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class ErrorMapperImpl implements ErrorMapper {

    @Override
    public Error entityToDto(ErrorEntity error) {
        if ( error == null ) {
            return null;
        }

        Error error1 = new Error();

        error1.setErrorMessage( error.getErrorMessage() );

        return error1;
    }

    @Override
    public ErrorEntity dtoToEntity(Error error) {
        if ( error == null ) {
            return null;
        }

        ErrorEntity errorEntity = new ErrorEntity();

        errorEntity.setErrorMessage( error.getErrorMessage() );

        return errorEntity;
    }
}
