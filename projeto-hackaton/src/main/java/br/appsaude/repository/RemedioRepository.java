package br.appsaude.repository;

import br.appsaude.model.Remedio;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RemedioRepository implements PanacheRepository<Remedio> {
    
}
