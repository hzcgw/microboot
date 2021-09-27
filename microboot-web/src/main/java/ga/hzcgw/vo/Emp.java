package ga.hzcgw.vo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(prefix = "cgw")
public class Emp {
    private long empno;
    private String ename;
    private Double salary;
}
