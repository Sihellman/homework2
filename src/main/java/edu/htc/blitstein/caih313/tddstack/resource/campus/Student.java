package edu.htc.blitstein.caih313.tddstack.resource.campus;

import edu.htc.blitstein.caih313.tddstack.IStackable;

public class Student implements IStackable {
    public String name;
    public Student(String name){
        this.name = name;
    }
    public Student(){
        name = "it";
    }
}
