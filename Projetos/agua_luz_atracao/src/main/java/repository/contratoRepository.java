package repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model.cadastro;
import model.contrato;
import model.endereco;
import model.pais;
import model.servico;
import model.tipoNotificacao;

public class contratoRepository {
	
	//banco de dados fake
		private List<contrato> contratos = new ArrayList<contrato>();
		
		public contrato pegarUnicoContrato() {
			contrato contrato = new contrato();
			contrato.setDataHora(LocalDateTime.of(2022, 5, 7, 16, 0));
			contrato.setNumeroProtocolo(2022025687L);
			
			contrato.setServico(servico.AGUA);
			contrato.setTipoNotificacao(tipoNotificacao.WTS);
			cadastro cliente = new cadastro();
			contrato.setCliente(cliente);
			
			cliente.setCpf("003.848.650-65");
			cliente.setNome("Raimundo Nonato Loureiro Castelo Branco");
			cliente.setRg("33765-5");
			cliente.setPais(pais.BRASIL);
			cliente.setCelular("(11) 99768-1515");
			
			endereco endereco = new endereco();
			cliente.setEndereco(endereco);
			
			endereco.setBairro("Santo Antonio");
			endereco.setCep("27.310-657");
			endereco.setCidade("São Paulo");
			endereco.setEstado("SP");
			endereco.setLogradouro("Rua das Marias");
			endereco.setNumero("37");
			endereco.setComplemento("Bloco C");
			return contrato;
		}
		
		public List<contrato> listar() {
			contrato contrato = new contrato();
			contrato.setDataHora(LocalDateTime.of(2022, 2, 21, 16, 0));
			contrato.setNumeroProtocolo(2022025687L);
			
			contrato.setServico(servico.AGUA);
			
			cadastro cliente = new cadastro();
			contrato.setCliente(cliente);
			
			cliente.setCpf("23476598727");
			cliente.setNome("Gleyson Sampaio");
			cliente.setRg("87897");
			cliente.setPais(pais.BRASIL);
			
			endereco endereco = new endereco();
			cliente.setEndereco(endereco);
			
			endereco.setBairro("Santo Antonio");
			endereco.setCep("27310657");
			endereco.setCidade("São Paulo");
			endereco.setEstado("SP");
			endereco.setLogradouro("Rua das Marias");
			endereco.setNumero("243");
			endereco.setComplemento("Bloco C");

			contratos.add(contrato);
			return contratos;
		}
		
		
}
