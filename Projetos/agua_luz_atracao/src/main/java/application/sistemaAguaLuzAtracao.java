package application;

import model.contrato;
import repository.contratoRepository;
import service.geradorArquivo;

public class sistemaAguaLuzAtracao {
	public static void main(String[] args) {
		
		contratoRepository rep = new contratoRepository();
		contrato contrato = rep.pegarUnicoContrato();
		
		geradorArquivo ga = new geradorArquivo();
		ga.txt(contrato);
		
	}

}
