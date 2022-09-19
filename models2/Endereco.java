/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models2;

/**
 *
 * @author Everton
 */
public class Endereco {
    
    private int id;
    private String cidade;
    private String bairro;
    private int numCasa;
    private String Rua;
    private String cep;

    public Endereco(int id, String cidade, String bairro, int numCasa, String Rua) {
        this.id = id;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numCasa = numCasa;
        this.Rua = Rua;
    }


    

    public Endereco() {
    }
    
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", cidade=" + cidade + ", bairro=" + bairro + ", numCasa=" + numCasa + ", Rua=" + Rua + ", cep=" + cep + '}';
    }
    
    
    


    
    
    
}
