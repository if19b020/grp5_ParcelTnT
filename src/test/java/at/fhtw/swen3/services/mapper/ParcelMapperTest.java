package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.Recipient;
import at.fhtw.swen3.persistence.entity.NewParcelInfo;
import at.fhtw.swen3.persistence.entity.Parcel;
import at.fhtw.swen3.services.dto.NewParcelInfoDto;
import at.fhtw.swen3.services.dto.ParcelDto;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class ParcelMapperTest {

    @Test
    public void entityToDto() {
        Parcel parcel = new Parcel();
        parcel.setWeight((float) 12.34);
        parcel.setRecipient(new Recipient());
        parcel.setSender(new Recipient());
        System.out.println(parcel);

        // AuthorMapper mapper = Mappers.getMapper(AuthorMapper.class);
        ParcelDto parcelDto = ParcelMapper.INSTANCE.entityToDto(parcel);

        assertEquals(new Float(12.34), parcelDto.getWeight());

        System.out.println(parcelDto);
    }

    @Test
    public void dtoToEntity() {
        ParcelDto parcelDto = new ParcelDto();
        parcelDto.setWeight((float) 12.34);
        parcelDto.setRecipient(new Recipient());
        parcelDto.setSender(new Recipient());
        System.out.println(parcelDto);

        // AuthorMapper mapper = Mappers.getMapper(AuthorMapper.class);
        Parcel parcel = ParcelMapper.INSTANCE.dtoToEntity(parcelDto);

        assertEquals(new Float(12.34), parcel.getWeight());

        System.out.println(parcel);
    }

}
