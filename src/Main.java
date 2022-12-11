
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

       // totalGet(base);// 4.
       // setDepSal(base,0,1,20000);//5.

        // 8.1



        String[] arr = totalGetStr(base);//8.3
        String[][] arr1 = arrToMultArr(arr, ' ');
        String min = totalColumn(arr1, 3, 1);
        System.out.println( min);









    }

    public static void totalGet(Employee[] base) { // 4.тотал геттер


        System.out.println("Id " + "            ФИО           " + "Отдел " + "Зарплата ");
        for (int i = 0; i < base.length; i++) {
            base[i].getEmployee();
        }
    }

    public static void setDepSal(Employee[] base, int id, int dep, int sal) {//5. сеттеры отдел,ЗП

        base[id].setDepartmentSalary(dep, sal);
        base[id].getEmployee();
    }


    public static String[] totalGetStr(Employee[] base) {// 8.1 тотал геттер Стринг


        String[] arr = new String[base.length];
        for (int i = 0; i < base.length; i++) {
            String tot = base[i].getEmployeeStr();
            arr[i] = tot;
            System.out.println(tot);
        }
        return arr;}





    // массив в двумерный
    public static String[][] arrToMultArr(String[] a, char b) {

        String[] j0 = a[0].split(" ");

        String[][] total = new String[a.length][j0.length];
        for (int i = 0; i < a.length; i++) {
            String[] total1 = a;
            String a0 = total1[i];
            a0.replace(' ', '?');
            String[] a1 = a0.split("!");
            for (int j = 0; j < a1.length; j++) {
                total[i][j] = a1[j];


            }
        }
        return total;
    }


    // тотал столбец

    public static String totalColumn(String[][] a, int b, int c) {// b- столбец c=1-min, 2-max, 3-total
        int ret = Integer.parseInt(a[0][0]);
        String ret1 = "";
        for (int i = 0; i < a.length; i++) {
            String a1 = a[i][b];
            int a2 = Integer.parseInt(a1);
            if (c == 1 && a2 < ret) {
                ret = a2;
                ret1 = i + "";
            } else if (c == 2 && a2 > ret) {
                ret = a2;
                ret1 = i + "";
            }
            else {ret+=a2;
            }

        }
        if (c == 3) {
            ret -= Integer.parseInt(a[0][0]);
        }
        ret1+=" "+ ret;
        return ret1;
    }

    // столбец в массив инт


}








