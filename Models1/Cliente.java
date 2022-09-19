/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models1;

import Enums.EnumSexoPessoa;
import Models1.Pessoa;
import models2.Endereco;
import models2.Telefone;

/**
 *
 * @author Everton
 */
public class Cliente extends Pessoa{

    public Cliente() {
    }

    public Cliente(int id, String name, Endereco endereco, Telefone telefone, String cpf, EnumSexoPessoa sexoPessoa) {
        super(id, name, endereco, telefone, cpf, sexoPessoa);
    }
  
    

        
    
    private int id;
    private Animal animalCliente;

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", animalCliente=" + animalCliente + '}';
    }
    
    
    
    
}
