package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.NewParcelInfo;
import at.fhtw.swen3.services.dto.NewParcelInfoDto;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NewParcelInfoMapperTest {

    @Test
    void entityToDto() {
        NewParcelInfo newParcelInfo = new NewParcelInfo();
        newParcelInfo.setTrackingId("1234");
        System.out.println(newParcelInfo);

        // AuthorMapper mapper = Mappers.getMapper(AuthorMapper.class);
        NewParcelInfoDto newParcelInfoDto = NewParcelInfoMapper.INSTANCE.entityToDto(newParcelInfo);

        /*assertEquals( "Rudi", authorDto.getFirstname());
        assertEquals( "Ratlos", authorDto.getLastname());*/

        System.out.println(newParcelInfoDto);
    }
}
