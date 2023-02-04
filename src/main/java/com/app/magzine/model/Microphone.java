package com.app.magzine.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "Microphones")
@AllArgsConstructor
@NoArgsConstructor
public class Microphone {
	@Id
	private Long id;
	private String model;
	private String brand;
	private Long serial;
}
