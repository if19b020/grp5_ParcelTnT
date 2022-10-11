package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.NewParcelInfo;
import at.fhtw.swen3.services.dto.NewParcelInfoDto;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class NewParcelInfoMapperTest {

    @Test
    public void entityToDto() {
        NewParcelInfo newParcelInfo = new NewParcelInfo();
        newParcelInfo.setTrackingId("1234");
        System.out.println(newParcelInfo);

        // AuthorMapper mapper = Mappers.getMapper(AuthorMapper.class);
        NewParcelInfoDto newParcelInfoDto = NewParcelInfoMapper.INSTANCE.entityToDto(newParcelInfo);

        assertEquals( "1234", newParcelInfoDto.getTrackingId());

        System.out.println(newParcelInfoDto);
    }

    @Test
    public void dtoToEntity() {
        NewParcelInfoDto newParcelInfoDto = new NewParcelInfoDto();
        newParcelInfoDto.setTrackingId("1234");
        System.out.println(newParcelInfoDto);

        NewParcelInfo newParcelInfo = NewParcelInfoMapper.INSTANCE.dtoToEntity(newParcelInfoDto);

        assertEquals( "1234", newParcelInfo.getTrackingId());

        System.out.println(newParcelInfo);
    }
}
