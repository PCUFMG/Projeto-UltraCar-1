package com.mycompany.ultra.Ultracar.Oficina.Model;
public class ItemOrdem {
    private long id_item_ordem; // IDENTIFICADOR UNICO PARA ITEM DA OREDM DE SERVICO
    private long id_ordem; // IDENTIFICADOR UNICO PARA ORDEM DE SERVICO 
    private long id_item;// IDENTIFICADOR UNICO PARA ITEM 
    private int quantidade; // QUANTIDADE DE PECAS 
    private int valor; // VALOR DAS PECAS 
    // CONSTRUTOR
    public ItemOrdem(){
        // CONSTRUTOR PADRAO
    }

    public ItemOrdem(long id_item_ordem, long id_ordem, long id_item, int quantidade, int valor) {
        this.id_item_ordem = id_item_ordem;
        this.id_ordem = id_ordem;
        this.id_item = id_item;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    // GET & SET 

    public long getId_item_ordem() {
        return id_item_ordem;
    }

    public void setId_item_ordem(long id_item_ordem) {
        this.id_item_ordem = id_item_ordem;
    }

    public long getId_ordem() {
        return id_ordem;
    }

    public void setId_ordem(long id_ordem) {
        this.id_ordem = id_ordem;
    }

    public long getId_item() {
        return id_item;
    }

    public void setId_item(long id_item) {
        this.id_item = id_item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
