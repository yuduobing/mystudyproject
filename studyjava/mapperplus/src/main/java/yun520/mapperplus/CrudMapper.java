package yun520.mapperplus;

public interface CrudMapper<T,PK>{
    int insert(T entity);

    int updateById(T entity);

    int deleteById(PK id);

    T findById(PK id);
}
