public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sheldon", "Cooper","Lee", "theoretical physicist", "sheldon@bazinga.biz", 123456, 10000, 32);


        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Sheldon", "Cooper","Lee", "theoretical physicist", "sheldon@bazinga.biz", 123456, 10000, 32);
        persArray[1] = new Employee("Leonard", "Hofstadter","Leakey", "physicist experimenter", "leonard@bazinga.biz", 123456, 10000, 43);
        persArray[2] = new Employee("Howard", "Wolowitz","Joel", "engineer", "howard@bazinga.biz", 123456, 10000, 36);
        persArray[3] = new Employee("Rajesh", "Koothrappali","Ramayan", "astrophysicist", "raj@bazinga.biz", 123456, 10000, 39);
        persArray[4] = new Employee("Amy", "Fowler","Farrah", "astrophysicist", "amy@bazinga.biz", 123456, 10000, 41);

        //for (int i = 0; i < persArray.length; i++){
        for (Employee employee : persArray){
            if(employee.getAge() > 40){
                System.out.println(employee);
            }
        }

    }
}
