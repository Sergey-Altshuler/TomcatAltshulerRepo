package com.example.util;

import com.example.model.Coach;
import com.example.model.Course;
import com.example.model.ReportCard;
import lombok.Getter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
    @Getter
    private static SessionFactory sessionFactory;

    private SessionUtil() {
        try {
            Configuration configuration = new Configuration().configure();
            configuration.addAnnotatedClass(Coach.class);
            configuration.addAnnotatedClass(Course.class);
            configuration.addAnnotatedClass(ReportCard.class);
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(builder.build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void initialize() {
        if (SessionUtil.getSessionFactory() == null) {
            new SessionUtil();
        }
    }

    public static Session getSession() {
        initialize();
        return sessionFactory.openSession();
    }

    public static void stopSessionFactory() {
        if (sessionFactory != null)
            sessionFactory.close();
    }
}