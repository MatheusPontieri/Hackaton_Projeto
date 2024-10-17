package br.appsaude.resource;

import br.appsaude.dto.sintoma.SintomaDTO;
import br.appsaude.dto.sintoma.SintomaResponseDTO;
import br.appsaude.service.SintomaService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/sintomas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SintomaResource {
    @Inject
    SintomaService sintomaService;

    @GET
    public Response findAll(){
        return Response.ok(sintomaService.findAll().stream().map(SintomaResponseDTO::valueOf).toList()).build();
    }

    @POST
    public Response create(SintomaDTO dto){
        return Response.status(201).entity(SintomaResponseDTO.valueOf(sintomaService.create(dto))).build();
    }
}
