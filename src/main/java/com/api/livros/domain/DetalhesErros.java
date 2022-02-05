package com.api.livros.domain;

public class DetalhesErros {
	
	private String titulo;
	
	private Long status;
	
	private String timestamp;
	
	private String mensagemErro;

	public String getTitulo() {
		return titulo;
	}

	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Long getStatus() {
		return status;
	}

	protected void setStatus(Long status) {
		this.status = status;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getMensagemErro() {
		return mensagemErro;
	}

	protected void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}

	protected DetalhesErros() {
		
	}
	
	
	
}
