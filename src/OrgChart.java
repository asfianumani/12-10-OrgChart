// main program to drive org chart
public class OrgChart

{

  public static void main (String[]args)

  {

    Manager first=new Manager("Caeser", "Flickerman", 34, 44.7, 7, "Developement Manager", "Developement");

    Employee pt=new Employee("Peeta", "Mellark", 18, 36.6, 7, "SR Developer");

    Employee lt=new Employee("Katniss", "Everdeen", 18, 28.5, 7, "JR Developer");

    Manager second=new Manager("Heavensbee", "Plutarch", 34, 44.7, 7, "Developement Manager", "Developement");

    Employee pt2=new Employee("Finnick", "Odair", 24, 28.5, 7, "JR Developer");
     
    System.out.println(first);

    System.out.println("\t"+pt);

    System.out.println("\t"+lt);

    System.out.println(second);

    System.out.println("\t"+pt2);  
    
    printInfo(first);
    printInfo(pt);
    printInfo(lt);
    printInfo(second);
    printInfo(pt2);


  }                           

    public static void printInfo(Person p)
    {
      if(p instanceof Manager)
      {
        Manager m=(Manager) p;
        System.out.println("Department:"+m.getDepartment());
        System.out.println();
      }
       if(p instanceof Employee)
       {
        Employee e= (Employee) p;
        System.out.println("Wage:"+e.getWage());
        System.out.println("Hours:"+e.getHours());
        System.out.println("Job Title:"+e.getJobTitle());
        System.out.println();
       }
       
        System.out.println("First Name:"+p.getFirstName());
        System.out.println("Last Name:"+p.getLastName());
        System.out.println("Age:"+p.getAge());
        System.out.println();

  }                             

}

