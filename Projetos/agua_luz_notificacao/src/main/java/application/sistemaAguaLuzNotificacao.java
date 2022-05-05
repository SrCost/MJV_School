package application;

import java.time.LocalDateTime;
import java.util.List;

import model.cadastro;
import model.contrato;
import model.endereco;
import service.geradorMensagem;
import service.leitorArquivo;

public class sistemaAguaLuzNotificacao {
	public static void main(String[] args) {
		leitorArquivo leitor = new leitorArquivo();
		geradorMensagem gm = new geradorMensagem();


		List<contrato> contratosCsv = leitor.lerContratosCsv();
		contrato primeiro = contratosCsv.get(0);
		gm.gerar(primeiro);

		/*for(Contrato c: contratosCsv) {
			System.out.println(c.getTipoNotificacao());
		}*/
	}

}
