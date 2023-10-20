package com.mycompany.ultra.Ultracar.Oficina.dao;
import com.mycompany.ultra.Ultracar.Oficina.Model.Veiculo;
import com.mycompany.ultra.Ultracar.Oficina.controller.ClienteController;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class VeiculoDao {
    public void save(Veiculo veiculo) {
        
        String sql = "INSERT INTO veiculos(id_veiculo,id_cliente,placa,  modelo, ano,cor) VALUES (?,?,?,?,?,?)";
        
        Connection conn = null;
        PreparedStatement pstm = null;
         
        try {
            
            conn = ClienteController.createConnectionToMySQL();
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setLong(1, veiculo.getId_veiculo());
            pstm.setLong(2, veiculo.getId_cliente());
            pstm.setString(3, veiculo.getPlaca());
            pstm.setString(4, veiculo.getModelo());
            pstm.setInt(5, veiculo.getAno());
            pstm.setString(6, veiculo.getCor());
            
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