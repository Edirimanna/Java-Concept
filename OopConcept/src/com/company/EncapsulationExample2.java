package com.company;

public class EncapsulationExample2 {
    public static void main(String[] args) {
        Student obj = new Student();

        obj.setStdName("Madhusanka");
        obj.setstdAge(24);
        obj.setId(52);

        System.out.println("Student's Name: " +obj.getStdName());
        System.out.println("Student's Age.: " +obj.getstdAge());
        System.out.println("Student's Id: " +obj.getStdId());
    }
}
class Student {
    //Declare the variables private
    private String stdName;
    private int stdAge;
    private int stdId;

    public String getStdName()
    {
        return stdName;
    }
    public int getstdAge()
    {
        return stdAge;
    }
    public int getStdId()
    {
        return stdId;
    }

    public void setStdName(String name)
    {
        stdName = name;
    }
    public void setstdAge(int age)
    {
        stdAge = age;
    }
    public void setId(int id)
    {
        stdId = id;
    }
}