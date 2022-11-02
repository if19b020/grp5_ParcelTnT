package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.services.WarehouseApi;
import at.fhtw.swen3.services.dto.HopDto;
import at.fhtw.swen3.services.dto.WarehouseDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-24T14:06:20.958Z[GMT]")
@RestController
public class WarehouseApiController implements WarehouseApi {

    private static final Logger log = LoggerFactory.getLogger(WarehouseApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WarehouseApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<WarehouseDto> exportWarehouses() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<WarehouseDto>(objectMapper.readValue("\"\"", WarehouseDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<WarehouseDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<WarehouseDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<HopDto> getWarehouse(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("code") String code) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<HopDto>(objectMapper.readValue("{\n  \"code\" : \"code\",\n  \"locationName\" : \"locationName\",\n  \"processingDelayMins\" : 0,\n  \"hopType\" : \"hopType\",\n  \"description\" : \"description\",\n  \"locationCoordinates\" : {\n    \"lon\" : 1.4658129805029452,\n    \"lat\" : 6.027456183070403\n  }\n}", HopDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<HopDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<HopDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> importWarehouses(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody WarehouseDto body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
