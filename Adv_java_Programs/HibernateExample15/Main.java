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

        Student sobj1=new Student();
        sobj1.setId(1);
        sobj1.setName("Rutuja");
        sobj1.setAddress("Nagpur");
        sobj1.setCourse("Java");

        Student sobj2=new Student();
        sobj2.setId(3);
        sobj2.setName("Priyanka");
        sobj2.setAddress("Pune");
        sobj2.setCourse("Python");

        Student sobj3=new Student();
        sobj3.setId(5);
        sobj3.setName("Ashi");
        sobj3.setAddress("Mumbai");
        sobj3.setCourse("HTML");

        Student sobj4=new Student();
        sobj4.setId(6);
        sobj4.setName("Nidhi");
        sobj4.setAddress("Amravati");
        sobj4.setCourse("React Js");


        //to view list of record
        //Query query = (Query) entityManager.createQuery("from Student");//from classname
        //List lobj = query.list();
        //System.out.println(lobj.size());//it will show the list of object present in  database table

        //to view all record
        //List <Student> lobj= query.list();
//        for (Student s1:lobj) {
//            System.out.println(s1.getName()+" "+s1.getCourse()); //it will print the list of object data present in database
//        }

//        Student s1=(Student) query.uniqueResult();

        //to view specific record

        //Query query1=(Query) entityManager.createQuery("from Student where id=3") ;
       // List<Student> list=query1.list();
//        List lobj1 = query1.list();
//        System.out.println(lobj1.size());


                              //OR
//
//       Query query1=(Query) entityManager.createQuery("from Student where id= :Id") ;
//        query1.setInteger("Id" ,3);

//        List lobj1 = query1.list(); //to show the l
//        System.out.println(lobj1.size());

        //to update data
//        Query query2 = (Query) entityManager.createQuery("update Student set course= :Course where id= :Id");
//        query2.setParameter("Course","Hadoop");
//        query2.setInteger("Id",5);
//        int result=query2.executeUpdate();
//        System.out.println(result);//it will print how many data are updated in table

        //to delete data
        Query query3 = (Query) entityManager.createQuery("delete from Student where id= :Id");
        query3.setInteger("Id" ,6);
        int result=query3.executeUpdate();
        

//        entityManager.persist(sobj1);
//        entityManager.persist(sobj2);
//        entityManager.persist(sobj3);
//        entityManager.persist(sobj4);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}





