package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.ParcelEntity;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.dto.TrackingInformation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ParcelEntityMapper {
    ParcelEntityMapper INSTANCE = Mappers.getMapper(ParcelEntityMapper.class);

    @Mapping(source = "parcelDto.weight", target = "weight")
    @Mapping(source = "parcelDto.recipient", target = "recipient")
    @Mapping(source = "parcelDto.sender", target = "sender")
    @Mapping(source = "newParcelInfoDto.trackingId", target = "trackingId")
    @Mapping(source = "trackingInformationDto.state", target = "state")
    @Mapping(source = "trackingInformationDto.visitedHops", target = "visitedHops")
    @Mapping(source = "trackingInformationDto.futureHops", target = "futureHops")
    ParcelEntity dtoToEntity(Parcel parcel, NewParcelInfo newParcelInfo, TrackingInformation trackingInformation);
    Parcel entityToParcelDto(ParcelEntity parcelEntity);
    NewParcelInfo entityToNewParcelInfoDto(ParcelEntity parcelEntity);
    TrackingInformation entityToTrackingInformationDto(ParcelEntity parcelEntity);
}
