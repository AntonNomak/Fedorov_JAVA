package extend;
/*
Это паттерн- некий обьект который предоставляет доступ к данным
C - creaty(создание)
R - read(чтение)
U - update(обновить)
D - delete(удалить)

 */

public interface CrudRepository<T> {
    void save(T entity);//entity  - (пер.)сущность
    void update(T entity);
    void delete (T entity);
    T find(Long id);
}
