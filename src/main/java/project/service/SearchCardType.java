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
import java.util.List;

@Path("/cardtype")
public class SearchCardType {
    private final DigimonCardDao digimonCardDao;
    private final DigimonDao digimonDao;
    private final ResponseDao responseDao;

    public SearchCardType() {
        digimonCardDao = new DigimonCardDao();
        digimonDao = new DigimonDao();
        responseDao = new ResponseDao();
    }

    @GET
    @Path("/{param}")
    @Produces("application/json")
    public Response getCard(@PathParam("param") String number) {
        String searchType = "type=";

        List<DigimonCardResponse> cardList = digimonCardDao.getCardByParameter(searchType, number);
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
