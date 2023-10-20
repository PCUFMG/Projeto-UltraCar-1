package com.mycompany.ultra.Ultracar.Oficina.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mycompany.ultra.Ultracar.Oficina.Model.ItemOrdem;
import com.mycompany.ultra.Ultracar.Oficina.controller.ItemOrdemController;
public class ItemOrdemDao {
   
  public void save(ItemOrdem itens_ordem) {
        
        String sql = "INSERT INTO itemordem(id_item_ordem,id_ordem,id_item,quantidade,valor) VALUES (?,?,?,?,?)";
        
        Connection conn = null;
        PreparedStatement pstm = null;
         
        try {
            
            conn = ItemOrdemController.createConnectionToMySQL();
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setLong(1, itens_ordem.getId_item_ordem());
            pstm.setLong(2, itens_ordem.getId_ordem());
            pstm.setLong(3, itens_ordem.getId_item());
            pstm.setInt(4, itens_ordem.getQuantidade());
            pstm.setInt(5, itens_ordem.getValor());
           
            
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
