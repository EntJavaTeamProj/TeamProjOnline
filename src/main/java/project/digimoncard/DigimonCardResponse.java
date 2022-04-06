package project.digimoncard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DigimonCardResponse{

	@JsonProperty("name")
	private String name;

	@JsonProperty("cardnumber")
	private String cardnumber;

	public String getName(){
		return name;
	}

	public String getCardNumber(){
		return cardnumber;
	}

	@Override
	public String toString() {
		return "DigimonCardResponse{" +
				"name='" + name + '\'' +
				", cardnumber='" + cardnumber + '\'' +
				'}';
	}
}