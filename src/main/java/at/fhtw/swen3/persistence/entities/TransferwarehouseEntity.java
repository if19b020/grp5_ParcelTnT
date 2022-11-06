package at.fhtw.swen3.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "error")
public class TransferwarehouseEntity {
    private String regionGeoJson = null;
    private String logisticsPartner = null;
    private String logisticsPartnerUrl = null;
}
