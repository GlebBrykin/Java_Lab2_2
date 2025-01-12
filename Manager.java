public class Manager extends Employee
{
    public Manager(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculateSalary()
    {
        return this.salary;
    }

    @Override
    public String toString()
    {
        return String.format("Manager %s with salary of %.2f", this.name, this.salary);
    }
}