package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.NewParcelInfoDto;
import at.fhtw.swen3.persistence.entity.NewParcelInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NewParcelInfoMapper {
    NewParcelInfoMapper INSTANCE = Mappers.getMapper(NewParcelInfoMapper.class);

    //@Mapping(source="trackingId",target="trackingId") //falls namen unterschiedlich
    NewParcelInfo entityToDto(NewParcelInfoDto newParcelInfo);
    NewParcelInfoDto dtoToEntity(NewParcelInfo newParcelInfoDto);
}
