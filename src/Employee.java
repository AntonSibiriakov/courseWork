import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
public static int keyCounter;// переменная счетчик


        private int id = keyCounter;
        private String fullName;

        private int department;
        private int salary;


        Employee(String fullName, int department, int salary){
            this.fullName = fullName;
            this.department = department;
            this.salary = salary;
            keyCounter++;// инкремент счетчика
        }

        // получение значений всех полей
        public void getEmployee () {
            System.out.println(id + "  " + fullName + " " + department + " " + salary + " ");
        }


        // устанавливать отдел и ЗП
        void setDepartmentSalary ( int dep, int sal){
            department = dep;
            salary = sal;
        }


    // получение всех полей Стринг
    public String getEmployeeStr() {
            String total = id+" "+fullName+" "+department+" "+ salary+" ";
            return total;
    }





}

