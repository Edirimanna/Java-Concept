package com.company;

public class EncapsulationExample {
    public static void main(String args[]){
        AnimalCount obj = new AnimalCount ();
        obj.setNoOfAnimal(100);
        System.out.println("No Of Animal: "+obj.getNoOfAnimal());
    }
}
class AnimalCount {
    private int numOfAnimal = 0;

    public void setNoOfAnimal(int animaCount) {
        numOfAnimal = animaCount;
    }
    public double getNoOfAnimal() {
        return numOfAnimal;
    }
}
