package project.service;

import project.entity.DigimonCardResponse;
import project.persistence.DigimonCardDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.*;

@Path("/cards")
public class Example {
    @GET
    @Path("/{param}")
    @Produces("application/json")
    public Response getCard(@PathParam("param") String name) {

        // TODO Change names of package and classes
        // TODO get responses from APIs and map values to Card class, data
        // TODO CardMapper class

        DigimonCardDao digimonCardDao = new DigimonCardDao();
        List<DigimonCardResponse> cards = digimonCardDao.getCardByName(name);
        String output = "";
        for(DigimonCardResponse card : cards) {
           output += card.toString();
        }
        return Response.status(200).entity(output).build();
    }
}
