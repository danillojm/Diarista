package br.com.diaristaWeb.main;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable{

	@Temporal(TemporalType.TIMESTAMP)
	private Date dthCadastro;
	@OneToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;

	public Date getDthCadastro() {
		return dthCadastro;
	}

	public void setDthCadastro(Date dthCadastro) {
		this.dthCadastro = dthCadastro;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
