

public class Employee {
    String name;
    String surname;
    String middle_name;
    String position;
    String email;
    int phone;
    int salary;
    int age;

    public Employee(String _name, String _surname, String _middle_name, String _position, String _email, int _phone, int _salary, int _age){
        this.name = _name;
        this.surname = _surname;
        this.middle_name = _middle_name;
        this.position = _position;
        this.email = _email;
        this.phone = _phone;
        this.salary = _salary;
        this.age = _age;
    }


    void employeeInfo() {
        System.out.println("Employee Name: " + name + "; Middle name: " + middle_name + "; Surname: " + surname + "; Position: " + position + "; E-mail: " + email + "; Phone number: " + phone + "; Salary: " + salary + "; Age: " + age);
    }

    public int getAge(){
        return age;
    }
    @Override
    public String toString() {
        return (name + "\n-"
                + position + "\n-"
                + email + "\n-"
                + phone + "\n-"
                + salary + "\n-"
                + age);
    }

}
