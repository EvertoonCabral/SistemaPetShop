/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models1;

import Enums.EnumSexoPessoa;
import models2.Telefone;
import models2.Endereco;

/**
 *
 * @author Everton
 */
public class Propietario extends Pessoa{

    public Propietario() {
    }

    public Propietario(int id, String name, Endereco endereco, Telefone telefone, String cpf, EnumSexoPessoa sexoPessoa) {
        super(id, name, endereco, telefone, cpf, sexoPessoa);
    }

    
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    @Override
    public String toString() {
        return "Propietario{" + "id=" + id + '}';
    }
    
    
    
}
