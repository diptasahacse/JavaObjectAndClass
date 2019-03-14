
package ObjectClassDefine;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.age = 20;
        teacher1.salary = 10000;
        teacher1.name = "Dipta Saha";
        teacher1.dept = "CSE";
        System.out.println("Teacher1 Name = "+teacher1.name);
        System.out.println("Teacher1 Age = "+teacher1.age);
        System.out.println("Teacher1 Dept = "+teacher1.dept);
        System.out.println("Teacher1 Salary = "+teacher1.salary);
        
        
        Teacher teacher2 = new Teacher();
        teacher2.age = 30;
        teacher2.salary = 110000;
        teacher2.name = "Keya Saha";
        teacher2.dept = "Political Science";
        
        System.out.println("Teacher2 Name = "+teacher2.name);
        System.out.println("Teacher2 Age = "+teacher2.age);
        System.out.println("Teacher2 Dept = "+teacher2.dept);
        System.out.println("Teacher2 Salary = "+teacher2.salary);
        
        
        
        
        
        
        
    }
    
}
