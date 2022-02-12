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
        a1.setCity("Hyd");
        a1.setState("Telangana");


        Address a2=new Address();
        a2.setPincode(5679);
        a2.setCity("HPanvel");
        a2.setState("HMaharashtra");

        Emp1 obj=new Emp1();
        obj.setEmpname("Ram");
        obj.setEmailid("ram@gmail.com");
        obj.setOffice_addr(a1);//this will store office address
        obj.setHome_addr(a2);//this will store home address

        System.out.println("Employee data saved in database");
        entityManager.persist(obj);


        entityManager.getTransaction().commit();
        //close the entity manager
        entityManager.close();
        entityManagerFactory.close();

    }
}


