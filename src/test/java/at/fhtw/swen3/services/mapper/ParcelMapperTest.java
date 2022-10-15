package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.RecipientDto;
import at.fhtw.swen3.services.dto.ParcelDto;
import at.fhtw.swen3.persistence.entity.Parcel;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class ParcelMapperTest {

    @Test
    public void entityToDto() {
        ParcelDto parcel = new ParcelDto();
        parcel.setWeight((float) 12.34);
        parcel.setRecipient(new RecipientDto());
        parcel.setSender(new RecipientDto());
        System.out.println(parcel);

        // AuthorMapper mapper = Mappers.getMapper(AuthorMapper.class);
        Parcel parcelDto = ParcelMapper.INSTANCE.entityToDto(parcel);

        assertEquals(new Float(12.34), parcelDto.getWeight());

        System.out.println(parcelDto);
    }

    @Test
    public void dtoToEntity() {
        Parcel parcelDto = new Parcel();
        parcelDto.setWeight((float) 12.34);
        parcelDto.setRecipient(new RecipientDto());
        parcelDto.setSender(new RecipientDto());
        System.out.println(parcelDto);

        // AuthorMapper mapper = Mappers.getMapper(AuthorMapper.class);
        ParcelDto parcel = ParcelMapper.INSTANCE.dtoToEntity(parcelDto);

        assertEquals(new Float(12.34), parcel.getWeight());

        System.out.println(parcel);
    }

}
