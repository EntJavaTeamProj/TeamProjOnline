package project.persistence;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import project.digimoncard.DigimonCardResponse;

public class DigimonCardDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    private List<DigimonCardResponse> digimonCardResponseList;

    public DigimonCardDao() {
        digimonCardResponseList = new ArrayList<>();
    }

    DigimonCardResponse getCardByName(String name) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://digimoncard.io/api-public/search.php?n=" + name);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        try {
            digimonCardResponseList = mapper.reader().forType(new TypeReference<List<DigimonCardResponse>>() {}).readValue(response);
        } catch (JsonProcessingException jsonProcessingException) {
            logger.error("Json Processing Exception: ", jsonProcessingException);
        }
        // TODO return a list of the result because there can be multiple variants of MetalGreymon cards
        //  e.g.: put in MetalGreymon as input and all MetalGreymon searches show
        //  Single value will result in an error since response returns an array
        //  For Error Reference: Json Processing Exception: com.fasterxml.jackson.databind.exc.MismatchedInputException: Cannot deserialize instance of `project.digimoncard.DigimonCardResponse` out of START_ARRAY token
        // This only works because MetalGreymon cardnumber BO-01 is the first in the list, Test would fail if
        // it was anything other than .get(0) or the first index value
        return digimonCardResponseList.get(0);
    }

    DigimonCardResponse getCardByNumber(String cardNumber) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://digimoncard.io/api-public/search.php?card=" + cardNumber);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        try {
            digimonCardResponseList = mapper.reader().forType(new TypeReference<List<DigimonCardResponse>>() {}).readValue(response);
        } catch (JsonProcessingException jsonProcessingException) {
            logger.error("Json Processing Exception: ", jsonProcessingException);
        }
        logger.info(digimonCardResponseList);
        // This will always work since each card number is unique
        // as there are no two different cards with the same card number
        return digimonCardResponseList.get(0);
    }

//    Set<DigimonCardResponse> getAllCards() {
//
//        Client client = ClientBuilder.newClient();
//        WebTarget target = client.target("https://digimoncard.io/api-public/getAllCards.php");
//        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
//        ObjectMapper mapper = new ObjectMapper();
//        Set<DigimonCardResponse> digimonCardResponse = null;
//        try {
//            // TODO figure out how to do with a collection
//            // TODO reference list mapper object above to try and grab all the cards. Probably needs a container object class to hold and return all the cards
//            digimonCardResponse = mapper.readValue(response, DigimonCardResponse.class);
//        } catch (JsonProcessingException jsonProcessingException) {
//            logger.error("Json Processing Exception: ", jsonProcessingException);
//
//        }
//
//        return digimonCardResponse;
//    }


    /*
     https://digimoncard.io/api-public/search.php?n=Agumon&desc=Reveal5cards&color=red&type=digimon&
     attribute=Vaccine&card=BT1-010&pack=BT01-03:%20Release%20Special%20Booster%20Ver.1.0&sort=name&
     sortdirection=desc&series=Digimon%20Card%20Game

    {"name":"A Blazing Storm of Metal!","cardnumber":"BT5-103"}

     {"name":"Agumon","type":"Digimon","color":"Red","stage":"Rookie","digi_type":"Reptile","attribute":"Vaccine","level":3,"play_cost":3,"evolution_cost":0,"cardrarity":"Rare","artist":"TANIMESO","dp":2000,"cardnumber":"BT1-010","maineffect":"[On Play] Reveal 5 cards from the top of your deck. Add 1 Tamer card among them to your hand. Place the remaining cards at the bottom of your deck in any order.","soureeffect":null,"set_name":"BT01-03: Release Special Booster Ver.1.0","card_sets":["BT01-03: Release Special Booster Ver.1.0"],"image_url":"https://images.digimoncard.io/images/cards/BT1-010.jpg"}
     */


}
