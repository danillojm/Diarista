package br.com.diaristaWeb.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.com.diaristaWeb.main.Pessoa;
import br.com.diaristaWeb.main.Usuario;

public class UsuarioDao {

	public void autenticar(Session sessao, String nome, String senha) {

		Criteria ct = sessao.createCriteria(Usuario.class);
		ct.createAlias(Usuario.strPessoa, Usuario.strPessoa);
		ct.add(Restrictions.eq(Usuario.strPessoa + "." + Pessoa.strNome, nome));
		ct.add(Restrictions.eq(Usuario.strSenha, senha));

		Usuario usuario = (Usuario) ct.uniqueResult();

		System.out.println("Bem Vindo " + usuario.getPessoa().getNome());

	}

}
