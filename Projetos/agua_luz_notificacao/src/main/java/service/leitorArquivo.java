package service;

import model.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class leitorArquivo {
	
	public List<contrato> lerContratosCsv() {
        List<String> conteudo = lerArquivo("agua-luz-contratos.csv");
        List<contrato> contratos = new ArrayList<>() ;
        for(String linha : conteudo) {
            contrato c = new contrato();
            cadastro cad = new cadastro();
            endereco endereco = new endereco();


            String campos[] = linha.split(";");
            cad.setEndereco(endereco);
            cad.setCpf(campos[0]);
            cad.setRg(campos[1]);
            cad.setNome(campos[2]);
            cad.setCelular(campos[3]);
            endereco.setLogradouro(campos[4]);
            endereco.setNumero(campos[5]);
            endereco.setComplemento(campos[6]);
            endereco.setBairro(campos[7]);
            endereco.setCidade(campos[8]);
            endereco.setEstado(campos[9]);
            endereco.setCep(campos[10]);

            pais pais = pais.valueOf(campos[11].toUpperCase());
            cad.setPais(pais);

            c.setNumeroProtocolo(Long.valueOf(campos[12]));
            c.setDataHora(LocalDateTime.parse(campos[13]));


            servico servico = servico.valueOf(campos[14].toUpperCase());
            c.setServico(servico);
            c.setValor(Double.valueOf(campos[15]));

            tipoNotificacao tipoNotificacao = tipoNotificacao.valueOf(campos[17].toUpperCase());
            c.setTipoNotificacao(tipoNotificacao);


            c.setCliente(cad);
            contratos.add(c);
        }
        return contratos;
    }

    private List<String> lerArquivo(String nomeArquivo) {
        Path filePath = Paths.get("C:\\Users\\flavi\\OneDrive\\Documentos\\Programming Studies\\4_MJV_School\\Projetos\\Arquivos gerados da API", nomeArquivo);
        try {
            List<String> lines = Files.readAllLines(filePath);
            return lines;
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
