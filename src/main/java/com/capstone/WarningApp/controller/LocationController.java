package com.capstone.WarningApp.controller;

import com.capstone.WarningApp.dto.DetectLocationDto;
import com.capstone.WarningApp.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/location")
@RequiredArgsConstructor
public class LocationController {

    private final LocationService locationService;

    @PostMapping
    public ResponseEntity postDetectLocation(@RequestBody DetectLocationDto.DetectLocationPost detectLocation) {
        locationService.createDetectLocation(detectLocation);
        return new ResponseEntity("저장되었습니다.", HttpStatus.CREATED);
    }

    @GetMapping("/{detectLocation-id}")
    public ResponseEntity getDetectLocation(@PathVariable ("detectLocation-id") Long id) {
        return new ResponseEntity(locationService.findDetectLocation(id), HttpStatus.OK);
    }

    @DeleteMapping("/{detectLocation-id}")
    public ResponseEntity deleteDetectLocation(@PathVariable ("detectLocation-id") Long id) {
        locationService.removeDetectLocation(id);
        return new ResponseEntity("삭제되었습니다.", HttpStatus.OK);
    }


}
