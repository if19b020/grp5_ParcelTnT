package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.ErrorEntity;
import at.fhtw.swen3.services.dto.ErrorDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T20:38:04+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class ErrorMapperImpl implements ErrorMapper {

    @Override
    public ErrorDto entityToDto(ErrorEntity error) {
        if ( error == null ) {
            return null;
        }

        ErrorDto errorDto = new ErrorDto();

        errorDto.setErrorMessage( error.getErrorMessage() );

        return errorDto;
    }

    @Override
    public ErrorEntity dtoToEntity(ErrorDto errorDto) {
        if ( errorDto == null ) {
            return null;
        }

        ErrorEntity error = new ErrorEntity();

        error.setErrorMessage( errorDto.getErrorMessage() );

        return error;
    }
}
