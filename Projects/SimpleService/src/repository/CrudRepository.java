/*
Создание интерфейса для выполнения основных операций с репозиториями а именно
1.CREATE
2.READ
3.UPDATE
4.DELETE
 */

package repository;

public interface CrudRepository<T> {
    void save(T model);//метод для записи объекта(не важно какого и не важно куда - в других интерфейсах будет свое
    //определение данного метода
    T find(int id);
}
