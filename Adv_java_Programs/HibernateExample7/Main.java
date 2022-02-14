import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();
//       Address a1=new Address();//office address
//        a1.setPincode(1233);
//        a1.setCity("Hyd");
//        a1.setState("Telangana");
//
//
//        Address a2=new Address();//home address
//        a2.setPincode(5679);
//        a2.setCity("HPanvel");
//        a2.setState("HMaharashtra");
//
//        Emp1 obj=new Emp1();
//        obj.setEmpname("Ram");
//        obj.setEmailid("ram@gmail.com");
//       obj.getAddr1().add(a1);
//       obj.getAddr1().add(a2);
//
//        Emp1 obj1=new Emp1();
//        obj1.setEmpname("Amit");
//        obj1.setEmailid("amit@gmail.com");
//        obj1.getAddr1().add(a1);
//        obj1.getAddr1().add(a2);

        System.out.println("Employee data saved in database");
//       entityManager.persist(obj);
//        entityManager.persist(obj1);
        Emp1 eobj = entityManager.find(Emp1.class, 2L);
        eobj.setEmpname("Lucky");
         //entityManager.merge(eobj);//to update the data

        entityManager.remove(eobj);//to remove the data from table

        entityManager.getTransaction().commit();
        //close the entity manager
        entityManager.close();
        System.out.println(eobj.getAddr1());//to fetch the list of address eager is used in out of the session
        entityManagerFactory.close();

    }
}



