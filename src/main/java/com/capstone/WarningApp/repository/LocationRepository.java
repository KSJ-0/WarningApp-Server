package com.capstone.WarningApp.repository;

import com.capstone.WarningApp.entity.DetectLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<DetectLocation, Long> {
}
