import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        System.out.println("Starting transactions");
        entityManager.getTransaction().begin();

        Vehicle2 vobj=new Vehicle2();
        vobj.setName("Mercedes");
        vobj.setModelno(2987);
        vobj.setPrice(100000);

        Vehicle2 vobj1=new Vehicle2();
        vobj1.setName("Alto");
        vobj1.setModelno(2983);
        vobj1.setPrice(200000);
        System.out.println("Saving Vehicle data in database");

        User2 uobj=new User2();
        uobj.setUname("Rutuja");
        uobj.setEmailid("rutu@gmail.com");
        uobj.getVob1().add(vobj);
        uobj.getVob1().add(vobj1);
        System.out.println("Saving User1 data in database");

        //vehicle2 add user2
        vobj.setUob1(uobj);//vehicle2 add user2 data
        vobj1.setUob1(uobj);

        entityManager.persist(uobj);
        entityManager.persist(vobj);
        entityManager.persist(vobj1);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}


