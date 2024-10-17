package br.appsaude.repository;

import br.appsaude.model.Sintoma;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SintomaRepository implements PanacheRepository<Sintoma> {
    
}