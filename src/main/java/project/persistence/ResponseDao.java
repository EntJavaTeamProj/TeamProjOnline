package project.persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import project.entity.DigimonCardResponse;
import project.entity.DigimonResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ResponseDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    private List<DigimonCardResponse> responseList;

    public ResponseDao() {
        responseList = new ArrayList<>();
    }

    public List<DigimonCardResponse> createResponseObjectList(List<DigimonCardResponse> cardResponseList, List<DigimonResponse> digimonResponseList) {
        // creates a response list using the card response list
        responseList = cardResponseList;
        // nested for each loop that checks for same digimon names to set digimon image url
        for (DigimonCardResponse cardResponseObject : responseList) {
            for (DigimonResponse digimonResponseObject : digimonResponseList) {
                if (cardResponseObject.getCardName().equals(digimonResponseObject.getDigimonName())) {
                    cardResponseObject.setDigimonImage(digimonResponseObject.getDigimonImage());
                } else {
                    cardResponseObject.setDigimonImage(null);
                }
            }
        }
        return responseList;
    }

    public String createResponseJson(List<DigimonCardResponse> responseList) {
        String jsonResponse = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            jsonResponse = mapper.writeValueAsString(responseList);
        } catch (IOException exception) {
            logger.error("Exception: ", exception);
        }
        return jsonResponse;
    }
}
