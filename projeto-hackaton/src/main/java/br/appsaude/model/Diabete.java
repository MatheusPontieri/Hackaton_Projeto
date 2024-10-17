package br.appsaude.model;

import jakarta.persistence.Entity;

@Entity
public class Diabete extends DefaultEntity {
    private String medidaAfericao;

    public String getMedidaAfericao() {
        return medidaAfericao;
    }

    public void setMedidaAfericao(String medidaAfericao) {
        this.medidaAfericao = medidaAfericao;
    }
}