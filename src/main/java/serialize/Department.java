package serialize;

import lombok.Data;

import java.io.Serializable;

@Data
public class Department implements Serializable {
    private static final long serialVersionUID = -6166100719495222877L;

    private String name;
}
