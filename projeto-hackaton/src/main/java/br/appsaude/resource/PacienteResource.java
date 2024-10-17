package br.appsaude.resource;

import br.appsaude.dto.paciente.PacienteDTO;
import br.appsaude.dto.paciente.PacienteResponseDTO;
import br.appsaude.service.PacienteService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/pacientes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PacienteResource {

    @Inject
    PacienteService pacienteService;

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") Long id){
        return Response.ok(PacienteResponseDTO.valueOf(pacienteService.findById(id))).build();
    }

    @GET
    public Response findAll(){
        return Response.ok(pacienteService.findAll().stream().map(PacienteResponseDTO::valueOf).toList()).build();
    }

    @POST
    public Response create(PacienteDTO dto){
        return Response.status(201).entity(PacienteResponseDTO.valueOf(pacienteService.create(dto))).build();
    }
}