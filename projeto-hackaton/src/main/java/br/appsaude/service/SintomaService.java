package br.appsaude.service;

import java.util.List;

import br.appsaude.dto.sintoma.SintomaDTO;
import br.appsaude.model.Sintoma;
import br.appsaude.repository.SintomaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class SintomaService {
    @Inject
    SintomaRepository sintomaRepository;

    public List<Sintoma> findAll(){
        return sintomaRepository.listAll();
    }

    @Transactional
    public Sintoma create(SintomaDTO dto){
        Sintoma model = new Sintoma();
        model.setTitulo(dto.titulo());
        model.setDescricao(dto.descricao());
        
        sintomaRepository.persist(model);
        return model;
    }
}
