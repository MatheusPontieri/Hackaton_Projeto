package br.appsaude.resource;

import br.appsaude.dto.remedio.RemedioDTO;
import br.appsaude.dto.remedio.RemedioResponseDTO;
import br.appsaude.service.RemedioService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/remedios")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RemedioResource {
    @Inject
    RemedioService remedioService;

    @GET
    public Response findAll(){
        return Response.ok(remedioService.findAll().stream().map(RemedioResponseDTO::valueOf).toList()).build();
    }

    @POST
    public Response create(RemedioDTO dto){
        return Response.status(201).entity(RemedioResponseDTO.valueOf(remedioService.create(dto))).build();
    }
}
