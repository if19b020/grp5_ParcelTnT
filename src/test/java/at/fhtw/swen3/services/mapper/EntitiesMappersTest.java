package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.*;
import at.fhtw.swen3.persistence.entity.Error;
import at.fhtw.swen3.services.dto.*;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class EntitiesMappersTest {

    //Error
    @Test
    public void errorToErrorDto(){
        Error error = new Error();
        error.setErrorMessage("some error message...");

        ErrorDto errorDto = ErrorMapper.INSTANCE.entityToDto(error);

        assertEquals( "some error message...", errorDto.getErrorMessage());
    }
    @Test
    public void errorDtoToError(){
        ErrorDto errorDto = new ErrorDto();
        errorDto.setErrorMessage("some error message...");

        Error error = ErrorMapper.INSTANCE.dtoToEntity(errorDto);

        assertEquals( "some error message...", error.getErrorMessage());
    }

    //GeoCoordinate
    @Test
    public void geoCoordinateToGeoCoordinateDto(){
        GeoCoordinate geoCoordinate = new GeoCoordinate();
        geoCoordinate.setLat(34.4);
        geoCoordinate.setLon(56.6);

        GeoCoordinateDto geoCoordinateDto = GeoCoordinateMapper.INSTANCE.entityToDto(geoCoordinate);

        assertEquals( "34.4", geoCoordinateDto.getLat().toString());
        assertEquals( "56.6", geoCoordinateDto.getLon().toString());
    }
    @Test
    public void geoCoordinateDtoToGeoCoordinate(){
        GeoCoordinateDto geoCoordinateDto = new GeoCoordinateDto();
        geoCoordinateDto.setLat(34.4);
        geoCoordinateDto.setLon(56.6);

        GeoCoordinate geoCoordinate = GeoCoordinateMapper.INSTANCE.dtoToEntity(geoCoordinateDto);

        assertEquals( "34.4", geoCoordinate.getLat().toString());
        assertEquals( "56.6", geoCoordinate.getLon().toString());
    }

    //Hop
    @Test
    public void hopToHopDto(){
        GeoCoordinate geoCoordinate = new GeoCoordinate();
        geoCoordinate.setLon(3.3);
        geoCoordinate.setLat(4.4);
        Hop hop = new Hop();
        hop.setHopType("some type...");
        hop.setCode("some code...");
        hop.setDescription("some description...");
        hop.setProcessingDelayMins(3);
        hop.setLocationName("some name...");
        hop.setLocationCoordinates(geoCoordinate);

        HopDto hopDto = HopMapper.INSTANCE.entityToDto(hop);

        assertEquals("some type...",hopDto.getHopType());
        assertEquals("some code...",hopDto.getCode());
        assertEquals("some description...",hopDto.getDescription());
        assertEquals("3",hopDto.getProcessingDelayMins().toString());
        assertEquals("some name...",hopDto.getLocationName());
        assertEquals("3.3",hopDto.getLocationCoordinates().getLon().toString());
        assertEquals("4.4",hopDto.getLocationCoordinates().getLat().toString());
    }
    @Test
    public void hopDtoToHop(){
        GeoCoordinateDto geoCoordinateDto = new GeoCoordinateDto();
        geoCoordinateDto.setLon(3.3);
        geoCoordinateDto.setLat(4.4);
        HopDto hopDto = new HopDto();
        hopDto.setHopType("some type...");
        hopDto.setCode("some code...");
        hopDto.setDescription("some description...");
        hopDto.setProcessingDelayMins(3);
        hopDto.setLocationName("some name...");
        hopDto.setLocationCoordinates(geoCoordinateDto);

        Hop hop = HopMapper.INSTANCE.dtoToEntity(hopDto);

        assertEquals("some type...",hop.getHopType());
        assertEquals("some code...",hop.getCode());
        assertEquals("some description...",hop.getDescription());
        assertEquals("3",hop.getProcessingDelayMins().toString());
        assertEquals("some name...",hop.getLocationName());
        assertEquals("3.3",hop.getLocationCoordinates().getLon().toString());
        assertEquals("4.4",hop.getLocationCoordinates().getLat().toString());
    }

    //HopArrival
    @Test
    public void hopArrivalToHopArrivalDto(){
        OffsetDateTime time = OffsetDateTime.now();
        HopArrival hopArrival = new HopArrival();
        hopArrival.setCode("some code...");
        hopArrival.setDescription("some description...");
        hopArrival.setDateTime(time);

        HopArrivalDto hopArrivalDto = HopArrivalMapper.INSTANCE.entityToDto(hopArrival);

        assertEquals("some code...",hopArrivalDto.getCode());
        assertEquals("some description...",hopArrivalDto.getDescription());
        assertEquals(time,hopArrivalDto.getDateTime());
    }
    @Test
    public void hopArrivalDtoToHopArrival(){
        OffsetDateTime time = OffsetDateTime.now();
        HopArrivalDto hopArrivalDto = new HopArrivalDto();
        hopArrivalDto.setCode("some code...");
        hopArrivalDto.setDescription("some description...");
        hopArrivalDto.setDateTime(time);

        HopArrival hopArrival = HopArrivalMapper.INSTANCE.dtoToEntity(hopArrivalDto);

        assertEquals("some code...",hopArrival.getCode());
        assertEquals("some description...",hopArrival.getDescription());
        assertEquals(time,hopArrival.getDateTime());
    }

    //Recipient
    @Test
    public void recipientToRecipientDto(){
        Recipient recipient = new Recipient();
        recipient.setName("some name...");
        recipient.setStreet("some street...");
        recipient.setPostalCode("some code...");
        recipient.setCity("some city...");
        recipient.setCountry("some country...");

        RecipientDto recipientDto = RecipientMapper.INSTANCE.entityToDto(recipient);

        assertEquals("some name...",recipientDto.getName());
        assertEquals("some street...",recipientDto.getStreet());
        assertEquals("some code...",recipientDto.getPostalCode());
        assertEquals("some city...",recipientDto.getCity());
        assertEquals("some country...",recipientDto.getCountry());
    }
    @Test
    public void recipientDtoToRecipient(){
        RecipientDto recipientDto = new RecipientDto();
        recipientDto.setName("some name...");
        recipientDto.setStreet("some street...");
        recipientDto.setPostalCode("some code...");
        recipientDto.setCity("some city...");
        recipientDto.setCountry("some country...");

        Recipient recipient = RecipientMapper.INSTANCE.dtoToEntity(recipientDto);

        assertEquals("some name...",recipient.getName());
        assertEquals("some street...",recipient.getStreet());
        assertEquals("some code...",recipient.getPostalCode());
        assertEquals("some city...",recipient.getCity());
        assertEquals("some country...",recipient.getCountry());
    }

    //Transfarewarehouse
    @Test
    public void transfarewarehouseToTransferwarehouseDto(){
        Transferwarehouse transferwarehouse = new Transferwarehouse();
        transferwarehouse.setRegionGeoJson("some text...");
        transferwarehouse.setLogisticsPartner("some text...");
        transferwarehouse.setLogisticsPartnerUrl("some text...");

        TransferwarehouseDto transferwarehouseDto = TransferwarehouseMapper.INSTANCE.entityToDto(transferwarehouse);

        assertEquals("some text...",transferwarehouseDto.getRegionGeoJson());
        assertEquals("some text...",transferwarehouseDto.getLogisticsPartner());
        assertEquals("some text...",transferwarehouseDto.getLogisticsPartnerUrl());
    }
    @Test
    public void transfarewarehouseDtoToTransferwarehouse(){
        TransferwarehouseDto transferwarehouseDto = new TransferwarehouseDto();
        transferwarehouseDto.setRegionGeoJson("some text...");
        transferwarehouseDto.setLogisticsPartner("some text...");
        transferwarehouseDto.setLogisticsPartnerUrl("some text...");

        Transferwarehouse transferwarehouse = TransferwarehouseMapper.INSTANCE.dtoToEntity(transferwarehouseDto);

        assertEquals("some text...",transferwarehouse.getRegionGeoJson());
        assertEquals("some text...",transferwarehouse.getLogisticsPartner());
        assertEquals("some text...",transferwarehouse.getLogisticsPartnerUrl());
    }

    //Truck
    @Test
    public void truckToTruckDto(){
        Truck truck = new Truck();
        truck.setRegionGeoJson("some geo...");
        truck.setNumberPlate("1234");

        TruckDto truckDto = TruckMapper.INSTANCE.entityToDto(truck);

        assertEquals("some geo...",truckDto.getRegionGeoJson());
        assertEquals("1234",truckDto.getNumberPlate());
    }
    @Test
    public void truckDtoToTruck(){
        TruckDto truckDto = new TruckDto();
        truckDto.setRegionGeoJson("some geo...");
        truckDto.setNumberPlate("1234");

        Truck truck = TruckMapper.INSTANCE.dtoToEntity(truckDto);

        assertEquals("some geo...",truck.getRegionGeoJson());
        assertEquals("1234",truck.getNumberPlate());
    }

    //WarehouseNextHops
    @Test
    public void warehouseNextHopsToWarehouseNextHopsDto(){
        GeoCoordinate geoCoordinate = new GeoCoordinate();
        geoCoordinate.setLon(3.3);
        geoCoordinate.setLat(4.4);
        Hop hop = new Hop();
        hop.setHopType("some type...");
        hop.setCode("some code...");
        hop.setDescription("some description...");
        hop.setProcessingDelayMins(3);
        hop.setLocationName("some name...");
        hop.setLocationCoordinates(geoCoordinate);
        WarehouseNextHops warehouseNextHops = new WarehouseNextHops();
        warehouseNextHops.setTraveltimeMins(123);
        warehouseNextHops.setHop(hop);

        WarehouseNextHopsDto warehouseNextHopsDto = WarehouseNextHopsMapper.INSTANCE.entityToDto(warehouseNextHops);

        assertEquals("123",warehouseNextHopsDto.getTraveltimeMins().toString());
        assertEquals("some type...",warehouseNextHopsDto.getHop().getHopType());
        assertEquals("some code...",warehouseNextHopsDto.getHop().getCode());
        assertEquals("some description...",warehouseNextHopsDto.getHop().getDescription());
        assertEquals("3",warehouseNextHopsDto.getHop().getProcessingDelayMins().toString());
        assertEquals("some name...",warehouseNextHopsDto.getHop().getLocationName());
        assertEquals("3.3",warehouseNextHopsDto.getHop().getLocationCoordinates().getLon().toString());
        assertEquals("4.4",warehouseNextHopsDto.getHop().getLocationCoordinates().getLat().toString());
    }
    @Test
    public void warehouseNextHopsDtoToWarehouseNextHops(){
        GeoCoordinateDto geoCoordinateDto = new GeoCoordinateDto();
        geoCoordinateDto.setLon(3.3);
        geoCoordinateDto.setLat(4.4);
        HopDto hopDto = new HopDto();
        hopDto.setHopType("some type...");
        hopDto.setCode("some code...");
        hopDto.setDescription("some description...");
        hopDto.setProcessingDelayMins(3);
        hopDto.setLocationName("some name...");
        hopDto.setLocationCoordinates(geoCoordinateDto);
        WarehouseNextHopsDto warehouseNextHopsDto = new WarehouseNextHopsDto();
        warehouseNextHopsDto.setTraveltimeMins(123);
        warehouseNextHopsDto.setHop(hopDto);

        WarehouseNextHops warehouseNextHops = WarehouseNextHopsMapper.INSTANCE.dtoToEntity(warehouseNextHopsDto);

        assertEquals("123",warehouseNextHops.getTraveltimeMins().toString());
        assertEquals("some type...",warehouseNextHops.getHop().getHopType());
        assertEquals("some code...",warehouseNextHops.getHop().getCode());
        assertEquals("some description...",warehouseNextHops.getHop().getDescription());
        assertEquals("3",warehouseNextHops.getHop().getProcessingDelayMins().toString());
        assertEquals("some name...",warehouseNextHops.getHop().getLocationName());
        assertEquals("3.3",warehouseNextHops.getHop().getLocationCoordinates().getLon().toString());
        assertEquals("4.4",warehouseNextHops.getHop().getLocationCoordinates().getLat().toString());
    }

    //Warehouse
    @Test
    public void warehouseToWarehouseDto(){
        GeoCoordinate geoCoordinate = new GeoCoordinate();
        geoCoordinate.setLon(3.3);
        geoCoordinate.setLat(4.4);
        Hop hop = new Hop();
        hop.setHopType("some type...");
        hop.setCode("some code...");
        hop.setDescription("some description...");
        hop.setProcessingDelayMins(3);
        hop.setLocationName("some name...");
        hop.setLocationCoordinates(geoCoordinate);
        WarehouseNextHops warehouseNextHops = new WarehouseNextHops();
        warehouseNextHops.setTraveltimeMins(123);
        warehouseNextHops.setHop(hop);
        List<WarehouseNextHops> warehouseNextHopsList = new ArrayList<>();
        warehouseNextHopsList.add(warehouseNextHops);
        Warehouse warehouse = new Warehouse();
        warehouse.setLevel(99);
        warehouse.setNextHops(warehouseNextHopsList);

        WarehouseDto warehouseDto = WarehouseMapper.INSTANCE.entityToDto(warehouse);

        assertEquals("99",warehouseDto.getLevel().toString());
        assertEquals("123",warehouseDto.getNextHops().get(0).getTraveltimeMins().toString());
        assertEquals("some type...",warehouseDto.getNextHops().get(0).getHop().getHopType());
        assertEquals("some code...",warehouseDto.getNextHops().get(0).getHop().getCode());
        assertEquals("some description...",warehouseDto.getNextHops().get(0).getHop().getDescription());
        assertEquals("3",warehouseDto.getNextHops().get(0).getHop().getProcessingDelayMins().toString());
        assertEquals("some name...",warehouseDto.getNextHops().get(0).getHop().getLocationName());
        assertEquals("3.3",warehouseDto.getNextHops().get(0).getHop().getLocationCoordinates().getLon().toString());
        assertEquals("4.4",warehouseDto.getNextHops().get(0).getHop().getLocationCoordinates().getLat().toString());
    }
    @Test
    public void warehouseDtoToWarehouse(){
        GeoCoordinateDto geoCoordinateDto = new GeoCoordinateDto();
        geoCoordinateDto.setLon(3.3);
        geoCoordinateDto.setLat(4.4);
        HopDto hopDto = new HopDto();
        hopDto.setHopType("some type...");
        hopDto.setCode("some code...");
        hopDto.setDescription("some description...");
        hopDto.setProcessingDelayMins(3);
        hopDto.setLocationName("some name...");
        hopDto.setLocationCoordinates(geoCoordinateDto);
        WarehouseNextHopsDto warehouseNextHopsDto = new WarehouseNextHopsDto();
        warehouseNextHopsDto.setTraveltimeMins(123);
        warehouseNextHopsDto.setHop(hopDto);
        List<WarehouseNextHopsDto> warehouseNextHopsDtoList = new ArrayList<>();
        warehouseNextHopsDtoList.add(warehouseNextHopsDto);
        WarehouseDto warehouseDto = new WarehouseDto();
        warehouseDto.setLevel(99);
        warehouseDto.setNextHops(warehouseNextHopsDtoList);

        Warehouse warehouse = WarehouseMapper.INSTANCE.dtoToEntity(warehouseDto);

        assertEquals("99",warehouse.getLevel().toString());
        assertEquals("123",warehouse.getNextHops().get(0).getTraveltimeMins().toString());
        assertEquals("some type...",warehouse.getNextHops().get(0).getHop().getHopType());
        assertEquals("some code...",warehouse.getNextHops().get(0).getHop().getCode());
        assertEquals("some description...",warehouse.getNextHops().get(0).getHop().getDescription());
        assertEquals("3",warehouse.getNextHops().get(0).getHop().getProcessingDelayMins().toString());
        assertEquals("some name...",warehouse.getNextHops().get(0).getHop().getLocationName());
        assertEquals("3.3",warehouse.getNextHops().get(0).getHop().getLocationCoordinates().getLon().toString());
        assertEquals("4.4",warehouse.getNextHops().get(0).getHop().getLocationCoordinates().getLat().toString());
    }
}
