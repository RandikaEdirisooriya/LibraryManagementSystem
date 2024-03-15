package lk.ijse.Config;


import lk.ijse.Entity.Book;
import lk.ijse.Entity.Borrow;
import lk.ijse.Entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() {
        Configuration configuration =
                new Configuration().configure()
                        .addAnnotatedClass(Book.class).addAnnotatedClass(User.class).addAnnotatedClass(Borrow.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance() {
        return (factoryConfiguration == null) ?
                factoryConfiguration =
                        new FactoryConfiguration() : factoryConfiguration;
    }

    public Session getSession() {

        return sessionFactory.openSession();
    }
}
