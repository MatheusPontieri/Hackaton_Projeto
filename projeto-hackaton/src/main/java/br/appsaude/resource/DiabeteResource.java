package br.appsaude.resource;

import br.appsaude.dto.diabete.DiabeteDTO;
import br.appsaude.dto.diabete.DiabeteResponseDTO;
import br.appsaude.service.DiabeteService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/diabetes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DiabeteResource {
    @Inject
    DiabeteService diabeteService;

    @GET
    public Response findAll(){
        return Response.ok(diabeteService.findAll().stream().map(DiabeteResponseDTO::valueOf).toList()).build();
    }

    @POST
    public Response create(DiabeteDTO dto){
        return Response.status(201).entity(DiabeteResponseDTO.valueOf(diabeteService.create(dto))).build();
    }
}
