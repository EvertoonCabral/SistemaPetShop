/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consulta;

/**
 *
 * @author Everton
 */
public class Medicamentos {
    
    private int id;
    private String nome;
    private double peso;
    private String usoRemedio;
    private String tarja;
    private double valorMedicamento;

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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getUsoRemedio() {
        return usoRemedio;
    }

    public void setUsoRemedio(String usoRemedio) {
        this.usoRemedio = usoRemedio;
    }

    public String getTarja() {
        return tarja;
    }

    public void setTarja(String tarja) {
        this.tarja = tarja;
    }

    public double getValorMedicamento() {
        return valorMedicamento;
    }

    public void setValorMedicamento(double valorMedicamento) {
        this.valorMedicamento = valorMedicamento;
    }

    @Override
    public String toString() {
        return "Medicamentos{" + "id=" + id + ", nome=" + nome + ", peso=" + peso + ", usoRemedio=" + usoRemedio + ", tarja=" + tarja + ", valorMedicamento=" + valorMedicamento + '}';
    }
    
    


    
    
}
