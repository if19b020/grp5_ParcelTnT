package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.Parcel;
import at.fhtw.swen3.services.dto.ParcelDto;
import org.mapstruct.factory.Mappers;

public interface ParcelMapper {
    ParcelMapper INSTANCE = Mappers.getMapper(ParcelMapper.class);

    ParcelDto entityToDto(Parcel parcel);
    Parcel DtoToEntity(ParcelDto parcelDto);
}