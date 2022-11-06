package at.fhtw.swen3.persistence.repositories;

import at.fhtw.swen3.persistence.entities.ErrorEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class RepositoriesTest {

    @Autowired private ErrorRepository errorRepository;

    //private ErrorEntity errorEntity;

    @Test
    public void errorRepositoryTest(){
        ErrorEntity errorEntity = new ErrorEntity();
        errorEntity.setErrorMessage("some Error message...");

        errorRepository.save(errorEntity);
        //ErrorEntity newEE = errorRepository.findByMessage("some error message...");
        ErrorEntity newEE = errorRepository.getOne("some error message...");

        System.out.println(newEE);
    }
}
