package br.appsaude.dto.paciente;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.appsaude.model.Paciente;

public record PacienteResponseDTO(
    String nome,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    LocalDate dataNascimento,
    Integer idade,
    String cpf,
    String telefone,
    String numeroCartaoSus
){
    public static PacienteResponseDTO valueOf(Paciente model){
        PacienteResponseDTO response = new PacienteResponseDTO(
            model.getNome(),
            model.getDataNascimento(),
            LocalDate.now().getYear() - model.getDataNascimento().getYear(),
            model.getCpf(),
            model.getTelefone(),
            model.getNumeroCartaoSus()
        );

        return response;
    }
}
