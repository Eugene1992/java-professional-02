package com.cbs.edu.serialization.sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialazibleTest {
    public static void main(String[] args) throws Exception {
        Employee employee = new Employee("Evgeniy", "Deyneka", 23, 15000);

        //save cat to file
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employee.dat"));
        outputStream.writeObject(employee);
        outputStream.close();

        //load cat from file
        ObjectInputStream objectStream = new ObjectInputStream(new FileInputStream("employee.dat"));
        Object object = objectStream.readObject();
        objectStream.close();

        Employee desEmployee = (Employee) object;

        System.out.println(desEmployee);
    }
}
