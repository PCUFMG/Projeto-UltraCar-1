package com.mycompany.ultra.Ultracar.Oficina.Model;
public class OrdemServico {
    //ATRIBUTOS
	private Long id_item_ordem;
    private long id_ordem; // IDENTIFICADOR DA ORDEM DE SERVICO
    private long id_cliente; // IDENTIFICADOR DO CLIENTE
    private long id_veiculo; // IDENTIFICADOR DO VEICULO 
    private float data_abertura; // DATA DE ABERTURA DA ORDEM DE SERVICO
    private String observaçao; // ALGUMA OBESERVAÇAO SOBRE O VEICULO
    private String status; // ESTADO DA ORDEM DE SERVICO 
    // CONSTRUTOR
    public OrdemServico(){
        // CONSTRUTOR PADRAO
    }

    public OrdemServico(Long id_item_ordem	,long id_ordem, long id_cliente, long id_veiculo, float data_abertura, String observaçao, String status) {
        this.id_item_ordem = id_item_ordem	;
    	this.id_ordem = id_ordem;
        this.id_cliente = id_cliente;
        this.id_veiculo = id_veiculo;
        this.data_abertura = data_abertura;
        this.observaçao = observaçao;
        this.status = status;
    }
       // GET & SET
    public long getid_item_ordem(int i) {
        return id_item_ordem;
    }

    public void setid_item_ordem(long id_item_ordem	) {
    	 this.id_item_ordem = id_item_ordem;
    }
    public long getId_ordem(int i) {
        return id_ordem;
    }

    public void setId_ordem(long id_ordem) {
        this.id_ordem = id_ordem;
    }

    public long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public long getId_veiculo(int i) {
        return id_veiculo;
    }

    public void setId_veiculo(long id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public float getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(float data_abertura) {
        this.data_abertura = data_abertura;
    }

    public String getObservaçao(String string) {
        return observaçao;
    }

    public void setObservaçao(String observaçao) {
        this.observaçao = observaçao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
