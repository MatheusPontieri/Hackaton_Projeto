package br.appsaude.dto.consulta;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.appsaude.model.Consulta;

public record ConsultaResponseDTO(
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    LocalDate dataConsulta,
    String nomePaciente,
    String local,
    String motivo
) {
    public static ConsultaResponseDTO valueOf(Consulta model){
        return new ConsultaResponseDTO(
            model.getDataConsulta(),
            model.getNomePaciente(), 
            model.getLocal(), 
            model.getMotivo()
        );
    }
}
