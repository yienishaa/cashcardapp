package com.example.uitschedulecreator.configurations;

import com.example.uitschedulecreator.entity.ShiftsEntity;
import com.example.uitschedulecreator.repository.ShiftRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadInitialData {

    @Bean
    CommandLineRunner initDatabase(ShiftRepository shiftRepository) {
        return args -> {
            shiftRepository.save(new ShiftsEntity("MONDAY0830", 3.5));
            shiftRepository.save(new ShiftsEntity("MONDAY1200", 3.0));
            shiftRepository.save(new ShiftsEntity("MONDAY1500", 3.0));
            shiftRepository.save(new ShiftsEntity("MONDAY1800", 3.0));
        };
    }

}
