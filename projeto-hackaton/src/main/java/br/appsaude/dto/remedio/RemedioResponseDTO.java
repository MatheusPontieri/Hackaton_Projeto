package br.appsaude.dto.remedio;

import br.appsaude.model.Remedio;
import java.time.LocalDate;
import java.time.Period;

import com.fasterxml.jackson.annotation.JsonFormat;

public record RemedioResponseDTO(
    String nome, 
    String intervalo,
    String dosagem, 
    String indicacao,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    LocalDate dataValidadeReceita,
    Integer diasValidadeReceita
) {

    public static RemedioResponseDTO valueOf(Remedio remedio){
        RemedioResponseDTO response = new RemedioResponseDTO(
            remedio.getNome(),
            remedio.getIntervalo(), 
            remedio.getDosagem(), 
            remedio.getIndicacao(),
            remedio.getDataValidadeReceita(),
            Period.between(LocalDate.now(), remedio.getDataValidadeReceita()).getDays()
        );

        return response;
    }
}