package com.mycompany.ultra.Ultracar.Oficina.Model;
public class PecaServico {
    private long id_item; //IDENTIFICADOR DE ITEM
    private String descriçao; // DESCCRIÇAO 
    private String tipo; // TIPO DE ITEM
    private String modelo_compativel; // Modelo de veiculos compativeis 
    // CONSTRUTOR
    public PecaServico(){
        // CONSTRUTOR PADRAO
    } 

    public PecaServico(long id_item, String descriçao, String tipo, String modelo_compativel) {
        this.id_item = id_item;
        this.descriçao = descriçao;
        this.tipo = tipo;
        this.modelo_compativel = modelo_compativel;
    }
    // GET && SET

    public long getId_item() {
        return id_item;
    }

    public void setId_item(long id_item) {
        this.id_item = id_item;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo_compativel() {
        return modelo_compativel;
    }

    public void setModelo_compativel(String modelo_compativel) {
        this.modelo_compativel = modelo_compativel;
    }
    
}
