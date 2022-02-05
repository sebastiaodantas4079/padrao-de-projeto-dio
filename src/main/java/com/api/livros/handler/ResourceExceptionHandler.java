package com.api.livros.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.api.livros.domain.DataAtualSingleton;
import com.api.livros.domain.DetalhesErros;
import com.api.livros.domain.DetalhesErrosBuilder;
import com.api.livros.services.exceptions.LivroNaoEncontradoException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	
	@ExceptionHandler(LivroNaoEncontradoException.class)
	public ResponseEntity<DetalhesErros> handlerLivroNaoEncontradoException(LivroNaoEncontradoException e, HttpServletRequest request){
		
		DetalhesErrosBuilder builder = new DetalhesErrosBuilder();
		
		builder.status(404l)
		.titulo("Livro não encontrado.")
		.mensagemErro("https://stackoverflow.com/")
		.timestamp(DataAtualSingleton.getInstance().getDateAsString());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(builder.build());
	}
	
	@ExceptionHandler(NumberFormatException.class)
	public ResponseEntity<DetalhesErros> handlerNumberFormatException(NumberFormatException e, HttpServletRequest request){
		
		DetalhesErrosBuilder builder = new DetalhesErrosBuilder();
		
		builder.status(401l)
		.titulo("URI invalida.")
		.mensagemErro("https://stackoverflow.com/")
		.timestamp(DataAtualSingleton.getInstance().getDateAsString());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(builder.build());
	}
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<DetalhesErros> handlerMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException e, HttpServletRequest request){
		
		DetalhesErrosBuilder builder = new DetalhesErrosBuilder();
		
		builder.status(401l)
		.titulo("URI invalida.")
		.mensagemErro("https://stackoverflow.com/")
		.timestamp(DataAtualSingleton.getInstance().getDateAsString());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(builder.build());
	}
}
