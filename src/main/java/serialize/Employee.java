package serialize;

import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable {
    private static final long serialVersionUID = -838677009428347742L;

    private String name;
    private transient int age;
    private static Department department;

    public static void setDepartment(Department department) {
        Employee.department = department;
    }
}
