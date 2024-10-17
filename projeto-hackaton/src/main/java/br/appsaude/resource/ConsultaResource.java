package br.appsaude.resource;

import br.appsaude.dto.consulta.ConsultaDTO;
import br.appsaude.dto.consulta.ConsultaResponseDTO;
import br.appsaude.dto.sintoma.SintomaDTO;
import br.appsaude.dto.sintoma.SintomaResponseDTO;
import br.appsaude.service.ConsultaService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/consultas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ConsultaResource {
    @Inject
    ConsultaService consultaService;

    @GET
    public Response findAll(){
        return Response.ok(consultaService.findAll().stream().map(ConsultaResponseDTO::valueOf).toList()).build();
    }

    @POST
    public Response create(ConsultaDTO dto){
        return Response.status(201).entity(ConsultaResponseDTO.valueOf(consultaService.create(dto))).build();
    }
}