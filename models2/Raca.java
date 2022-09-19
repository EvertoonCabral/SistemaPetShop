/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models2;


import Enums.EnumSexoAnimal;
import Models1.Animal;
import Models1.Cliente;

/**
 *
 * @author Everton
 */
public class Raca extends Animal {
    
    private String nameCientifico;
    private String ObsRaca;

    public Raca(int id, String name, String proximaDoseVacina, Raca racaAnimal, int peso, Cliente donoAnimal, EnumSexoAnimal sexoAnimal) {
        super(id, name, proximaDoseVacina, racaAnimal, peso, donoAnimal, sexoAnimal);
    }

    public Raca() {
    }


    


    public String getNameCientifico() {
        return nameCientifico;
    }

    public void setNameCientifico(String nameCientifico) {
        this.nameCientifico = nameCientifico;
    }

    public String getObsRaca() {
        return ObsRaca;
    }

    public void setObsRaca(String ObsRaca) {
        this.ObsRaca = ObsRaca;
    }
    
  
    
    
}
