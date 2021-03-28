package copy;

import org.junit.Before;
import org.junit.Test;

public class Client {
    Employee employee;

    @Before
    public void setUp() {
        employee = new Employee();
        employee.setName("shaoping");
        employee.setAge(20);
        Department department = new Department();
        department.setName("research");
        employee.setDepartment(department);
    }

    @Test
    public void copy() throws CloneNotSupportedException {
        Employee employeeCopy = (Employee) employee.clone();
        System.out.println(employee == employeeCopy);
        System.out.println(employee.getDepartment() == employeeCopy.getDepartment());
    }
}
