// class to represent an emplayee - inherits Person
public class Employee extends Person
{
  private double hourlyWage;
  private int hoursWorked;
  private String jobTitle;
  private Manager manager;
  public Employee(String first, String last, int age, double wage, int hours, String job)
  {
    super(first, last, age);
    hourlyWage=wage;
    hoursWorked=hours;
    jobTitle=job;
  }
  public double getWage()
  {
    return hourlyWage;
  }
  public int getHours()
  {
    return hoursWorked;
  }
  public double getWeeklySalary()
  {
    double x=hourlyWage*hoursWorked;
    return x;
  }
  public double getYearlySalary()
  {
    double x=hourlyWage*hoursWorked*52;
    return x;
  }
  public String getJobTitle()
  {
    return jobTitle;
  }
  public String toString()
  {
    return super.toString()+" :"+jobTitle+"@ "+getYearlySalary();
  }
  public void setWage(double newWage)
  {
    hourlyWage=newWage;
  }
  public void setHours(int h)
  {
    hoursWorked=h;
  }
  public void setJobTitle(String title)
  {
    jobTitle=title;
  }
  public void giveRaise()
  {
    hourlyWage++;
  }
  public void setManager(Manager newManager)
  {
    manager=newManager;
  }
   public boolean equals(Object obj)
  {
    if(obj instanceof Employee)
    {
      Employee other= (Employee) obj;
      return hourlyWage==other.hourlyWage && hoursWorked==other.hoursWorked && jobTitle==other.jobTitle && manager==other.manager;
    }
    else
    {
      return false;
    }
  }
}
  
  
  
