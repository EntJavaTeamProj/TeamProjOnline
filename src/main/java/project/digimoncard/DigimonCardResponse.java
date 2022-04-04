package project.digimoncard;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DigimonCardResponse{

	@JsonProperty("name")
	private String name;

	@JsonProperty("cardnumber")
	private String cardnumber;

	public String getName(){
		return name;
	}

	public String getCardnumber(){
		return cardnumber;
	}
}