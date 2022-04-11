package project.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Card {
    /*
    DigimonCardResponse fields
     */
    @JsonProperty("soure_effect")
    private Object soureEffect;

    @JsonProperty("color")
    private String color;

    @JsonProperty("digi_type")
    private String digiType;

    @JsonProperty("card_sets")
    private List<String> cardSets;

    @JsonProperty("level")
    private int level;

    @JsonProperty("card_rarity")
    private String cardRarity;

    @JsonProperty("artist")
    private String artist;

    @JsonProperty("image_url")
    private String imageUrl;

    @JsonProperty("main_effect")
    private String mainEffect;

    @JsonProperty("type")
    private String type;

    @JsonProperty("dp")
    private int dp;

    @JsonProperty("stage")
    private String stage;

    @JsonProperty("set_name")
    private String setName;

    @JsonProperty("play_cost")
    private int playCost;

    @JsonProperty("name")
    private String cardName;

    @JsonProperty("evolution_cost")
    private int evolutionCost;

    @JsonProperty("attribute")
    private String attribute;

    @JsonProperty("cardnumber")
    private String cardNumber;

    /*
    DigimonResponse fields
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("img")
    private String img;

    @JsonProperty("level")
    private int level;

    /*
    DigimonCardResponse getters
     */
    public Object getSoureEffect(){
        return soureEffect;
    }

    public String getColor(){
        return color;
    }

    public String getDigiType(){
        return digiType;
    }

    public List<String> getCardSets(){
        return cardSets;
    }

    public int getLevel(){
        return level;
    }

    public String getCardRarity(){
        return cardRarity;
    }

    public String getArtist(){
        return artist;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public String getMainEffect(){
        return mainEffect;
    }

    public String getType(){
        return type;
    }

    public int getDp(){
        return dp;
    }

    public String getStage(){
        return stage;
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

    public String getAttribute(){
        return attribute;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    /*
    DigimonResponse getters
     */

    public Object getname(){
        return name;
    }
    public Object getImg(){
        return img;
    }
    public Object getlevel(){
        return level;
    }
}
