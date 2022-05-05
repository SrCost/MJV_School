package model;

public enum pais {
	
	BRASIL("BR"),
	ESTADOS_UNIDOS("US"),
	FRANCA ("FR");
	
	private String sigla;
	private pais(String sigla) {
		this.sigla = sigla;
	}
	public String getSigla() {
		return sigla;
	}
	
	public static pais getPaisPorSigla(String sigla) {
		for(pais p: pais.values()) {
			if(p.getSigla().equals(sigla))
				return p;
		}
		return null;
	}
}
