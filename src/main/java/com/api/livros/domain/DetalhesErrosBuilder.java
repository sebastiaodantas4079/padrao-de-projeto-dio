package com.api.livros.domain;

public class DetalhesErrosBuilder {

	private DetalhesErros erros;
	
	public DetalhesErrosBuilder() {
		
		this.erros = new DetalhesErros();
		
	}
		
	public DetalhesErros build() {
		
		return erros;
		
	}
	
	public DetalhesErrosBuilder titulo(String titulo) {
		this.erros.setTitulo(titulo);
		return this;
	}
	
	public DetalhesErrosBuilder status(Long status) {
		this.erros.setStatus(status);
		return this;
	}
	
	public DetalhesErrosBuilder timestamp(String timestamp) {
		this.erros.setTimestamp(timestamp);
		return this;
	}
	
	public DetalhesErrosBuilder mensagemErro(String mensagemErro) {
		this.erros.setMensagemErro(mensagemErro);
		return this;
	}
	
}
