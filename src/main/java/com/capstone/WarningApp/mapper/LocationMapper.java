package com.capstone.WarningApp.mapper;

import com.capstone.WarningApp.dto.DetectLocationDto;
import com.capstone.WarningApp.entity.DetectLocation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocationMapper {
    DetectLocation toDetectLocation(DetectLocationDto.DetectLocationPost detectLocationPost);
    DetectLocationDto.DetectLocationResponse toDetectLocationResponse(DetectLocation detectLocation);
}
