/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consulta;

/**
 *
 * @author Everton
 */
public class Vacinacao {
    
    private int id;
    private String nome;
    private double quantidadeDoseMl;
    private int intervaloDias;
    private double valorVacina;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidadeDoseMl() {
        return quantidadeDoseMl;
    }

    public void setQuantidadeDoseMl(double quantidadeDoseMl) {
        this.quantidadeDoseMl = quantidadeDoseMl;
    }

    public int getIntervaloDias() {
        return intervaloDias;
    }

    public void setIntervaloDias(int intervaloDias) {
        this.intervaloDias = intervaloDias;
    }

    public double getValorVacina() {
        return valorVacina;
    }

    public void setValorVacina(double valorVacina) {
        this.valorVacina = valorVacina;
    }

    @Override
    public String toString() {
        return "Vacinacao{" + "id=" + id + ", nome=" + nome + ", quantidadeDoseMl=" + quantidadeDoseMl + ", intervaloDias=" + intervaloDias + ", valorVacina=" + valorVacina + '}';
    }
    
    

    
    
    
    
    
}
