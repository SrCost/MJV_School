package controleFluxo;

public class ControleFluxoCondicional {
	public static void main(String[] args) {
		ControleFluxoCondicional.simuladorCaixaEletronicoFluxoSimples();
	}
	
	static void simuladorCaixaEletronicoFluxoSimples() {
		double saldo = 25.0;
	    double valorSolicitado = 17.0;

	    if(valorSolicitado < saldo)
	    	saldo = saldo - valorSolicitado;

	    System.out.println(saldo);

	}
}
