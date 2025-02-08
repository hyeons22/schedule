package com.example.schedulepractice1.repository;

import com.example.schedulepractice1.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
