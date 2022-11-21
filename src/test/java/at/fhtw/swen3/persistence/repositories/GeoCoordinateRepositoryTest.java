package at.fhtw.swen3.persistence.repositories;

import at.fhtw.swen3.persistence.entities.GeoCoordinateEntity;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//@ExtendWith(SpringExtension.class)
//@DataJpaTest
@SpringBootTest
public class GeoCoordinateRepositoryTest {
    @Autowired
    GeoCoordinateRepository geoCoordinateRepository;

    @Test
    public void geoCoordinateRepoistoryTest(){
        GeoCoordinateEntity geoCoordinate = new GeoCoordinateEntity();
        geoCoordinate.setId(1234L);
        geoCoordinate.setLat(12.12);
        geoCoordinate.setLon(34.34);

        geoCoordinateRepository.save(geoCoordinate);
        GeoCoordinateEntity newGeoCoordinateEntity = geoCoordinateRepository.findById(1234L);

        System.out.println(newGeoCoordinateEntity);
    }
}
