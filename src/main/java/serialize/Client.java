package serialize;

import lombok.SneakyThrows;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {
    @Test
    @SneakyThrows
    public void serialize() {
        Employee employee = new Employee();
        employee.setName("shaoping");
        employee.setAge(20);
        Department department = new Department();
        department.setName("research");
        Employee.setDepartment(department);

        FileOutputStream fileOut = new FileOutputStream("./src/main/java/serialize/employee.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(employee);
        out.close();
        fileOut.close();
    }

    @Test
    @SneakyThrows
    public void deserialize() {
        FileInputStream fileIn = new FileInputStream("./src/main/java/serialize/employee.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Employee employee = (Employee) in.readObject();
        System.out.println(employee);
        in.close();
        fileIn.close();
    }
}
