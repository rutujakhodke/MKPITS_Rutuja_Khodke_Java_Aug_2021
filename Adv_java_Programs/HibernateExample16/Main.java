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

        Student1 sobj1=new Student1();
        sobj1.setName("Rutuja");
        sobj1.setAddress("Nagpur");
        sobj1.setCourse("Java");

        Student1 sobj2=new Student1();
        sobj2.setName("Priyanka");
        sobj2.setAddress("Pune");
        sobj2.setCourse("Python");

        Student1 sobj3=new Student1();
        sobj3.setName("Ashi");
        sobj3.setAddress("Mumbai");
        sobj3.setCourse("HTML");

        Student1 sobj4=new Student1();
        sobj4.setName("Nidhi");
        sobj4.setAddress("Amravati");
        sobj4.setCourse("React Js");

        sobj4.setName("Prachi");
        sobj4.setAddress("Hyd");
        sobj4.setCourse("Hadoop");

        sobj4.setName("Harshit");
        sobj4.setAddress("Chennai");
        sobj4.setCourse("Data science");

        //to view list of record
        Query query = (Query) entityManager.createQuery("from Student1");//from classname
        query.setFirstResult(2);//we want to display any record list the no. provided in the method.It will display the list on the basis of no. provided ,after that no,the all list will display
        query.setMaxResults(3);//how many records are display are done by setMaxResults() method
       List<Student1> lobj=query.list();
        for (Student1 s1:lobj) {
            System.out.println(s1.getName()); //it will print the list of object data present in database
        }
        System.out.println(lobj.size());

//        entityManager.persist(sobj1);
//        entityManager.persist(sobj2);
//        entityManager.persist(sobj3);
//        entityManager.persist(sobj4);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}






