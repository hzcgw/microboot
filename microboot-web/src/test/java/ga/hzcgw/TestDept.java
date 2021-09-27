package ga.hzcgw;

import ga.hzcgw.vo.Dept;

public class TestDept {
    public static void main(String[] args) {
        Dept dept = new Dept();
        dept.setDeptno(10L).setDname("E-Trade Department").setLoc("YMYS");
        System.out.println(dept);
    }
}
