package at.fhtw.swen3.persistence.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransferwarehouseEntity {
    private String regionGeoJson = null;
    private String logisticsPartner = null;
    private String logisticsPartnerUrl = null;
}
