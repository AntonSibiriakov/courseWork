
public class Main {


    public static void main(String[] args) {
        Employee[] base = new Employee[10];
        base[0] = new Employee("Иванова Агата Тимофеевна   ", 2, 15000);
        base[1] = new Employee("Майоров Олег Демидович     ", 2, 22000);
        base[2] = new Employee("Тимофеева Евгения Ильинична", 1, 18000);
        base[3] = new Employee("Котова Малика Михайловна   ", 4, 25000);
        base[4] = new Employee("Борисов Тимофей Миронович  ", 5, 20000);
        base[5] = new Employee("Андрианов Семён Максимович ", 2, 19000);
        base[6] = new Employee("Пименова Милана Тимофеевна ", 3, 28000);
        base[7] = new Employee("Блинов Ян Артёмович        ", 4, 15000);
        base[8] = new Employee("Левин Матвей Тимурович     ", 1, 23000);
        base[9] = new Employee("Ракова Софья Максимовна    ", 1, 21000);


        System.out.println("=====5=====");
        setDepSal(base, 0, 1, 20000);// 5.

        System.out.println("\n=====8.1=====");
        totalGetStr(base);// 8.1


        System.out.println("\n=====8.4=====");
        int totalSalaryMonth = minMaxTotalSalaryMonth(base);// 8,2/8.3/8.4
        System.out.println("\n=====8.5=====");
        System.out.println("Cредняя ЗП " + totalSalaryMonth / base.length);
        totalFullName(base);


        System.out.println("Повышенная сложность**");

        salaryIndexing(base, 15);// 1
        searchByDepartment(base, 1, 15);// 2
        salarySearch(base,21000);// 3


    }


    public static void setDepSal(Employee[] base, int id, int dep, int sal) {// 5. сеттеры отдел,ЗП

        base[id].setDepartmentSalary(dep, sal);
        System.out.println(+base[id].getId() + " " + base[id].getName() + " " + base[id].getDepartment() + " " + base[id].getSalary());
    }

    public static void totalGetStr(Employee[] base) {// 8.1 тотал гет Стринг


        String[] arr = new String[base.length];
        for (int i = 0; i < base.length; i++) {
            String tot = base[i].getEmployeeStr();
            arr[i] = tot;
            System.out.println(tot);
        }
    }

    public static int minMaxTotalSalaryMonth(Employee[] base) {// 8,1/8.2/8.3
        int totalSalaryMonth = 0;
        double minSalary = base[0].getSalary();
        double maxSalary = 0;
        for (int i = 0; i < base.length; i++) {
            int salary = base[i].getSalary();
            if (minSalary > salary) {
                minSalary = salary + i * 0.1;

            }
            if (maxSalary < salary) {
                maxSalary = salary + i * 0.1;
            }
            totalSalaryMonth += salary;
        }
        System.out.println("8.2 За месяц выплачено " + totalSalaryMonth);
        double idMin = minSalary % 1 * 10;
        System.out.println("\n=====8.3=====");
        System.out.println("Минимальная зарплата  " + base[(int) idMin].getName() + " составляет " + (int) minSalary);
        double idMax = maxSalary % 1 * 10;
        System.out.println("\n=====8.4=====");
        System.out.println("Максимальная зарплата  " + base[(int) idMax].getName() + " составляет " + (int) maxSalary);
        return totalSalaryMonth;
    }

    public static void totalFullName(Employee[] base) {// 8.6
        System.out.println("\n=====8.6=====");
        for (int i = 0; i < base.length; i++) {
            System.out.println(base[i].getName());

        }
    }

    public static void salaryIndexing(Employee[] base, int a) {
        System.out.println("\n=====1**=====");

        for (int i = 0; i < base.length; i++) {
            base[i].salaryIndexing(a);

            }
        }



    public static void searchByDepartment(Employee[] base, int a, int ind) {

        int minSalary = base[0].getSalary();
        int idMinSalary = 0;

        int maxSalary = 0;
        int idMaxSalary = 0;

        int totalSalary = 0;
        int peopleDepartment=0;
        for (int i = 0; i < base.length; i++) {
            if (base[i].getDepartment() == a) {
                base[i].salaryIndexing(ind);

                totalSalary += base[i].getSalary();

                if (base[i].getSalary() > maxSalary) {
                    maxSalary = base[i].getSalary();
                    idMaxSalary = i;
                }
                if (base[i].getSalary() < minSalary) {
                    minSalary = base[i].getSalary();
                    idMaxSalary=i;
                }
                peopleDepartment++;
            }
        }
        String nameMinSalary = base[idMinSalary].getName();
        String nameMaxSalary = base[idMaxSalary].getName();


        System.out.println("\n=====2.1**=====");
        System.out.println("Минимальная зарплата: "+nameMinSalary+ minSalary);
        System.out.println("\n=====2.2**=====");

        System.out.println("Максимальная зарплата: "+ nameMaxSalary+maxSalary);
        System.out.println("\n=====2.3**=====");
        System.out.println("За месяц выплачено: "+totalSalary);
        System.out.println("\n=====2.4**=====");
        System.out.println("Средняя зарплата: "+ totalSalary/peopleDepartment);

        System.out.println("\n=====2.6**=====");
        for (int i = 0; i < base.length; i++) {
            if (base[i].getDepartment() == a) {
                System.out.println(base[i].getId()+" "+base[i].getName()+" "+ base[i].getSalary());
            }
        }
    }
    public static void salarySearch(Employee[] base, int a) {
        System.out.println("\n=====3.1**=====");
        for (int i = 0; i < base.length; i++) {
            if (base[i].getSalary() < a) {
                System.out.println(base[i].getEmployeeStr());
            }
        }

        System.out.println("\n=====3.2**=====");
        for (int i = 0; i < base.length; i++) {
            if (base[i].getSalary() >= a) {
                System.out.println(base[i].getEmployeeStr());
            }
        }
    }
}









