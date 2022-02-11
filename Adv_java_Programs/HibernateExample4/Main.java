import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();
        Address a1=new Address();
        a1.setPincode(1234);
        a1.setCity("Nagpur");
        a1.setState("Maharashtra");

        Employee obj=new Employee();
        obj.setEmpname("Ram");
        obj.setEmailid("ram@gmail.com");
        obj.setAobj(a1);

        a1.setPincode(5678);// 2nd data in table
        a1.setCity("Pune");
        a1.setState("UP");
        obj.setEmpname("Sita");
        obj.setEmailid("sita1@gmail.com");
        obj.setAobj(a1);



        System.out.println("Employee data saved in database");
        entityManager.persist(obj);

       entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}
