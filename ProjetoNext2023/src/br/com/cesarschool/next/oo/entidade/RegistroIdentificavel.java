package br.com.cesarschool.next.oo.entidade;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;

public abstract class RegistroIdentificavel implements Serializable{
	private static final long serialVersionUID = 1L;
	private LocalDateTime dataHoraCriacao;

	public LocalDateTime getDataHoraCriacao() {
		return dataHoraCriacao;
	}

	public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
		this.dataHoraCriacao = dataHoraCriacao;
	}

	public long obterTempoDeCriacao() {
		LocalDateTime atual = LocalDateTime.now();		
		return Duration.between(dataHoraCriacao, atual).toDays();
	}
	
	public abstract String obterChaves();
}
