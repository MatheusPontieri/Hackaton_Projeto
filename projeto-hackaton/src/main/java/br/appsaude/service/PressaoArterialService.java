package br.appsaude.service;

import java.util.List;

import br.appsaude.dto.pressaoarterial.PressaoArterialDTO;
import br.appsaude.model.PressaoArterial;
import br.appsaude.repository.PressaoArterialRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PressaoArterialService {
    @Inject
    PressaoArterialRepository pressaoArterialRepository;

    public List<PressaoArterial> findAll(){
        return pressaoArterialRepository.listAll();
    }

    @Transactional
    public PressaoArterial create(PressaoArterialDTO dto){
        PressaoArterial model = new PressaoArterial();
        model.setMedidaAfericao(dto.medidaAfericao());

        pressaoArterialRepository.persist(model);
        return model;
    }
}