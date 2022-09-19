/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models1;

import Enums.EnumDisponibilidadeMedico;
import Enums.EnumSexoPessoa;
import models2.Endereco;
import models2.Telefone;

/**
 *
 * @author Everton
 */
public class Medico extends Pessoa {

    public Medico() {
    }

    public Medico(int id, String name, Endereco endereco, Telefone telefone, String cpf, EnumSexoPessoa sexoPessoa) {
        super(id, name, endereco, telefone, cpf, sexoPessoa);
    }

    
    
    
    
    private int id;
    private String CFMV;
    private EnumDisponibilidadeMedico disponivel;
   // private Endereco enderecoVeterinario;
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCFMV() {
        return CFMV;
    }

    public void setCFMV(String CFMV) {
        this.CFMV = CFMV;
    }

    public EnumDisponibilidadeMedico getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(EnumDisponibilidadeMedico disponivel) {
        this.disponivel = disponivel;
    }





    @Override
    public String toString() {
        return "Medico{" + "id=" + id + ", CFMV=" + CFMV + ", disponivel=" + disponivel + '}';
    }




    
    
    
}
