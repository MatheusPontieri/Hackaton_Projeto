package br.appsaude.dto.consulta;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public record ConsultaDTO(
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    LocalDate dataConsulta,
    String nomePaciente,
    String local,
    String motivo
){
    
}
