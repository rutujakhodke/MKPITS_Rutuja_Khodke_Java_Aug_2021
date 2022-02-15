import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        System.out.println("Starting transactions");
        entityManager.getTransaction().begin();

        Vehicle vobj=new Vehicle();
        vobj.setName("Mercedes");
        vobj.setModelno(2987);
        vobj.setPrice(100000);
        System.out.println("Saving Vehicle data in database");

        User1 uobj=new User1();
        uobj.setUname("Rutuja");
        uobj.setEmailid("rutu@gmail.com");
        uobj.setVob1(vobj);
        System.out.println("Saving User1 data in database");



        entityManager.persist(uobj);
        entityManager.persist(vobj);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}
