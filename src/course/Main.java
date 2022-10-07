package course;

public class Main {

    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Петров Петр Петрович ", 1, 600_006);
        employees[1] = new Employee("Михайлов Михаил Михалыч ", 1, 100_500);
        employees[2] = new Employee("Сверистелов Сверистел Сверистелович ", 2, 123_321);
        employees[4] = new Employee("Адский Сатана Подземыч ", 3, 666_666);
        employees[5] = new Employee("Райский Иоан Отецыч ", 3, 333_333);
        employees[6] = new Employee("Неможенко Алескандр Александрович ", 1, 222_222);
        employees[7] = new Employee("Иоан Васильевич Грозный ", 2, 100);
        employees[9] = new Employee("Семенов Павел Семеныч ", 2, 302_102);
        employees[3] = new Employee("Семенов Аркадий Павлович ", 2, 201_102);
        employees[8] = new Employee("Семенов Акакий Адкадьевич ", 2, 104_104);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
//        for (int i = 0; i < employees.length; i++) {  //альтернатива форичу для себя
//            Employee employee = employees[i];
//            System.out.println(employee);
//        }
        System.out.println("количество созданых сотрудников = " + Employee.counter);
        System.out.println("сумма затрат на зарплаты в месяц = " +totalSalary());
        System.out.println("среднее значение зарплат в месяц = " +midSalary());
        System.out.println("сотрудник с минимальной зарплатой = " +minSalary());
        System.out.println("сотрудник с максимальной зарплатой = " + maxSalary());
        System.out.println(allEmployees());
    }

    private static String totalSalary() {
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            if (null == employees[i]) {
                continue;
            }
            total = total + employees[i].getSalary();
        }
        return " " + total;
    }
    private static String midSalary() {
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            if (null == employees[i]) {
                continue;
            }
        total += employees[i].getSalary();
        }
        return " " + total / employees.length;
    }

    public static Employee minSalary() {
        Employee savedEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            Employee currentEmployee = employees[i];
            if (null == currentEmployee) {
                continue;
            }
            if (null == savedEmployee) {
                savedEmployee = currentEmployee;
                continue;
            }
            if (currentEmployee.getSalary() < savedEmployee.getSalary()) {
                savedEmployee = currentEmployee;
            }
        }
        return savedEmployee;
    }

    public static Employee maxSalary() {
        Employee savedEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            Employee currentEmployee = employees[i];
            if (null == currentEmployee) {
                continue;
            }
            if (null == savedEmployee) {
                savedEmployee = currentEmployee;
                continue;
            }
            if (currentEmployee.getSalary() > savedEmployee.getSalary()) {
                savedEmployee = currentEmployee;
            }
        }
        return savedEmployee;
    }

    public static String allEmployees() {
        System.out.println("Ф. И. О. всех сотрудников : ");
        String savedEmployee = employees[0].getName();
        for (int i = 0; i < employees.length; i++) {
            if (null == employees[i]) {
                continue;
            }
            if (savedEmployee == employees[i].getName()) {
                continue;
            }
            savedEmployee += "\n"+ employees[i].getName();
        }
        return savedEmployee;
    }


}
