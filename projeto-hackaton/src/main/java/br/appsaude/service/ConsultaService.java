package br.appsaude.service;

import java.util.List;

import br.appsaude.dto.consulta.ConsultaDTO;
import br.appsaude.model.Consulta;
import br.appsaude.repository.ConsultaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ConsultaService {
    @Inject
    ConsultaRepository consultaRepository;

    public List<Consulta> findAll(){
        return consultaRepository.listAll();
    }

    @Transactional
    public Consulta create(ConsultaDTO dto){
        Consulta model = new Consulta();
        model.setDataConsulta(dto.dataConsulta());
        model.setLocal(dto.local());
        model.setMotivo(dto.motivo());
        model.setNomePaciente(dto.nomePaciente());

        consultaRepository.persist(model);
        return model;
    }
}
