package com.mycompany.ultra.Ultracar.Oficina.dao;
import com.mycompany.ultra.Ultracar.Oficina.Model.OrdemServico;
import com.mycompany.ultra.Ultracar.Oficina.controller.ClienteController;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class OrdemServicoDao {
public void save(OrdemServico ordemservico) {
        
        String sql = "INSERT INTO ordens_servico(id_cliente,id_veiculo,data_abertura,observaçao,status) VALUES (?,?,?,?,?)";
        
        Connection conn = null;
        PreparedStatement pstm = null;
         
        try {
            
            conn = ClienteController.createConnectionToMySQL();
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, (int) ordemservico.getId_cliente());
            pstm.setLong(2, ordemservico.getId_veiculo(0));
            pstm.setInt(3, (int) ordemservico.getData_abertura());
            pstm.setString(4, ordemservico.getObservaçao(sql));
            pstm.setString(5, ordemservico.getStatus());
            
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
