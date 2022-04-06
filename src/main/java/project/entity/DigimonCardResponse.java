package project.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DigimonCardResponse {

	@JsonProperty("name")
	private String cardName;

	@JsonProperty("cardnumber")
	private String cardNumber;

	public String getCardName(){
		return cardName;
	}

	public String getCardNumber(){
		return cardNumber;
	}

	@Override
	public String toString() {
		return "DigimonCardResponse{" +
				"name='" + cardName + '\'' +
				", cardnumber='" + cardNumber + '\'' +
				'}';
	}
}