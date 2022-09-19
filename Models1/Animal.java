/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models1;

import Enums.EnumSexoAnimal;
import java.util.ArrayList;
import models2.Raca;

/**
 *
 * @author Everton
 */
public class Animal {
    
    private int id;
    private String name;
    private String proximaDoseVacina;
    private Raca racaAnimal;
    private int peso;
    private Cliente donoAnimal;
    private EnumSexoAnimal sexoAnimal;

    public Animal(int id, String name, String proximaDoseVacina, Raca racaAnimal, int peso, Cliente donoAnimal, EnumSexoAnimal sexoAnimal) {
        this.id = id;
        this.name = name;
        this.proximaDoseVacina = proximaDoseVacina;
        this.racaAnimal = racaAnimal;
        this.peso = peso;
        this.donoAnimal = donoAnimal;
        this.sexoAnimal = sexoAnimal;
    }

    public Animal() {
    }




    public Cliente getDonoAnimal() {
        return donoAnimal;
    }

    public void setDonoAnimal(Cliente donoAnimal) {
        this.donoAnimal = donoAnimal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProximaDoseVacina() {
        return proximaDoseVacina;
    }

    public void setProximaDoseVacina(String proximaDoseVacina) {
        this.proximaDoseVacina = proximaDoseVacina;
    }
    
    

    public Raca getRacaAnimal() {
        return racaAnimal;
    }

    public void setRacaAnimal(Raca racaAnimal) {
        this.racaAnimal = racaAnimal;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public EnumSexoAnimal getSexoAnimal() {
        return sexoAnimal;
    }

    public void setSexoAnimal(EnumSexoAnimal sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }

 

    
   /* public static void CadastrarAnimal(Animal animal, Raca raca, Cliente donoAnimal){
      
        System.out.println("Informe o Id:");
        animal.setName(leia.nextInt());
        System.out.println("\n Informe o nome do Animal: ");
        animal.setName(leia.next());
        System.out.println("\n Informe ");
        System.out.println("\n Informe o nome Cientifico do animal: ");
        raca.setNameCientifico(leia.next());
        System.out.println("\n Informe alguma Observação sobre o animal: ");
        raca.setObsRaca(leia.next());
        animal.setRacaAnimal(raca);
        System.out.println("\n Informe o peso do animal: ");
        animal.setPeso(leia.nextInt());
        
    };
    */
    
    // public static void ListarAnimal();

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", name=" + name + ", proximaDoseVacina=" + proximaDoseVacina + ", racaAnimal=" + racaAnimal + ", peso=" + peso + ", donoAnimal=" + donoAnimal + ", sexoAnimal=" + sexoAnimal + '}';
    }



}
