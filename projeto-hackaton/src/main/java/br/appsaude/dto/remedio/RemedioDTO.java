package br.appsaude.dto.remedio;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.appsaude.model.Remedio;

public record RemedioDTO(
    String nome,
    String intervalo,
    String dosagem,
    String indicacao,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    LocalDate dataValidadeReceita
) {
    public static Remedio toModel(RemedioDTO dto){
        Remedio model = new Remedio();
        model.setNome(dto.nome());
        model.setIndicacao(dto.indicacao());
        model.setIntervalo(dto.intervalo());
        model.setDosagem(dto.dosagem());
        model.setDataValidadeReceita(dto.dataValidadeReceita());

        return model;
    }
}