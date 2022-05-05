package model;

import java.time.LocalDateTime;

public class contrato {
	private Long numeroProtocolo;
	private servico servico;
	private Double valor;
	private LocalDateTime dataHora;
	private cadastro cliente;
	private tipoNotificacao tipoNotificacao;

	public servico getServico() {
		return servico;
	}

	public void setServico(servico servico) {
		this.servico = servico;
	}

	public tipoNotificacao getTipoNotificacao() {
		return tipoNotificacao;
	}

	public void setTipoNotificacao(tipoNotificacao tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}

	public Long getNumeroProtocolo() {
		return numeroProtocolo;
	}
	public void setNumeroProtocolo(Long numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public cadastro getCliente() {
		return cliente;
	}
	public void setCliente(cadastro cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Contrato{" +
				"numeroProtocolo=" + numeroProtocolo +
				", servico=" + servico +
				", valor=" + valor +
				", dataHora=" + dataHora +
				", cliente=" + cliente +
				", tipoNotificacao=" + tipoNotificacao +
				'}';
	}
}
