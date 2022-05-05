package service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


import model.cadastro;
import model.contrato;
import model.endereco;
import util.textoUtil;


public class geradorArquivo {
	
	public void csv(contrato contrato) {
		StringBuilder sb = new StringBuilder();
		sb.append(contrato.getCliente().getCpf() + ";");
		
		System.out.println(sb.toString());
		escrever(sb.toString(), "agua-luz-contratos.csv");
		
	}

	public void txt(contrato contrato) {
		StringBuilder sb = new StringBuilder();
		
		cadastro cli = contrato.getCliente();
		endereco end = cli.getEndereco();
		
		
		sb.append(textoUtil.removerCaracteresEspeciais(cli.getCpf()));
		sb.append(textoUtil.ajustar(cli.getRg(),10));
		sb.append(textoUtil.ajustar(cli.getNome(), 30) );
		sb.append(textoUtil.removerCaracteresEspeciais(cli.getCelular()));
		sb.append(textoUtil.ajustar(end.getLogradouro(), 20) );
		sb.append(textoUtil.completarZeroEsquerda(Integer.valueOf(end.getNumero()), 6) );
		sb.append(textoUtil.ajustar(end.getComplemento(), 10) );
		sb.append(textoUtil.ajustar(end.getBairro(), 15) );
		sb.append(textoUtil.ajustar(end.getCidade(), 30) );
		sb.append(textoUtil.ajustar(end.getEstado(), 2) );
		String cep = textoUtil.removerCaracteresEspeciais(end.getCep());
		sb.append(textoUtil.ajustar( cep.replaceAll("\\D", ""), 8) );
		sb.append(cli.getPais().getSigla() );
		sb.append(textoUtil.completarZeroEsquerda(contrato.getNumeroProtocolo(), 10) );
		sb.append(textoUtil.removerCaracteresEspeciais(contrato.getDataHora().toString()));
		sb.append(contrato.getServico().getSigla() );
		String valor = textoUtil.removerCaracteresEspeciais(contrato.getValor().toString());
		valor = textoUtil.completarZeroEsquerda(Long.valueOf(valor), 8);
		sb.append(valor );
		
		sb.append(contrato.getTipoNotificacao().name() );
		
		escrever(sb.toString().toUpperCase(), "agua-luz-contratos.txt");
		
	}
	private void escrever(String conteudo, String nomeArquivo) {
		File dir = new File("C:\\Users\\flavi\\OneDrive\\Documentos\\Programming Studies\\4_MJV_School\\Projetos\\Arquivos gerados da API");
		dir.mkdirs();
		
		Path path = Paths.get(dir.getAbsolutePath(), nomeArquivo);

		try {
			Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
