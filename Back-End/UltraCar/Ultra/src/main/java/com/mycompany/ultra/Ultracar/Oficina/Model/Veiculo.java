/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ultra.Ultracar.Oficina.Model;
public class Veiculo {
    // ATRIBUTOS
    private long id_veiculo; // IDENTIFICADOR UNICO PARA O VEICULO
    private long id_cliente; // IDENTIFICADO DO CLIENTE 
    private String placa; // PLACA DO VEICULO
    private String modelo; // MODELO DO VEICULO
    private int ano; // ANO DO VEICULO
    private String cor; // COR DO VEICULO
    
    // CONSTRUTORES
    public Veiculo(){
        // CONSTRUTORES PADRAO
    }

    public Veiculo(long id_veiculo, long id_cliente, String placa, String modelo, int ano, String cor) {
        this.id_veiculo = id_veiculo;
        this.id_cliente = id_cliente;
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    // GET & SET 

    public long getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(long id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String cor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
