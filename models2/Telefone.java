/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models2;

/**
 *
 * @author Everton
 */
public class Telefone {
    
    private int id;
    private int dd;
    private String numero;

    public Telefone(int id, int dd, String numero) {
        this.id = id;
        this.dd = dd;
        this.numero = numero;
    }

    public Telefone() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefone{" + "id=" + id + ", dd=" + dd + ", numero=" + numero + '}';
    }
    
    
    
}
