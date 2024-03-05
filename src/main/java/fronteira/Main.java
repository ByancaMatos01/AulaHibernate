package fronteira;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidade.Filme;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Filme f1= new Filme();
		f1.setNome("x-man");
		f1.setNomeDiretor("Lucas George");
		
		
		EntityManagerFactory mf= Persistence.createEntityManagerFactory("HibJPA");
		EntityManager em= mf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(f1);
		em.getTransaction().commit();
	}

}
