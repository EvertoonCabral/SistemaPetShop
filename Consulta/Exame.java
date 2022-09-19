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
    private Consulta idConsulta;
    private Medicamentos idMedicamento;
    private String DescricaoExame;
    private double valorExame;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Consulta getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Consulta idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Medicamentos getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(Medicamentos idMedicamento) {
        this.idMedicamento = idMedicamento;
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
        return "Exame{" + "id=" + id + ", idConsulta=" + idConsulta + ", idMedicamento=" + idMedicamento + ", DescricaoExame=" + DescricaoExame + ", valorExame=" + valorExame + '}';
    }
    
    

    
    

    
}
