import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();
        Employee obj=new Employee();
        obj.setEmpid(5);
        obj.setEmpname("Rutuja");
        obj.setAddress("Pune");

        System.out.println("Saving Employee data in database");
        entityManager.persist(obj);
        entityManager.getTransaction().commit();
        //close entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}
