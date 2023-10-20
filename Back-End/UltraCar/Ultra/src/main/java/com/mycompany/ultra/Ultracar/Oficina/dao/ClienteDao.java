package com.mycompany.ultra.Ultracar.Oficina.dao;

import com.mycompany.ultra.Ultracar.Oficina.Model.Cliente;
import com.mycompany.ultra.Ultracar.Oficina.controller.ClienteController;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteDao {
    public void save(Cliente clientes) {
        
        String sql = "INSERT INTO cliente(nome,cpf,email,telefone,endereco) VALUES (?,?,?,?,?)";
        
        Connection conn = null;
        PreparedStatement pstm = null;
         
        try {
            
            conn = ClienteController.createConnectionToMySQL();
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, clientes.getNome());
            pstm.setLong(2, clientes.getCpf());
            pstm.setString(3, clientes.getEmail());
            pstm.setInt(4, clientes.getTelefone());
            pstm.setString(5, clientes.getEndereco());
            
            pstm.execute(); 
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(pstm!=null){
                    pstm.close();
                }
                if(conn !=null){
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

