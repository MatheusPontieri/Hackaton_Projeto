package br.appsaude.dto.diabete;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.appsaude.model.Diabete;

public record DiabeteResponseDTO(
    String medidaAfericao,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
    LocalDateTime dataAfericao
) {
    public static DiabeteResponseDTO valueOf(Diabete model){
        DiabeteResponseDTO response = new DiabeteResponseDTO(model.getMedidaAfericao(), model.getDataCadastro());

        return response;
    }
}
