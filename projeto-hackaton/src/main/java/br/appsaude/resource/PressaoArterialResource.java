package br.appsaude.resource;

import br.appsaude.dto.pressaoarterial.PressaoArterialDTO;
import br.appsaude.dto.pressaoarterial.PressaoArterialResponseDTO;
import br.appsaude.service.PressaoArterialService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/pressoes-arteriais")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PressaoArterialResource {
    @Inject
    PressaoArterialService pressaoArterialService;

    @GET
    public Response findAll(){
        return Response.ok(pressaoArterialService.findAll().stream().map(PressaoArterialResponseDTO::valueOf).toList()).build();
    }

    @POST
    public Response create(PressaoArterialDTO dto){
        return Response.status(201).entity(PressaoArterialResponseDTO.valueOf(pressaoArterialService.create(dto))).build();
    }
}
