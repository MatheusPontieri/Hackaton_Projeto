package br.appsaude.repository;

import br.appsaude.model.PressaoArterial;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PressaoArterialRepository implements PanacheRepository<PressaoArterial> {
    
}
