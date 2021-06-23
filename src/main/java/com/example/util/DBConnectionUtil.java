package com.example.util;

import com.example.supply.GeneratorForDB;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class DBConnectionUtil {
    private static final EntityManager entityManager = HibernateUtil.getEntityManager();

    private static void saveList(List<?> saved) {
        entityManager.getTransaction().begin();
        for (Object obj : saved) {
            entityManager.persist(obj);
        }
        entityManager.getTransaction().commit();
    }

    public static void saveAll() {
        saveList(GeneratorForDB.getCoachList());
        saveList(GeneratorForDB.getStudentList());
        saveList(GeneratorForDB.getTaskList());
    }

    public static List<?> getList(Class<?> clazz) {
        String annotationName = clazz.getAnnotation(Entity.class).name();
        Query query = entityManager.createQuery("from " + annotationName);
        return query.getResultList();
    }
}
