package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.ParcelDto;
import at.fhtw.swen3.persistence.entity.Parcel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ParcelMapper {
    ParcelMapper INSTANCE = Mappers.getMapper(ParcelMapper.class);

    Parcel entityToDto(ParcelDto parcel);
    ParcelDto dtoToEntity(Parcel parcelDto);
}
