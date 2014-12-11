// Super Class to represent a person
public class Person
{
  private String firstname;
  private String lastname;
  private int age;
  public Person()
  {
    firstname="";
    lastname="";
    age=0;
  }
  public Person(String one, String two, int x)
  {
    firstname=one;
    lastname=two;
    age=x;
  }
  public String getFirstName()
  {
    return firstname;
  }
  public String getLastName()
  {
    return lastname;
  }
  public int getAge()
  {
    return age;
  }
  public String toString()
  {
    return lastname+", "+firstname;
  }
  public void recordBirthday()
  {
    age++;
  }
}
