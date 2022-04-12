package project.service;

import project.entity.DigimonCardResponse;
import project.entity.DigimonResponse;
import project.persistence.DigimonCardDao;
import project.persistence.DigimonDao;
import project.persistence.ResponseDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.*;

@Path("/cards")
public class Example {
    private final DigimonCardDao digimonCardDao;
    private final DigimonDao digimonDao;
    private final ResponseDao responseDao;

    public Example() {
        digimonCardDao = new DigimonCardDao();
        digimonDao = new DigimonDao();
        responseDao = new ResponseDao();
    }

    @GET
    @Path("/{param}")
    @Produces("application/json")
    public Response getCard(@PathParam("param") String name) {

        // TODO Change names of package and classes
        // TODO get responses from APIs and map values to Card class, data
        // TODO CardMapper class
        List<DigimonCardResponse> cardList = digimonCardDao.getCardByName(name);
        List<DigimonResponse> digimonList = digimonDao.getAllDigimons();
        List<DigimonCardResponse> responseList = responseDao.createResponseObjectList(cardList, digimonList);
        String output = responseDao.createResponseJson(responseList);
        return Response.status(200).entity(output).build();
    }
}
