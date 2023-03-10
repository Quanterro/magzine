package com.app.magzine.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.magzine.model.Microphone;
import com.app.magzine.repository.MicrophoneRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MicrophoneService {
	
	private final MicrophoneRepository microphoneRepository;
	
	public List<Microphone> getMicrophones() {
		return microphoneRepository.findAll();
	}

	public Microphone addMicrophone(Microphone microphone) {
		return microphoneRepository.save(microphone);
	}
}
