package br.com.diaristaWeb.teste;

import org.hibernate.Session;

import br.com.diaristaWeb.util.HibernateUtil;

public class GeraTabela {

	public static void main(String[] args) {
		
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.close();
		HibernateUtil.getSessionFactory().close();
		
	}
	
	
}
