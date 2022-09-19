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
public class Pessoa {
    
    private int id;
    private String name;
    private Endereco endereco;
    private Telefone telefone; // sujeito a modificaçoes 
    private String cpf;
    private EnumSexoPessoa sexoPessoa;

    public Pessoa() {
    }

    public Pessoa(int id, String name, Endereco endereco, Telefone telefone, String cpf, EnumSexoPessoa sexoPessoa) {
        this.id = id;
        this.name = name;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.sexoPessoa = sexoPessoa;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EnumSexoPessoa getSexoPessoa() {
        return sexoPessoa;
    }

    public void setSexoPessoa(EnumSexoPessoa sexoPessoa) {
        this.sexoPessoa = sexoPessoa;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", name=" + name + ", endereco=" + endereco + ", telefone=" + telefone + ", cpf=" + cpf + ", sexoPessoa=" + sexoPessoa + '}';
    }

    
    

}

