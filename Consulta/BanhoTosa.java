/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consulta;

import Models1.Animal;
import Models1.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Everton
 */
public class BanhoTosa {
    
    private int id; 
    private String nomeCliente;
    private Animal animalBanhoTosa;
    private boolean banho;
    private boolean tosa;
    private ArrayList <BanhoTosa> listaBanhoETosa = new ArrayList<>();

    public BanhoTosa(int id, String nomeCliente, Animal animalBanhoTosa, boolean banho, boolean tosa) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.animalBanhoTosa = animalBanhoTosa;
        this.banho = banho;
        this.tosa = tosa;
    }


    public BanhoTosa() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public ArrayList<BanhoTosa> getListaBanhoETosa() {
        return listaBanhoETosa;
    }

    public void setListaBanhoETosa(ArrayList<BanhoTosa> listaBanhoETosa) {
        this.listaBanhoETosa = listaBanhoETosa;
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
        return "BanhoTosa{" + "id=" + id + ", nomeCliente=" + nomeCliente + ", animalBanhoTosa=" + animalBanhoTosa + ", banho=" + banho + ", tosa=" + tosa + ", listaBanhoETosa=" + listaBanhoETosa + '}';
    }
    
    

    
    
    
}
