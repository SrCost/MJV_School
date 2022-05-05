package com.mjv.openbanking;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.time.LocalDate;

public class GeradorArquivo {

	public void escreverDisco( String conteudoGerado) {
		LocalDate now= LocalDate.now();
		String nomeArquivo = now.toString() + ".txt";
		try {
			//File diretorio = new File("c:\\estudos\\banco_central\\movimentacoes");
			File diretorio = new File("C:\\Users\\flavi\\OneDrive\\Documentos\\Programming Studies\\4_MJV_School\\Projetos\\Arquivos gerados da API");
			if(! diretorio.exists())
				diretorio.mkdirs();
				
			Path path = Paths.get (diretorio.getAbsolutePath(), nomeArquivo );
			
			Files.write(path, conteudoGerado.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
			}
		}
	}
