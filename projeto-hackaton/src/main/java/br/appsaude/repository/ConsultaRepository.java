package br.appsaude.repository;

import br.appsaude.model.Consulta;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ConsultaRepository implements PanacheRepository<Consulta> {
    
}
