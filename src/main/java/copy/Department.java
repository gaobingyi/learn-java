package copy;

import lombok.Data;

@Data
public class Department implements Cloneable {
    private String name;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
