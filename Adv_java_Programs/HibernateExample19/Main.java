import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

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
        Session session = entityManager.unwrap(Session.class);//to get back session object
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Student4.class);
        criteria.add(Restrictions.eq("name","Nidhi"))
                .add(Restrictions.gt("id",2));
        List<Student4> list = criteria.list();
        for (Student4 s1:list){
            System.out.println(s1.getName());
        }
        transaction.commit();
        session.close();
        entityManager.close();
        entityManagerFactory.close();

    }
}









