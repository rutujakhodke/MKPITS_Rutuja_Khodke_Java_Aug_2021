import org.hibernate.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.awt.geom.QuadCurve2D;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        System.out.println("Starting transactions");
        entityManager.getTransaction().begin();

        Student sobj1=new Student();//transient object (when object is initialized and it is not saved)
        sobj1.setName("Rutuja");
        sobj1.setAddress("Nagpur");
        sobj1.setCourse("Java");

        Student sobj2=new Student();
        sobj2.setName("Priyanka");
        sobj2.setAddress("Pune");
        sobj2.setCourse("Python");

        Student sobj3=new Student();
        sobj3.setName("Ashi");
        sobj3.setAddress("Mumbai");
        sobj3.setCourse("HTML");

        Student sobj4=new Student();
        sobj4.setName("Nidhi");
        sobj4.setAddress("Amravati");
        sobj4.setCourse("React Js");

        entityManager.persist(sobj1);//Persistence object (when object is saved and it is attached with session)
        entityManager.persist(sobj2);
        entityManager.persist(sobj3);
        sobj3.setAddress("Nashik");//Persistence object is trackable , we have to update the data after object is saved,it will update the data

        entityManager.persist(sobj4);

        entityManager.getTransaction().commit();
        entityManager.close();
        //sobj3.setAddress("Nashik");//detached object .it is declared outside the session close.

        entityManagerFactory.close();

    }
}






