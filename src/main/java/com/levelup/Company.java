package com.levelup;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Company {
    List<Employee> employees = new ArrayList<>(5);
    List<String> list = new ArrayList<>();
    String path = "C:\\Users\\Admin\\Desktop\\FileStream\\resourses\\employees1.txt";

    public boolean readEmployeesFromFile(String path) {
        try (FileReader reader = new FileReader(path)) {
           /* int c,counter=0;
            String tempId, tempName,tempSername, tempAge;
            while ((c = reader.read()) != -1) {
                counter++;
                System.out.print((char) c);
                if (c == '"') {

                }
            }*/

            Path filePath = Paths.get(path);
            Scanner in = new Scanner(filePath);
            while (in.hasNextLine()) {
                list.add(in.nextLine());
                System.out.println(in.nextLine());
            }
            String[] array = list.toArray(new String[0]);
            //System.out.println(array);
            return true;
        } catch (IOException ex) {
            //System.out.println(ex.getMessage());
            System.out.println("Error!");
            return false;
        }
    }


   /* @Override
    public String toString(){
        return "Name=" + this.name + "::Age=" + this.age + "::Gender=" + this.gender;
    }*/

    public void AddEmployeesToFile() {
        Employee first = new Employee(0, 10, "Ivan", "Ivanov");
        employees.add(first);
        Employee second = new Employee(1, 20, "Petr", "Petrov");
        employees.add(second);
        Employee third = new Employee(2, 30, "Alex", "Alexov");
        employees.add(third);
        Employee fourth = new Employee(3, 40, "Max", "Maxov");
        employees.add(fourth);
        Employee fifth = new Employee(4, 50, "Artem", "Artemov");
        employees.add(fifth);
    }

    public boolean saveEmployeesInFile(String path) {
        AddEmployeesToFile();
        try (FileWriter writer = new FileWriter(path, false)) {
            writer.write("{" + "\r\n");
            writer.write("  [" + "\r\n");
            for (int i = 0; i < employees.size(); i++) {
                if (i == employees.size() - 1) {
                    writer.write("      {" + "\r\n");
                    writer.write("      \"id\"" + ":" + "\"" + employees.get(i).getId() + "\"" + "," + "\r\n");
                    writer.write("      \"name\"" + ":" + "\"" + employees.get(i).getName() + "\"" + "," + "\r\n");
                    writer.write("      \"sername\"" + ":" + "\"" + employees.get(i).getSername() + "\"" + "," + "\r\n");
                    writer.write("      \"age\"" + ":" + employees.get(i).getAge() + "\r\n");
                    writer.write("      }" + "\r\n");
                } else {
                    writer.write("      {" + "\r\n");
                    writer.write("      \"id\"" + ":" + "\"" + employees.get(i).getId() + "\"" + "," + "\r\n");
                    writer.write("      \"name\"" + ":" + "\"" + employees.get(i).getName() + "\"" + "," + "\r\n");
                    writer.write("      \"sername\"" + ":" + "\"" + employees.get(i).getSername() + "\"" + "," + "\r\n");
                    writer.write("      \"age\"" + ":" + employees.get(i).getAge() + "\r\n");
                    writer.write("      }," + "\r\n");
                }
            }
            writer.write("     ]" + "\r\n");
            writer.write("}" + "\r\n");
            writer.flush();
            return true;
        } catch (IOException ex) {
            //System.out.println(ex.getMessage());
            System.out.println("Error!");
            return false;
        }
    }
}
