package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.WarehouseNextHops;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T18:21:49+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class WarehouseNextHopsMapperImpl implements WarehouseNextHopsMapper {

    @Override
    public at.fhtw.swen3.persistence.entity.WarehouseNextHops dtoToEntity(WarehouseNextHops warehouseNextHopsDto) {
        if ( warehouseNextHopsDto == null ) {
            return null;
        }

        at.fhtw.swen3.persistence.entity.WarehouseNextHops warehouseNextHops = new at.fhtw.swen3.persistence.entity.WarehouseNextHops();

        return warehouseNextHops;
    }

    @Override
    public WarehouseNextHops entityToDto(at.fhtw.swen3.persistence.entity.WarehouseNextHops warehouseNextHops) {
        if ( warehouseNextHops == null ) {
            return null;
        }

        WarehouseNextHops warehouseNextHops1 = new WarehouseNextHops();

        return warehouseNextHops1;
    }
}
