package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.TransferwarehouseEntity;
import at.fhtw.swen3.services.dto.Transferwarehouse;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T20:59:40+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
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

        Transferwarehouse transferwarehouseDto = new Transferwarehouse();

        transferwarehouseDto.setRegionGeoJson( transferwarehouse.getRegionGeoJson() );
        transferwarehouseDto.setLogisticsPartner( transferwarehouse.getLogisticsPartner() );
        transferwarehouseDto.setLogisticsPartnerUrl( transferwarehouse.getLogisticsPartnerUrl() );

        return transferwarehouseDto;
    }
}
