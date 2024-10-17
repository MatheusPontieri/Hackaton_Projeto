package br.appsaude.dto.pressaoarterial;

import br.appsaude.model.PressaoArterial;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public record PressaoArterialResponseDTO(
    String medidaAfericao,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    LocalDateTime dataAfericao
) {
    public static PressaoArterialResponseDTO valueOf(PressaoArterial model){
        PressaoArterialResponseDTO response = new PressaoArterialResponseDTO(model.getMedidaAfericao(), model.getDataCadastro());

        return response;
    }
}