package model;

public enum tipoNotificacao {
	
	SMS("S","Sms"),
    WHATSAPP("W","WhatsApp");

    tipoNotificacao(String sigla,String descricao) {

    }
    private String sigla;
    private String descricao;

    public String getSigla(){
        return this.sigla;
    }
    public String getDescricao() {
        return this.descricao;
    }
}
