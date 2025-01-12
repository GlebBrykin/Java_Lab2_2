public class Worker extends Employee
{
    public Worker(String name, double salary)
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
        return String.format("Worker %s with salary of %.2f", this.name, this.salary);
    }
}