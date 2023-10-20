package com.mycompany.ultra;

import com.mycompany.ultra.Ultracar.Oficina.dao.ClienteDao;
import com.mycompany.ultra.Ultracar.Oficina.dao.ItemOrdemDao;
import com.mycompany.ultra.Ultracar.Oficina.dao.OrdemServicoDao;
import com.mycompany.ultra.Ultracar.Oficina.dao.PecaServicoDao;
import com.mycompany.ultra.Ultracar.Oficina.dao.VeiculoDao;

import com.mycompany.ultra.Ultracar.Oficina.Model.Cliente;
import com.mycompany.ultra.Ultracar.Oficina.Model.ItemOrdem;
import com.mycompany.ultra.Ultracar.Oficina.Model.OrdemServico;
import com.mycompany.ultra.Ultracar.Oficina.Model.PecaServico;
import com.mycompany.ultra.Ultracar.Oficina.Model.Veiculo;


//MVC
/*
 * Model
 * View
 * Controller
 */

public class Ultra {

	public static void main(String[] args) {
		
ClienteDao clientedao = new ClienteDao();
ItemOrdemDao itemordemdao = new ItemOrdemDao();
OrdemServicoDao ordemServicodao = new OrdemServicoDao();
PecaServicoDao pecaservicodao = new PecaServicoDao();
VeiculoDao veiculodao = new VeiculoDao();
       
        Cliente cliente = new Cliente();
        OrdemServico ordemServico = new OrdemServico();
        PecaServico pecaservico = new PecaServico();
        Veiculo veiculoservice = new Veiculo();
        
        cliente.setNome("Paulo cesar");
        cliente.setCpf( (long) 2	);
        cliente.setEmail("paulinho@outlook.com");
        cliente.setTelefone( 333333);
        cliente.setEndereco("av.olimpio garcia numero 152");
        
     ItemOrdem itemOrdem = new ItemOrdem();

        itemOrdem.setId_item(1);
        itemOrdem.setId_item_ordem(1);
        itemOrdem.setId_ordem(1);
        itemOrdem.setQuantidade(2);
        itemOrdem.setValor(520);
        
        ordemServico.setId_cliente(1);
        ordemServico.getId_ordem(1);
        ordemServico.getId_veiculo(1);
        ordemServico.getObservaçao("teste");
        ordemServico.setStatus("Aberto");
        ordemServico.setData_abertura(0);;
        
        
        
        
        clientedao.save(cliente);
        itemordemdao.save(itemOrdem);
        ordemServicodao.save(ordemServico);
        pecaservicodao.save(pecaservico);
        veiculodao.save(veiculoservice);
        
	
		
	
		}
	}



       
		