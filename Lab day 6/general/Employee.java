package general;

public class Employee {
    protected int emp_id;
    private String ename;
    double hra;
    double da;
    public double earning(double sal) {
        da = sal * 0.8;
        hra = sal * 0.15;
        return (sal + da + hra);
    }
}


