import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();
        Employee obj=new Employee();
//        obj.setEmpid(6);
//        obj.setEmpname("Ram");
//        obj.setAddress("Nagpur");
//        obj.setEmpdesc("Clerk");
//        obj.setDoj(new Date());
//        obj.setEmpdes("Hello Hibernate");
//
//        obj.setEmpname("Rutuja");
//        obj.setAddress("Pune");
//        obj.setEmpdesc("Manager");
//        obj.setDoj(new Date());
//        obj.setEmpdes("Hello");

        System.out.println("Saving Employee data in database");
        //entityManager.persist(obj);
       // retrieve data from database
        Employee emp = entityManager.find(Employee.class, 2);
        System.out.println(emp.getEmpname()+" "+emp.getEmpdes()+" "+emp.getEmpdesc()+" "+emp.getAddress()+" "+emp.getDoj());
        entityManager.getTransaction().commit();

        //entityManager.remove(obj); //it will remove object
        //close entityManager
        entityManager.close();
        entityManagerFactory.close();


    }
}
