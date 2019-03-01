package models;

public class Car {
    private int id;
    private String model;
    private String number;
    private int idOwner;

    public Car(String model,String number,int idOwner){
        this.model = model;
        this.number = number;
        this.idOwner = idOwner;
    }

    public int getId(){
        return id;
    }
    public String getModel(){
        return  model;
    }
    public String getNumber(){
        return number;
    }
    public int getIdOwner(){
        return idOwner;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public String toString(){
        return "id = " + id + " Model = " + model + " number = "+ number;
        // " login = " + login +
        //  " password = "+ password+" }";
    }
}
