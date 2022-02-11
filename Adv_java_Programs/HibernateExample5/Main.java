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
        a1.setPincode(1233);
        a1.setCity("Hyd1");
        a1.setState("Telangana1");

        Employee obj=new Employee();
        obj.setEmpname("Ram1");
        obj.setEmailid("ram1@gmail.com");
        obj.setAobj(a1);



        Address a2=new Address();
        a2.setPincode(5679);
        a2.setCity("Panvel1");
        a2.setState("MH5");
        Employee obj1=new Employee();
        obj1.setEmpname("Raj");
        obj1.setEmailid("raj1@gmail.com");
        obj1.setAobj(a2);

        Address a3=new Address();
        a3.setPincode(8763);
        a3.setCity("Nashik1");
        a3.setState("MH31");
        Employee obj2=new Employee();
        obj2.setEmpname("Rajesh");
        obj2.setEmailid("rajesh@gmail.com");
        obj2.setAobj(a3);

        Address a4=new Address();
        a4.setPincode(4478);
        a4.setCity("Nagpur");
        a4.setState("MH4");
        Employee obj3=new Employee();
        obj3.setEmpname("Suyash");
        obj3.setEmailid("suyash1@gmail.com");
        obj3.setAobj(a4);

        System.out.println("Employee data saved in database");
        entityManager.persist(obj);
        entityManager.persist(obj1);
        entityManager.persist(obj2);
        entityManager.persist(obj3);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}

