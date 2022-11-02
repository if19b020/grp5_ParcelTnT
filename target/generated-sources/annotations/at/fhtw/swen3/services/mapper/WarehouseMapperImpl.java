package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.Warehouse;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T18:21:49+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class WarehouseMapperImpl implements WarehouseMapper {

    @Override
    public Warehouse dtoToEntity(at.fhtw.swen3.services.dto.Warehouse warehouseDto) {
        if ( warehouseDto == null ) {
            return null;
        }

        Warehouse warehouse = new Warehouse();

        return warehouse;
    }

    @Override
    public at.fhtw.swen3.services.dto.Warehouse entityToDto(Warehouse warehouse) {
        if ( warehouse == null ) {
            return null;
        }

        at.fhtw.swen3.services.dto.Warehouse warehouse1 = new at.fhtw.swen3.services.dto.Warehouse();

        return warehouse1;
    }
}
