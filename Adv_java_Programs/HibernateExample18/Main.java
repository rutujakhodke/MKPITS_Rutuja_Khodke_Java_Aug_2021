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

        Student3 sobj1=new Student3();
        sobj1.setName("Rutuja");
        sobj1.setAddress("Nagpur");
        sobj1.setCourse("Java");

        Student3 sobj2=new Student3();
        sobj2.setName("Priyanka");
        sobj2.setAddress("Pune");
        sobj2.setCourse("Python");

        Student3 sobj3=new Student3();
        sobj3.setName("Ashi");
        sobj3.setAddress("Mumbai");
        sobj3.setCourse("HTML");

        Student3 sobj4=new Student3();
        sobj4.setName("Nidhi");
        sobj4.setAddress("Amravati");
        sobj4.setCourse("React Js");

        sobj4.setName("Prachi");
        sobj4.setAddress("Hyd");
        sobj4.setCourse("Hadoop");

        sobj4.setName("Harshit");
        sobj4.setAddress("Chennai");
        sobj4.setCourse("Data science");

        String sid="3";//SQL Injection
//
//        Query query2 = (Query) entityManager.createNamedQuery("sbyid");
//        query2.setInteger("Id" ,Integer.parseInt(sid));
//        List<Student3> lobj2=query2.list();
//        for (Student3 s3:lobj2) {
//            System.out.println(s3.getName()); //it will print the list of object data present in database
//        }
//        System.out.println(lobj2.size());


        Query query3 = (Query) entityManager.createNamedQuery("sbyname");

        List<Student3> lobj3=query3.list();
        for (Student3 s4:lobj3) {
            System.out.println(s4.getName()+" "+s4.getCourse()); //it will print the list of object data present in database
        }
        System.out.println(lobj3.size());


//        entityManager.persist(sobj1);
//        entityManager.persist(sobj2);
//        entityManager.persist(sobj3);
//        entityManager.persist(sobj4);
//          entityManager.persist(sobj4);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}








