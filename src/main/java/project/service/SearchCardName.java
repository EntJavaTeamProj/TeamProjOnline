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

@Path("/cardname")
public class SearchCardName {
    private final DigimonCardDao digimonCardDao;
    private final DigimonDao digimonDao;
    private final ResponseDao responseDao;

    public SearchCardName() {
        digimonCardDao = new DigimonCardDao();
        digimonDao = new DigimonDao();
        responseDao = new ResponseDao();
    }
    // TODO create more paths such as card number and stage (which is evolution stage)
    @GET
    @Path("/{param}")
    @Produces("application/json")
    public Response getCard(@PathParam("param") String name) {

        // TODO implement if statements to check if the dao was able to retrieve the responses from their respective api
        //  ex.g. if false in getting card name, then
        //  output = error message
        //  return Response.status(404).entity(output).build();
        //  if true in getting card name then response status of 200 and returns the output of response as json
        List<DigimonCardResponse> cardList = digimonCardDao.getCardByName(name);
        List<DigimonResponse> digimonList = digimonDao.getAllDigimons();
        List<DigimonCardResponse> responseList = responseDao.createResponseObjectList(cardList, digimonList);
        String output = responseDao.createResponseJson(responseList);
        if(output == null){
            output = "Error!";
            return Response.status(404).entity(output).build();
        } else {
            return Response.status(200).entity(output).build();
        }
    }
}
