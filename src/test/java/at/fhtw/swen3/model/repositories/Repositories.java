package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.Error;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

@SpringBootTest
public class Repositories {

    @Resource
    private ErrorRepository repo;
    @Test
    public void errorRepository(){

        //repo.save("some error...");
        Error error = new Error();
        error.setErrorMessage("some error...");

        //repo.save(error);
        //errorRepository.findByText("some error...");


    }

}
