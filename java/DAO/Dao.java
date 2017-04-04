package DAO;

import java.util.List;

public interface Dao<T> {
    
    Integer create(T entity);
    
    T read(Integer id);
    
    List<T> readAll();
    
    void update(T entity);
    
    void delite(T entity);
}
