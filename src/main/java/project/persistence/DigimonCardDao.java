package project.persistence;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import project.entity.DigimonCardResponse;

public class DigimonCardDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    private List<DigimonCardResponse> digimonCardResponseList;

    public DigimonCardDao() {
        digimonCardResponseList = new ArrayList<>();
    }

    public List<DigimonCardResponse> getCardByParameter(String searchType, String param) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://digimoncard.io/api-public/search.php?" + searchType + param);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        try {
            digimonCardResponseList = mapper.reader().forType(new TypeReference<List<DigimonCardResponse>>() {}).readValue(response);
        } catch (JsonProcessingException jsonProcessingException) {
            logger.error("Json Processing Exception: ", jsonProcessingException);
        }
        return digimonCardResponseList;
    }

}
