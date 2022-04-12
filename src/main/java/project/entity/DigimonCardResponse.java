package project.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DigimonCardResponse {

	@JsonProperty("soure_effect")
	private Object sourceEffect;

	@JsonProperty("color")
	private String cardColor;

	@JsonProperty("digi_type")
	private String digiType;

	@JsonProperty("card_sets")
	private List<String> cardSets;

	@JsonProperty("level")
	private int cardLevel;

	@JsonProperty("card_rarity")
	private String cardRarity;

	@JsonProperty("artist")
	private String cardArtist;

	@JsonProperty("image_url")
	private String imageUrl;

	@JsonProperty("main_effect")
	private String mainEffect;

	@JsonProperty("type")
	private String cardType;

	@JsonProperty("dp")
	private int digimonPower;

	@JsonProperty("stage")
	private String evolutionStage;

	@JsonProperty("set_name")
	private String setName;

	@JsonProperty("play_cost")
	private int playCost;

	@JsonProperty("name")
	private String cardName;

	@JsonProperty("evolution_cost")
	private int evolutionCost;

	@JsonProperty("attribute")
	private String cardAttribute;

	@JsonProperty("cardnumber")
	private String cardNumber;

	/*
    DigimonResponse fields
     */
	@JsonProperty("digimonImage")
	private String digimonImage;

	public Object getSourceEffect(){
		return sourceEffect;
	}

	public String getCardColor(){
		return cardColor;
	}

	public String getDigiType(){
		return digiType;
	}

	public List<String> getCardSets(){
		return cardSets;
	}

	public int getCardLevel(){
		return cardLevel;
	}

	public String getCardRarity(){
		return cardRarity;
	}

	public String getCardArtist(){
		return cardArtist;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public String getMainEffect(){
		return mainEffect;
	}

	public String getCardType(){
		return cardType;
	}

	public int getDigimonPower(){
		return digimonPower;
	}

	public String getEvolutionStage(){
		return evolutionStage;
	}

	public String getSetName(){
		return setName;
	}

	public int getPlayCost(){
		return playCost;
	}

	public String getCardName(){
		return cardName;
	}

	public int getEvolutionCost(){
		return evolutionCost;
	}

	public String getCardAttribute(){
		return cardAttribute;
	}

	public String getCardNumber(){
		return cardNumber;
	}

	@Override
	public String toString() {
		return "DigimonCardResponse{" +
				"sourceEffect=" + sourceEffect +
				", cardColor='" + cardColor + '\'' +
				", digiType='" + digiType + '\'' +
				", cardSets=" + cardSets +
				", cardLevel=" + cardLevel +
				", cardRarity='" + cardRarity + '\'' +
				", cardArtist='" + cardArtist + '\'' +
				", imageUrl='" + imageUrl + '\'' +
				", mainEffect='" + mainEffect + '\'' +
				", cardType='" + cardType + '\'' +
				", digimonPower=" + digimonPower +
				", evolutionStage='" + evolutionStage + '\'' +
				", setName='" + setName + '\'' +
				", playCost=" + playCost +
				", cardName='" + cardName + '\'' +
				", evolutionCost=" + evolutionCost +
				", cardAttribute='" + cardAttribute + '\'' +
				", cardNumber='" + cardNumber + '\'' +
				", digimonImage='" + digimonImage + '\'' +
				'}';
	}
/*
    DigimonResponse getters
     */

	public Object getDigimonImage(){
		return digimonImage;
	}

	/*
    DigimonResponse setters
     */
	public void setDigimonImage(String digimonImage) {
		this.digimonImage = digimonImage;
	}




	/*
	{"name":"Agumon",
			"type":"Digimon",
			"color":"Red",
			"stage":"Rookie",
			"digi_type":"Reptile",
			"attribute":"Vaccine",
			"level":3,"play_cost":3,
			"evolution_cost":0,
			"cardrarity":"Rare",
			"artist":"TANIMESO",
			"dp":2000,
			"cardnumber":"BT1-010",
			"maineffect":"[On Play] Reveal 5 cards from the top of your deck. Add 1 Tamer card among them to your hand. Place the remaining cards at the bottom of your deck in any order.",
			"soureeffect":null,
			"set_name":"BT01-03: Release Special Booster Ver.1.0",
			"card_sets":["BT01-03: Release Special Booster Ver.1.0"],
		"image_url":"https://images.digimoncard.io/images/cards/BT1-010.jpg"}
	*/

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


}