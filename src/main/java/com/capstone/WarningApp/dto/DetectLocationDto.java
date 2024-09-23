package com.capstone.WarningApp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetectLocationDto {

    @Getter
    @Setter
    public static class DetectLocationPost {
        private Double latitude; //위도
        private Double longitude; //경도
    }

    @Getter
    @Setter
    public static class DetectLocationResponse {
        private Double latitude; //위도
        private Double longitude; //경도
    }

}
