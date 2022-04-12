package project.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DigimonResponse {

	@JsonProperty("name")
	private String digimonName;

	@JsonProperty("img")
	private String digimonImage;

	@JsonProperty("level")
	private String evolutionStage;


	public String getDigimonName() {
		return digimonName;
	}

	public String getDigimonImage() {
		return digimonImage;
	}

	public String getEvolutionStage() {
		return evolutionStage;
	}


}