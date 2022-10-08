package course;

public class Employee { //класс сотрудника
    private static int counter = 0;
    private final String name; //фио
    private int department; //отдел
    private int salary; //зарплата
    private final int id;

    public Employee (String name, int department, int salary) { //конструктор с параметрами
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getDepartment() {
        return this.department;
    }
    public int getSalary() {
        return this.salary;
    }
    //сетеры
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    //то стринг
    public String toString() {
         return "id "+ this.id+" фио "+this.name+". отдел:"+this.department+". зарплата: "+this.salary+ " рублей";
    }

}
