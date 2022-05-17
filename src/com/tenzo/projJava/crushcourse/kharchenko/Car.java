package com.tenzo.projJava.crushcourse.kharchenko;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;

public class Car {
    private int yearOfProduction;
    private float engineCapacity;

    public Car(){}

    public Car(int yearOfProduction, float engineCapacity){
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void findCar(int yearOfProduction, ArrayList<Car> cars){
        ArrayList<Car> buffer = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getYearOfProduction() == yearOfProduction ){
                buffer.add(cars.get(i));
            }
        }
        Collections.sort(buffer, (o1, o2) -> Float.compare(o1.getEngineCapacity(), o2.getEngineCapacity()));
        for (int i = 0; i < buffer.size(); i++) {
            System.out.println("Year: " + buffer.get(i).getYearOfProduction() + " engine capacity: " + buffer.get(i).getEngineCapacity());
        }

    }
}
