package br.appsaude.service;

import br.appsaude.dto.diabete.DiabeteDTO;
import br.appsaude.model.Diabete;
import br.appsaude.repository.DiabeteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class DiabeteService {
    @Inject
    DiabeteRepository diabeteRepository;

    public List<Diabete> findAll(){
        return diabeteRepository.listAll();
    }

    @Transactional
    public Diabete create(DiabeteDTO dto){
        Diabete model = new Diabete();
        model.setMedidaAfericao(dto.medidaAfericao());

        diabeteRepository.persist(model);
        return model;
    }
}
