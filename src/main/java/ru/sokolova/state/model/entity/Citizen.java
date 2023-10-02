package ru.sokolova.state.model.entity;

public class Citizen {
    private int id;
    private String name;
    private String surname;
    private int age;
    private State state;
    public Citizen(int id, String name, String surname, int age, State state) {
        this.id = id;
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.state=state;
    public int getId(){
        return this.id;
        }
    public void setId(int id){
        this.id=id;
        }
    public String getName(){
        return this.name;
        }
    }
}

