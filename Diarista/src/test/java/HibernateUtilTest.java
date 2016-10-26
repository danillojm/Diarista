import org.hibernate.Session;

import br.com.diaristaAppWeb.util.HibernateUtil;

public class HibernateUtilTest {

	public static void main(String[] args) {
	
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.close();
		
		HibernateUtil.getSessionFactory().close();
		
	}
	
	
}
