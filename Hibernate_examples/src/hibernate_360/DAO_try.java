package hibernate_360;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;

public class DAO_try {

    SessionFactory factory = null;
    Session session = null;

    private static DAO_try instance_one = null;

    private DAO_try(){
        factory = Hibernate_tools.getSessionFactory();
    }

    /**
     * This reuses the instance of DAO_try that we have already created.
     */
    public static DAO_try getInstance(){
        if (instance_one == null){
            instance_one = new DAO_try();
        }
        return instance_one;
    }

    public List<Student> getStudent() {
        try {
            session = factory.openSession();

            session.getTransaction().begin();

            String toSQL = "from hibernate_360.Student";

            List<Student> studentSess = (List<Student>) session.createQuery(toSQL).getResultList();
            session.getTransaction().commit();

            return studentSess;
        }

        catch (Exception ex) {
            ex.printStackTrace();

            session.getTransaction().rollback();
            return null;
        }

        finally{
            session.close();
        }
    }
}