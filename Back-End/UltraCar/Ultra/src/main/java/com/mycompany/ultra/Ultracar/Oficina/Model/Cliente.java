package com.mycompany.ultra.Ultracar.Oficina.Model;
public class Cliente {
    //Atributos
   private Long id; // Idetentificador unico para cliente
   private String nome; // Nome completo do clinte
   private Long  cpf; // cpf do cliente 
   private String email; // email do cliente 
   private int telefone; // telefone do cliente
   private String endereco; // endereco do cliente 
   // Construtor
   public Cliente() {
        // Construtor padrão
    }

    public Cliente(Long id, String nome, Long cpf, String email, int telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }
   
    // GET & SET 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
