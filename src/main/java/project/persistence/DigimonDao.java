package project.persistence;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import project.entity.DigimonResponse;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

public class DigimonDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    private List<DigimonResponse> digimonResponseList;

    public DigimonDao() {
        digimonResponseList = new ArrayList<>();
    }

    public List<DigimonResponse> getCardByName(String name) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://digimon-api.herokuapp.com/api/digimon/name/" + name);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        try {
            digimonResponseList = mapper.reader().forType(new TypeReference<List<DigimonResponse>>() {
            }).readValue(response);
        } catch (JsonProcessingException jsonProcessingException) {
            logger.error("Json Processing Exception: ", jsonProcessingException);
        }
        return digimonResponseList;
    }

    public List<DigimonResponse> getAllDigimons() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://digimon-api.herokuapp.com/api/digimon");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        try {
            digimonResponseList = mapper.reader().forType(new TypeReference<List<DigimonResponse>>() {
            }).readValue(response);
        } catch (JsonProcessingException jsonProcessingException) {
            logger.error("Json Processing Exception: ", jsonProcessingException);
        }
        return digimonResponseList;
    }
}
