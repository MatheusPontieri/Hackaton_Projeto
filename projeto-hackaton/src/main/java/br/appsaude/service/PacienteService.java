package br.appsaude.service;

import java.util.List;

import br.appsaude.dto.paciente.PacienteDTO;
import br.appsaude.model.Paciente;
import br.appsaude.repository.PacienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PacienteService {

    @Inject
    PacienteRepository pacienteRepository;

    public Paciente findById(Long id){
        return pacienteRepository.findById(id);
    }
    
    public List<Paciente> findAll(){
        return pacienteRepository.listAll();
    }

    @Transactional
    public Paciente create(PacienteDTO dto){
        Paciente model = new Paciente();
        model.setNome(dto.nome());
        model.setDataNascimento(dto.dataNascimento());
        model.setCpf(dto.cpf());
        model.setTelefone(dto.telefone());
        model.setNumeroCartaoSus(dto.numeroCartaoSus());

        pacienteRepository.persist(model);
        return model;
    }
    
}
