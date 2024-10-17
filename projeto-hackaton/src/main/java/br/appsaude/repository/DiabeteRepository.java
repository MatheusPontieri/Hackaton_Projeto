package br.appsaude.repository;

import br.appsaude.model.Diabete;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DiabeteRepository implements PanacheRepository<Diabete> {
    
}
