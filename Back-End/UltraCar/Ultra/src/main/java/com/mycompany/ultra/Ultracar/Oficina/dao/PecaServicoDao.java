package com.mycompany.ultra.Ultracar.Oficina.dao;
import com.mycompany.ultra.Ultracar.Oficina.Model.PecaServico;
import com.mycompany.ultra.Ultracar.Oficina.controller.ClienteController;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class PecaServicoDao {
public void save(PecaServico pecaservico) {
        
        String sql = "INSERT INTO pecas_servicos(id_item, descriçao, tipo, modelo_compativel) VALUES (?,?,?,?)";
        
        Connection conn = null;
        PreparedStatement pstm = null;
         
        try {
            
            conn = ClienteController.createConnectionToMySQL();
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setLong(1,  pecaservico.getId_item());
            pstm.setString(2, pecaservico.getDescriçao());
            pstm.setString(3,  pecaservico.getTipo());
            pstm.setString(4, pecaservico.getModelo_compativel());
            
            
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