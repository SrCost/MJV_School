package model;

public enum pais {
	
	BRASIL("BR","Brasil"),
    ESTADOS_UNIDOS("EUA","Estados Unidos"),
    FRANCA("FR","Fran�a");

    private String sigla;
    private String descricao;

    pais (String sigla,String descricao) {

    }

    public String getSigla() {
        return this.sigla;
    }
    public String getDescricao() {
        return this.descricao;
    }
}
