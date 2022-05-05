package service;

import model.cadastro;
import model.contrato;
import util.formatadorUtil;

public class geradorMensagem {
	
	public void gerar(contrato contrato) {
		StringBuilder sb = new StringBuilder();
		cadastro cliente = contrato.getCliente();
		String cpfFormatado = formatadorUtil.formatarCpf(cliente.getCpf());
		String dataFormatada = formatadorUtil.formatarData(contrato.getDataHora());

		sb.append(String.format("Senhor(a) %s cpf de n�mero %s, ",cliente.getNome(), cpfFormatado ));
		sb.append(String.format("Informamos que conforme contrato com protocolo de n�mero %d ", contrato.getNumeroProtocolo()));
		sb.append(dataFormatada);
		sb.append(String.format("a instala��o do servi�o de %s com taxa de valor R$ %.2f em sua resid�ncia localizada no endere�o abaixo:\n", contrato.getServico(), contrato.getValor()));
		sb.append(String.format("-> Logradouro:", cliente.getEndereco().getLogradouro(), cliente.getEndereco().getNumero()));
		sb.append("\n");
		sb.append(String.format("-> Complemento: ", cliente.getEndereco().getComplemento()));
		sb.append("\n");
		sb.append(String.format("-> Bairro: ", cliente.getEndereco().getBairro()));
		sb.append("\n");
		sb.append(String.format("-> Cidade: ", cliente.getEndereco().getCidade()));
		sb.append("\n");
		sb.append(String.format("-> Cep: ", cliente.getEndereco().getCep()));



		System.out.println(sb.toString());
	}
}
