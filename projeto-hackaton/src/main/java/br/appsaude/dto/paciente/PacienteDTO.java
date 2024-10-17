package br.appsaude.dto.paciente;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public record PacienteDTO(
    String nome,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    LocalDate dataNascimento,
    String cpf,
    String telefone,
    String numeroCartaoSus
){
}