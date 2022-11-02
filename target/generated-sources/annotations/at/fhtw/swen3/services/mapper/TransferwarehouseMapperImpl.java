package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.Transferwarehouse;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-02T18:26:22+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class TransferwarehouseMapperImpl implements TransferwarehouseMapper {

    @Override
    public Transferwarehouse dtoToEntity(at.fhtw.swen3.services.dto.Transferwarehouse transferwarehouseDto) {
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
    public at.fhtw.swen3.services.dto.Transferwarehouse entityToDto(Transferwarehouse transferwarehouse) {
        if ( transferwarehouse == null ) {
            return null;
        }

        at.fhtw.swen3.services.dto.Transferwarehouse transferwarehouse1 = new at.fhtw.swen3.services.dto.Transferwarehouse();

        transferwarehouse1.setRegionGeoJson( transferwarehouse.getRegionGeoJson() );
        transferwarehouse1.setLogisticsPartner( transferwarehouse.getLogisticsPartner() );
        transferwarehouse1.setLogisticsPartnerUrl( transferwarehouse.getLogisticsPartnerUrl() );

        return transferwarehouse1;
    }
}
