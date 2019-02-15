package repositories;
//CREATE(Создание), READ(Чтение), UPDATE(Добавление),DELETE(Удаление)
public interface CrudRepository <T>{
    void save(T model);//Интерфейс в котором реализован метод save,который работает с типом Т(неизвестный тип) и для
    //работы создает переменную model;
}
