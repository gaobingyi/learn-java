package copy;

import lombok.Data;

@Data
public class Employee implements Cloneable {
    private String name;
    private int age;
    /**
     * 引用类型属性
     */
    private Department department;

    /**
     * 浅拷贝
     */
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    /**
     * 深拷贝
     */
    public Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        department = (Department) department.clone();
        return object;
    }
}
