package kz.lab.module1.advanced;

import java.util.Objects;

public class Student {

    private int id;
    private String name;
    private String phone;

    public Student(int id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof Student student)) return false;
        return id== student.id && Objects.equals(name, student.name)&&Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name, phone);
    }

    @Override
    public String toString(){
        return "Student[id" + id + ", name="+name+", phone"+phone + "]";
    }
}
