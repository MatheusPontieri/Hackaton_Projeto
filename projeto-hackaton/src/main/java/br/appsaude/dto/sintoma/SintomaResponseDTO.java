package br.appsaude.dto.sintoma;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.appsaude.model.Sintoma;

public record SintomaResponseDTO(
    String titulo,
    String descricao,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    LocalDateTime dataSintoma
) {
    public static SintomaResponseDTO valueOf(Sintoma model){
        SintomaResponseDTO response = new SintomaResponseDTO(model.getTitulo(), model.getDescricao(), model.getDataCadastro());

        return response;
    }
}
