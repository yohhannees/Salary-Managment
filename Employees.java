
import java.io.Serializable;

public class Employees implements Serializable {
    int id;
    String name;
    int age;
    int salary;
    public Employees(int emp_id, String emp_name, int emp_age, int emp_salary){
        this.id = emp_id;
        this.name = emp_name;
        this.age = emp_age;
        this.salary = emp_salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", Name=" + name + ", Age=" + age + ", Salary=" + salary + "]";
    }   
}
