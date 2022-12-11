import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
public static int keyCounter;// 2. переменная счетчик


        private int id = keyCounter;// 3.
        private String fullName;

        private int department;
        private int salary;


        Employee(String fullName, int department, int salary){
            this.fullName = fullName;
            this.department = department;
            this.salary = salary;
            keyCounter++;// инкремент счетчика
        }
    public int getId() {
        return id;
    }
    public String getName() {
        return fullName;
    }
    public int getDepartment() {
            return department;
    }
    public int getSalary() {
            return salary;
    }



        void setDepartmentSalary ( int dep, int sal){// 5.сет отдел и ЗП
            department = dep;
            salary = sal;
        }



    public String getEmployeeStr() {// гет всех полей Стринг
            String total = id+" "+fullName+" "+department+" "+ salary+" ";
            return total;
    }


    public void salaryIndexing(int a) {
            salary+=salary*a/100;
        System.out.println(salary);
    }






}

