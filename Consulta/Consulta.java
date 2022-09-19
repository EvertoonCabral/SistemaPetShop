
package Consulta;

// import java.util.Date;

import Enums.EnumFormaPagamento;
import Models1.Animal;
import Models1.Cliente;
import Models1.Medico;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models2.Raca;

public class Consulta {
    
    private int id;
    private Medico veterinarioConsulta;
    private Cliente donoAnimal;
    private Animal animalConsulta;
    private String diaConsulta;
    private Double valorExame=0.0;
    private Double valorMedic=0.0;
    private Double valorConsulta=0.0;
    private Double valorVacina=0.0;
    private Double total=0.0;
    private EnumFormaPagamento formaPagamento;
    private ArrayList<Vacinacao> listaVacina = new ArrayList<>();
    private ArrayList<Exame> listaExame = new ArrayList<>();
    private ArrayList<Medicamentos> listaMedicamento = new ArrayList<>();

    public Consulta(int id, Medico veterinarioConsulta, Cliente donoAnimal, Animal animalConsulta, String diaConsulta, EnumFormaPagamento formaPagamento) {
        this.id = id;
        this.veterinarioConsulta = veterinarioConsulta;
        this.donoAnimal = donoAnimal;
        this.animalConsulta = animalConsulta;
        this.diaConsulta = diaConsulta;
        this.formaPagamento = formaPagamento;
    }


    


  
    public Double getValorExame() {
        return valorExame;
    }
    
    public void setValorExame(Double valorExame) {
        this.valorExame = valorExame;
    }
    
    public Double getValorMedic() {
        return valorMedic;
    }
    
    public void setValorMedic(Double valorMedic) {
        this.valorMedic = valorMedic;
    }
    
    public Double getValorConsulta() {
        return valorConsulta;
    }
    
    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
    
    public Double getTotal() {
        return total;
    }
    
    public void setTotal(Double total) {
        this.total = total;
    }
    
    public ArrayList<Exame> getListaExame() {
        return listaExame;
    }
    
    public void setListaExame(ArrayList<Exame> listaExame) {
        this.listaExame = listaExame;
    }
    
    public Medico getVeterinarioConsulta() {
        return veterinarioConsulta;
    }
    
    public void setVeterinarioConsulta(Medico veterinarioConsulta) {
        this.veterinarioConsulta = veterinarioConsulta;
    }
    
    public Cliente getDonoAnimal() {
        return donoAnimal;
    }
    
    public void setDonoAnimal(Cliente donoAnimal) {
        this.donoAnimal = donoAnimal;
    }
    
    public Animal getAnimalConsulta() {
        return animalConsulta;
    }
    
    public void setAnimalConsulta(Animal animalConsulta) {
        this.animalConsulta = animalConsulta;
    }
    
    public ArrayList<Vacinacao> getListaVacina() {
        return listaVacina;
    }
    
    public void setListaVacina(ArrayList<Vacinacao> listaVacina) {
        this.listaVacina = listaVacina;
    }
    
    public Double getValorVacina() {
        return valorVacina;
    }
    
    public void setValorVacina(Double valorVacina) {
        this.valorVacina = valorVacina;
    }
    
    public String getDiaConsulta() {
        return diaConsulta;
    }
    
    public void setDiaConsulta(String diaConsulta) {
        this.diaConsulta = diaConsulta;
    }
    
    public ArrayList<Medicamentos> getListaMedicamento() {
        return listaMedicamento;
    }
    
    public void setListaMedicamento(ArrayList<Medicamentos> listaMedicamento) {
        this.listaMedicamento = listaMedicamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EnumFormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(EnumFormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "Consulta{" + "id=" + id + ", veterinarioConsulta=" + veterinarioConsulta + ", donoAnimal=" + donoAnimal + ", animalConsulta=" + animalConsulta + ", diaConsulta=" + diaConsulta + ", valorExame=" + valorExame + ", valorMedic=" + valorMedic + ", valorConsulta=" + valorConsulta + ", valorVacina=" + valorVacina + ", total=" + total + ", formaPagamento=" + formaPagamento + ", listaVacina=" + listaVacina + ", listaExame=" + listaExame + ", listaMedicamento=" + listaMedicamento + '}';
    }

    
    public Double calcularValorConsulta() {
        
        String vacina;
        
        for (int i = 0; i < listaExame.size(); i++) {
            valorExame += listaExame.get(i).getValorExame();
        }
            for (int i = 0; i < listaMedicamento.size(); i++) {
            valorMedic += listaMedicamento.get(i).getValorMedicamento();
             }    
                 for (int i = 0; i < listaVacina.size(); i++) {
            valorVacina += listaVacina.get(i).getValorVacina();
                 }     
                 
                 
       vacina = JOptionPane.showInputDialog("Informe a proxima vacina do animal");
        animalConsulta.setProximaDoseVacina(vacina);
        
        total = valorConsulta + valorExame + valorMedic + valorVacina;
        
        return total;
    }
    
   /* public static void IniciarConsulta(Consulta consulta, Animal animalConsulta, Cliente cliente, Raca raca){
        
        System.out.println("\n Informe o nome do Dono do animalConsulta: ");
        cliente.setName(leia.next());
        System.out.println("Informe o Nome do animalConsulta:  ");
        animalConsulta.setName(leia.next());
        System.out.println("\n Informe a Raca do animalConsulta: ");
        raca.setNameCientifico(leia.next());
        System.out.println("\n Informe o sintomas do Animal: ");
        consulta.motivoConsulta(leia.next());
        System.out.println("Informe o tempo de duração da consulta (Em minutos)");
        consulta.setDuracaoEmMin(leia.nextInt());
        
    }
  */  
 
    
}
