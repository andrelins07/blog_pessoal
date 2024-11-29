package com.generation.blogpessoal.model;

import java.time.LocalDate;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo titulo é obrigatorio")
	@Size(min = 5, max = 100, message = "O atributo titulo deve conter no minimo 5 e no máximo 100 caracteres")
	private String 	titulo;
	
	@NotBlank(message = "O atributo texto é obrigatorio")
	@Size(min = 10, max = 1000, message = "O atributo texto deve conter no minimo 10 e no máximo 1000 caracteres")
	private String texto;
	
	@UpdateTimestamp 
	private LocalDate data;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
}
