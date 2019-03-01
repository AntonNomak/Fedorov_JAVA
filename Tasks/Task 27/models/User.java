package models;
/*
Создаем (модель)класс - в данном случае это User,пишем какие поля должен иметь данный обьект,методы лишь геттеры
и сеттеры.Так же создали конструктор для класса где задали ему обязательное заполнение необходимых полей.
 */
public class User {
    private int id;
    private String firstName;
    private String lastName;
   // private String login;
   // private String password;

    public User(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
       // this.login = login;
        //this.password = password;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    //public String getLogin(){
       // return login;
  //  }
   // public String getPassword(){
    //    return password;
   // }
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString(){
    return "User{ "+
            "id = "+id+
            " firstName = " + firstName +
            " lastName = " + lastName ;
           // " login = " + login +
          //  " password = "+ password+" }";
    }
}

