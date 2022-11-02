package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.Transferwarehouse;
import at.fhtw.swen3.services.dto.TransferwarehouseDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T20:38:03+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class TransferwarehouseMapperImpl implements TransferwarehouseMapper {

    @Override
    public Transferwarehouse dtoToEntity(TransferwarehouseDto transferwarehouseDto) {
        if ( transferwarehouseDto == null ) {
            return null;
        }

        Transferwarehouse transferwarehouse = new Transferwarehouse();

        transferwarehouse.setRegionGeoJson( transferwarehouseDto.getRegionGeoJson() );
        transferwarehouse.setLogisticsPartner( transferwarehouseDto.getLogisticsPartner() );
        transferwarehouse.setLogisticsPartnerUrl( transferwarehouseDto.getLogisticsPartnerUrl() );

        return transferwarehouse;
    }

    @Override
    public TransferwarehouseDto entityToDto(Transferwarehouse transferwarehouse) {
        if ( transferwarehouse == null ) {
            return null;
        }

        TransferwarehouseDto transferwarehouseDto = new TransferwarehouseDto();

        transferwarehouseDto.setRegionGeoJson( transferwarehouse.getRegionGeoJson() );
        transferwarehouseDto.setLogisticsPartner( transferwarehouse.getLogisticsPartner() );
        transferwarehouseDto.setLogisticsPartnerUrl( transferwarehouse.getLogisticsPartnerUrl() );

        return transferwarehouseDto;
    }
}
