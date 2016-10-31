package br.com.diaristaWeb.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	
	public static final String strId = "id";
	public static final String strSenha = "senha";
	public static final String strPessoa = "pessoa";
	public static final String strTipo = "tipo";
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(length = 32, nullable = false)
	private String senha;
	@Column(nullable = false)
	private Character tipo;

	@OneToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;

	private static final String USUARIO_DIARISTA = "D";
	@SuppressWarnings("unused")
	private static final String USUARIO_CLIENTE = "C";

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
