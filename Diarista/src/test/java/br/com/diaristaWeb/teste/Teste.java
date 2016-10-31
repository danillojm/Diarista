package br.com.diaristaWeb.teste;

import org.hibernate.Session;

import br.com.diaristaWeb.dao.PessoaDao;
import br.com.diaristaWeb.dao.UsuarioDao;
import br.com.diaristaWeb.main.Pessoa;
import br.com.diaristaWeb.util.HibernateUtil;

public class Teste {

	public static void main(String[] args) {
Session sessao = HibernateUtil.getSessionFactory().openSession();
		
		UsuarioDao dao = new UsuarioDao();
		dao.autenticar(sessao, "danillo", "12345");
	    
	    
	    
	    
	}
	
}
