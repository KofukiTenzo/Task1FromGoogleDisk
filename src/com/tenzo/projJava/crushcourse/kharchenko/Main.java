package com.tenzo.projJava.crushcourse.kharchenko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Person> persons = new ArrayList<Person>();
//        Collections.addAll(persons, new Person(), new Person(), new Person(), new Person(), new Person());
//        for (int i = 0; i < persons.size(); i++) {
//            persons.get(i).input();
//            persons.get(i).output();
//            persons.get(i).changeName();
//            System.out.println("\n");
//        }

        Task2 task2 = new Task2();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            //1 quest
            System.out.print("Enter number of month: ");
            task2.showDaysInMonth(Integer.parseInt(reader.readLine()));

            //2 quest
            int[] firstFiveNum = new int[5];
            int[] secondFiveNum = new int[5];
            for (int i = 0; i < firstFiveNum.length; i++) {
                System.out.printf("Enter %d num: ", i);
                firstFiveNum[i] = Integer.parseInt(reader.readLine());
            }
            for (int i = 0; i < secondFiveNum.length; i++) {
                System.out.printf("Enter %d num: ", 5 + i);
                secondFiveNum[i] = Integer.parseInt(reader.readLine());
            }
            int sum = task2.sum(firstFiveNum);
            System.out.println("sum of first five num: " + sum);
            int sum2 = task2.sum(secondFiveNum);
            System.out.println("sum of second five num: " + sum2);

            //3 quest
            int[] fiveNums = new int[5];
            for (int i = 0; i < fiveNums.length; i++) {
                System.out.printf("Enter %d num: ", i);
                fiveNums[i] = Integer.parseInt(reader.readLine());
            }
            System.out.println(task2.findSecondPositiveNumAndMinimum(fiveNums));

            //4 quest
            boolean cancel = false;
            ArrayList<Integer> nums = new ArrayList<>();
            System.out.println("Enter nums: ");
            while(!cancel){
                int num = Integer.valueOf(reader.readLine());
                if (num > 0){
                    nums.add(num);
                }else cancel = true;
            }
            task2.productNums(nums);

            //5 quest
            Car car = new Car();
            ArrayList<Car> cars = new ArrayList<Car>();
            Collections.addAll(cars, new Car(2009, 3.0f),
                    new Car(2010, 2.5f),
                    new Car(2010, 2.0f),
                    new Car(2010, 2.3f)
            );
            System.out.print("Enter year of car: ");
            int year = Integer.parseInt(reader.readLine());
            car.findCar(year, cars);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
