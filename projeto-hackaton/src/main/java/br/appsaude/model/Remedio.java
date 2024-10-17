package br.appsaude.model;

import jakarta.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Remedio extends DefaultEntity {
    private String nome;

    private String intervalo;

    private String dosagem;

    private String indicacao;

    private LocalDate dataValidadeReceita;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(String intervalo) {
        this.intervalo = intervalo;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public LocalDate getDataValidadeReceita() {
        return dataValidadeReceita;
    }

    public void setDataValidadeReceita(LocalDate dataValidadeReceita) {
        this.dataValidadeReceita = dataValidadeReceita;
    }
}