class Person 
{
    public void showDetails() 
    {
        System.out.println("In the Person class");
    }
}
class Employee extends Person 
{
    public void showDetails() 
{
        System.out.println("In the Employee class");
    }
}
class Student extends Person 
{
    public void showDetails() 
    {
        System.out.println("In the Student class");
    }
}
class Demo
{
    public static void main(String args[]) 
    {
        Person P = new Person();
        Employee E = new Employee();
        Student S = new Student();
        Person ref;
        ref = P;
	  ref.showDetails(); // calls the  showDetails method of the Person class
        ref = E;
ref.showDetails(); // calls the showDetails method of the Employee class
        ref = S;
        ref.showDetails();// calls the showDetails method of the Student class
    }
}
