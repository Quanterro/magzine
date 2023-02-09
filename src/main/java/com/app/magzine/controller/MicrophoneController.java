package com.app.magzine.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.magzine.model.Microphone;
import com.app.magzine.service.MicrophoneService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MicrophoneController {
	

	private final MicrophoneService microphoneService;
	
	@GetMapping("/models/microphones")
	List<Microphone> getMicrophones(){
		return microphoneService.getMicrophones();
	}
	
	@PostMapping("/add/microphone")
	Microphone addMicrophone(@RequestBody Microphone microphone) {
		return microphoneService.addMicrophone(microphone);		
	}
	
}
