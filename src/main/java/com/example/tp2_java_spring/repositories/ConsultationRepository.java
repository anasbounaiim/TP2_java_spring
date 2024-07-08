package com.example.tp2_java_spring.repositories;


import com.example.tp2_java_spring.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {

}