package project.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
// TODO: add relevant card info such as...
//     "name": "MetalGreymon",
//    "type": "Digimon",
//    "color": "Yellow",
//    "stage": "Ultimate",
//    "attribute": "Virus",
//    "level": null,
//    "play_cost": null,
//    "evolution_cost": null,
//    "cardrarity": null,
//    "artist": null,
//    "dp": null,
//    "cardnumber": "BO-01",
//    "maineffect": null,
//    "soureeffect": null,
//    "set_name": "Series 1 Booster Pack",
//    "card_sets": [
//      "Series 1 Booster Pack"
//    ]
//    I thought about it and the point of this api is to combine and show card info and market price of the card,
//    so we might as well add relevant info, be wary of null values though - Matthew Lor
// TODO: Add properties to be displayed in results of index.jsp
// TODO: Refactor toString() method with the new property variables
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