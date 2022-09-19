/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models1;

import Enums.EnumSexoPessoa;
import Models1.Pessoa;
import java.util.ArrayList;
import java.util.Scanner;
import models2.Endereco;
import models2.Telefone;

/**
 *
 * @author Everton
 */
public class Cliente extends Pessoa{

        
    private int id;
    private Animal animalCliente;

    public Cliente(int id, String name, Endereco endereco, Telefone telefone, String cpf, EnumSexoPessoa sexoPessoa) {
        super(id, name, endereco, telefone, cpf, sexoPessoa);
    }

   
    

    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal getAnimalCliente() {
        return animalCliente;
    }

    public void setAnimalCliente(Animal animalCliente) {
        this.animalCliente = animalCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + super.getId() + ", name=" + super.getName() + ", endereco=" + super.getEndereco() + ", telefone=" + super.getTelefone() + ", cpf=" + super.getCpf() + ", sexoPessoa=" + super.getSexoPessoa() + ", animalCliente=" + animalCliente + '}';
        
    }


    public void cadastrarCliente(Cliente cliente, Endereco endereco, Telefone telefone, ArrayList<Cliente>listaCliente){
        
        Scanner leia = new Scanner (System.in);
        
                System.out.println("Informe o nome: ");
        cliente.setName(leia.next());
        System.out.println("Informe o Cpf: ");
        cliente.setCpf(leia.next());
        System.out.println("Informe um endereco: ");
        System.out.println("Id: ");
        endereco.setId(leia.nextInt());
        System.out.println("Cidade: ");
        endereco.setCidade(leia.next());
        System.out.println("Bairro: ");
        endereco.setBairro(leia.next());
        System.out.println("Rua: ");
        endereco.setRua(leia.next());
        System.out.println("Numero Residencia: ");
        endereco.setNumCasa(leia.nextInt());
        cliente.setEndereco(endereco);
        System.out.println("Informe o Telefone para contato: \n");
        System.out.println("Id telefone: ");
        telefone.setId(leia.nextInt());
        System.out.println("Informe o DD e Telefone: ");
        telefone.setDd(leia.nextInt());
        telefone.setNumero(leia.next());
        cliente.setTelefone(telefone);
        
        
        System.out.println(cliente.getName() +  " Cadastrado com sucesso!!");
        listaCliente.add(cliente);
        
    }
    
    
    
}
