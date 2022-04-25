package application;

import Entites.Emplyoee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluguel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees will be registered? ");
        int x = sc.nextInt();
        List<Emplyoee> emplyoees = new ArrayList<>();


        for (int i=1; i<=x;i++) {
            System.out.println("Emplyoee#" + i + ":");
            System.out.printf("ID: ");
            int newid = sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();
            Emplyoee emp = new Emplyoee(newid,name,salary);
            emplyoees.add(emp);

        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int increaseID = sc.nextInt();
        Integer pos = position(emplyoees,increaseID);
        while(pos == null){
            System.out.println("This id does not exist!");

        }
        if (pos != null){
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emplyoees.get(pos).increaseSalary(percentage);
        }

        System.out.println("List of emplyoees");
        for (Object list: emplyoees) {
            System.out.println(list);
        }

        sc.close();
        }
        public static Integer position(List<Emplyoee> list, int id){
            for (int i = 0; i<list.size();i++){
                if (list.get(i).getId() == id){
                    return i;
                }
            }
            return null;
        }
    }

