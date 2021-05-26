package project;

public class MainMethod {
    public static void main(String[] args){
        Rasel r=new Rasel();
        r.print();
        Rashed h=new Rashed();
        h.print();
        Dipto d=new Dipto();
        d.print();
        Shanto s=new Shanto();
        s.print();
        FinalResult finalResult=new FinalResult(r.salary, h.salary, d.salary, s.salary);
        System.out.println("Total Salary of Four Person is "+ finalResult.getTotalsalary());
    }
}
