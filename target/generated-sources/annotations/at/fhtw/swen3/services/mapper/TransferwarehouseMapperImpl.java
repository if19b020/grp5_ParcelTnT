package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.TransferwarehouseEntity;
import at.fhtw.swen3.services.dto.Transferwarehouse;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-19T16:28:09+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class TransferwarehouseMapperImpl implements TransferwarehouseMapper {

    @Override
    public TransferwarehouseEntity dtoToEntity(Transferwarehouse transferwarehouseDto) {
        if ( transferwarehouseDto == null ) {
            return null;
        }

        TransferwarehouseEntity transferwarehouseEntity = new TransferwarehouseEntity();

        transferwarehouseEntity.setRegionGeoJson( transferwarehouseDto.getRegionGeoJson() );
        transferwarehouseEntity.setLogisticsPartner( transferwarehouseDto.getLogisticsPartner() );
        transferwarehouseEntity.setLogisticsPartnerUrl( transferwarehouseDto.getLogisticsPartnerUrl() );

        return transferwarehouseEntity;
    }

    @Override
    public Transferwarehouse entityToDto(TransferwarehouseEntity transferwarehouse) {
        if ( transferwarehouse == null ) {
            return null;
        }

        Transferwarehouse transferwarehouse1 = new Transferwarehouse();

        transferwarehouse1.setRegionGeoJson( transferwarehouse.getRegionGeoJson() );
        transferwarehouse1.setLogisticsPartner( transferwarehouse.getLogisticsPartner() );
        transferwarehouse1.setLogisticsPartnerUrl( transferwarehouse.getLogisticsPartnerUrl() );

        return transferwarehouse1;
    }
}
