package com.app.magzine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.magzine.model.Microphone;

@Repository
public interface MicrophoneRepository extends JpaRepository<Microphone, Long> {

}
