/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesrevisao2;

/**
 *
 * @author Gabriel
 */
public class Caminhoneiro {
    private String nome;
    private String placa;
    private String horarioChegada;

    public Caminhoneiro(String nome, String placa, String horarioChegada) {
        this.nome = nome;
        this.placa = placa;
        this.horarioChegada = horarioChegada;
    }

    public String getNome() {
        return nome;
    }

    public String getPlaca() {
        return placa;
    }

    public String getHorarioChegada() {
        return horarioChegada;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Placa: " + placa + ", Horário de Chegada: " + horarioChegada;
    }
}
