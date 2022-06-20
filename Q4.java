import java.util.*;
class Employee{
    long ID;
    String name,department;
    int sal;
    void setDetails(long ID,String name,String department,int sal){
        this.ID=ID;
        this.name=name;
        this.department=department;
        this.sal=sal;
    }
    void getDetails(){
        System.out.println("ID : "+ID );
        System.out.println("Name : "+name);
        System.out.println("Department : "+department);
        System.out.println("Salary : "+sal);        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Employee e1=new Employee();
        long id;
        String name,department;
        int sal;
        id=sc.nextLong();
        sc.nextLine();
        name=sc.nextLine();
        department=sc.nextLine();
        sal=sc.nextInt();
        e1.setDetails(id,name,department,sal);
        e1.getDetails();
    }
}