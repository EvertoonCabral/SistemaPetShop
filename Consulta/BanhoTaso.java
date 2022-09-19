/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consulta;

import Models1.Animal;
import Models1.Cliente;

/**
 *
 * @author Everton
 */
public class BanhoTaso {
    
    private int id; 
    private Cliente nomeCliente;
    private Animal animalBanhoTosa;
    private boolean banho;
    private boolean tosa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(Cliente nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Animal getAnimalBanhoTosa() {
        return animalBanhoTosa;
    }

    public void setAnimalBanhoTosa(Animal animalBanhoTosa) {
        this.animalBanhoTosa = animalBanhoTosa;
    }

    public boolean isBanho() {
        return banho;
    }

    public void setBanho(boolean banho) {
        this.banho = banho;
    }

    public boolean isTosa() {
        return tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }

    @Override
    public String toString() {
        return "BanhoTaso{" + "id=" + id + ", nomeCliente=" + nomeCliente + ", animalBanhoTosa=" + animalBanhoTosa + ", banho=" + banho + ", tosa=" + tosa + '}';
    }
    
    
    
    
}
