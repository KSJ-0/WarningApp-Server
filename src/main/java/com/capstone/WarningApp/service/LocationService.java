package com.capstone.WarningApp.service;

import com.capstone.WarningApp.dto.DetectLocationDto;
import com.capstone.WarningApp.entity.DetectLocation;
import com.capstone.WarningApp.exception.BusinessLogicException;
import com.capstone.WarningApp.exception.ExceptionCode;
import com.capstone.WarningApp.mapper.LocationMapper;
import com.capstone.WarningApp.repository.LocationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class LocationService {
    private final LocationRepository locationRepository;
    private final LocationMapper locationMapper;

    public DetectLocation createDetectLocation(DetectLocationDto.DetectLocationPost detectLocationPost) {
        detectLocationPost.setCreatedAt(LocalDateTime.now());
        return locationRepository.save(locationMapper.toDetectLocation(detectLocationPost));
    }

    public DetectLocation findDetectLocation(Long id){
        return locationRepository.findById(id)
                .orElseThrow(()-> new BusinessLogicException(ExceptionCode.DETECT_LOCATION_NOT_FOUND));
    }

    public void removeDetectLocation(Long id){
        locationRepository.delete(findDetectLocation(id));
    }
}
