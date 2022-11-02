package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.ErrorEntity;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class Repositories {

    @Resource
    private ErrorRepository repo;
    @Test
    public void errorRepository(){

        //repo.save("some error...");
        ErrorEntity error = new ErrorEntity();
        error.setErrorMessage("some error...");

        //repo.save(error);
        //errorRepository.findByText("some error...");


    }

}
