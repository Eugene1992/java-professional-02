package com.cbs.edu.serialization.sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableTest {
    public static void main(String[] args) throws Exception {
        ExtEmployee employee = new ExtEmployee("Evgeniy", "Deyneka", 23, 15000);

        //save cat to file
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employee.dat"));
        outputStream.writeObject(employee);
        outputStream.close();

        //load cat from file
        ObjectInputStream objectStream = new ObjectInputStream(new FileInputStream("employee.dat"));
        Object object = objectStream.readObject();
        objectStream.close();

        ExtEmployee desEmployee = (ExtEmployee) object;

        System.out.println(desEmployee);
    }
}
