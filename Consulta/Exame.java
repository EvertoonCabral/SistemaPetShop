/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consulta;

/**
 *
 * @author Everton
 */
public class Exame {
    private int id;
   // private Consulta ConsultaPreviaDoExame;
    private String DescricaoExame;
    private double valorExame;

    public Exame(int id, String DescricaoExame, double valorExame) {
        this.id = id;
        this.DescricaoExame = DescricaoExame;
        this.valorExame = valorExame;
    }



    

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricaoExame() {
        return DescricaoExame;
    }

    public void setDescricaoExame(String DescricaoExame) {
        this.DescricaoExame = DescricaoExame;
    }

    public double getValorExame() {
        return valorExame;
    }

    public void setValorExame(double valorExame) {
        this.valorExame = valorExame;
    }

    @Override
    public String toString() {
        return "Exame{" + "id=" + id + ", DescricaoExame=" + DescricaoExame + ", valorExame=" + valorExame + '}';
    }






    
    

    
    

    
}
