package com.example.dao;

import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {
    void save(T t) throws SQLException;

    T get(int id, Class<T> generic) throws SQLException;

    void deleteAll(Class<T> generic);

    void saveAll(List<T> t) throws SQLException;

    List<T> getAll(Class<T> generic) throws SQLException;
}
