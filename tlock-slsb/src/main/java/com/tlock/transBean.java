package com;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.naming.InitialContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Local
@Stateless
//@TransactionManagement(value=TransactionManagementType.BEAN)
public class transBean implements transInt {
	public void tstart()
	{
		System.out.println("Inside SLSB");
		Transaction tx = null;
		//SessionFactory sessionFactory = (SessionFactory) new Configuration().configure().buildSessionFactory();
		//Session session = sessionFactory.openSession();
		try
		{
			emp e=new emp();
			//tx = session.beginTransaction();
					SessionFactory sessionFactory = (SessionFactory) new Configuration().configure().buildSessionFactory();
	
			
			
			
			Session session = sessionFactory.openSession();

			com.testInt t=(com.testInt)new InitialContext().lookup("java:global/tlock-ear-1.0-SNAPSHOT/tlock-web-1.0-SNAPSHOT/testBean");
			t.test();
                        e.setId(1);
		        e.setName("Yogesh");	
			session.save(e);
			//tx.commit();
			System.out.println("Inside SLSB after call to SFSB"); 
			session.close();
			sessionFactory.close();


		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}

