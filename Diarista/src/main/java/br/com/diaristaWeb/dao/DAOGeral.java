package br.com.diaristaWeb.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.diaristaWeb.util.HibernateUtil;

public class DAOGeral<Entidade> {

	private Class<Entidade> classe;

	public void salvar(Entidade entidade) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = sessao.beginTransaction();
		try {
			sessao.save(entidade);
			transaction.commit();
		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
				throw e;
			}
		} finally {
			sessao.close();
		}

	}

	public List<Entidade> listar() {
		List<Entidade> lista = new ArrayList<Entidade>();
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Criteria ct = sessao.createCriteria(classe);

		try {
			lista = ct.list();
			return lista;
		} catch (Exception e) {
			throw e;
		} finally {
			sessao.close();
		}

	}

}
