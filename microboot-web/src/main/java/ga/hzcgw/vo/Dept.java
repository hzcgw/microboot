package ga.hzcgw.vo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Dept {
    private long deptno;
    private String dname;
    private String loc;
}
