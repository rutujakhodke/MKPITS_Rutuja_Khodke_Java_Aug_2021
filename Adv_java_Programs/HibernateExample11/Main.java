import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        System.out.println("Starting transactions");
        entityManager.getTransaction().begin();

        Vehicle3 vobj=new Vehicle3();
        vobj.setName("Mercedes");
        vobj.setModelno(2987);
        vobj.setPrice(100000);

        Vehicle3 vobj1=new Vehicle3();
        vobj1.setName("Alto");
        vobj1.setModelno(2983);
        vobj1.setPrice(200000);


        User3 uobj=new User3();
        uobj.setUname("Rutuja");
        uobj.setEmailid("rutu@gmail.com");


        User3 uobj1=new User3();
        uobj1.setUname("Nidhi");
        uobj1.setEmailid("nidhi@gmail.com");

        //User3 add Vehicle3
        uobj.getVob1().add(vobj);//list of vehicles add in user
        uobj.getVob1().add(vobj1);

        //vehicle2 add user2
        vobj.getUob1().add(uobj);//list of user add in vehicles
        vobj.getUob1().add(uobj1);

        entityManager.persist(uobj);
        entityManager.persist(uobj1);
        entityManager.persist(vobj);
        entityManager.persist(vobj1);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}



