package br.com.diaristaWeb.main;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Danillo
 *
 */
@Entity
@Table(name = "tb_estado")
public class Estado implements Serializable {

	// Usado para facilitar a consulta com o Criteria
	public static final String strId = "id";
	public static final String strNomEstadao = "nomEstado";
	public static final String strUf = "uf";
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "nom_estado", length = 50, nullable = false)
	private String nomEstado;
	@Column(name = "uf", length = 50, nullable = false)
	private String uf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomEstado() {
		return nomEstado;
	}

	public void setNomEstado(String nomEstado) {
		this.nomEstado = nomEstado;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
