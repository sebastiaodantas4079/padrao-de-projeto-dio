package com.api.livros.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class Livro {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@JsonInclude(Include.NON_NULL)
	private Long id;
	
	@JsonInclude(Include.NON_NULL)
	private String nomeLivro;
	
	@JsonInclude(Include.NON_NULL)
	private Date publicacao;
	
	@JsonInclude(Include.NON_NULL)
	private String editora;
	
	@JsonInclude(Include.NON_NULL)
	private String resumo;
	
	@JsonInclude(Include.NON_NULL)
	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "livro")
	private List<Comentario> comentarios;
	
	@ManyToOne
	@JsonInclude(Include.NON_NULL)
	private Autor autor;

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public Date getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Date publicacao) {
		this.publicacao = publicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	
	
	
	
}
