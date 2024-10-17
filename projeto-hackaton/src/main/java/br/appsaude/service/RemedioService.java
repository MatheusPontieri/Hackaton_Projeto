package br.appsaude.service;

import java.util.List;

import br.appsaude.dto.remedio.RemedioDTO;
import br.appsaude.model.Remedio;
import br.appsaude.repository.RemedioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class RemedioService {
    @Inject
    RemedioRepository remedioRepository;

    public List<Remedio> findAll(){
        return remedioRepository.listAll();
    } 

    @Transactional
    public Remedio create(RemedioDTO dto){ 
        Remedio model = new Remedio();
        model.setNome(dto.nome());
        model.setIndicacao(dto.indicacao());
        model.setIntervalo(dto.intervalo());
        model.setDosagem(dto.dosagem());
        model.setDataValidadeReceita(dto.dataValidadeReceita());

        remedioRepository.persist(model);
        return model;
    }
}