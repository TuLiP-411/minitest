package employee;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new FulltimeEmployee("FT1", "Nguyen Van Dai", 23, "09372847832", "nguyenvandai@codegym.com", 2000000, 50000, 15000000);
        employees[1] = new FulltimeEmployee("FT2", "Phan Ha Trinh", 24, "09372846832", "phanhatrinh@codegym.com", 1500000, 500000, 20000000);
        employees[2] = new FulltimeEmployee("FT3", "Nguyen Thai Vu", 22, "04852847832", "nguyenthaivu@codegym.com", 20000, 0, 12000000);
        employees[3] = new FulltimeEmployee("FT4", "Dao Manh Duc", 26, "09323457832", "daomanhduc@codegym.com", 200000, 2000000, 18000000);
        employees[4] = new FulltimeEmployee("FT5", "Phuong Thanh Ha", 25, "09372875950", "phuongthanhha@codegym.com", 500000, 30000, 23000000);
        employees[5] = new FulltimeEmployee("FT6", "Nguyen Phuong Thao", 30, "09372840000", "nguyenphuongthao@codegym.com", 1300000, 50000, 30000000);
        employees[6] = new FulltimeEmployee("FT7", "Truong Manh Hung", 32, "09372844332", "truongmanhhung@codegym.com", 1300000, 50000, 35000000);
        employees[7] = new ParttimeEmployee("PT1", "Nguyen Phuong Ha", 20, "0937875200", "nguyenphuongha@codegym.com", 130);
        employees[8] = new ParttimeEmployee("PT2", "Ha Hoang Minh", 21, "0924553720", "hahoangminh@codegym.com", 150);
        employees[9] = new ParttimeEmployee("PT3", "Ho Thanh Thuy", 19, "09372444566", "hothanhthuy@codegym.com", 143);

        //6
        System.out.println("1. Lương trung bình của nhân viên cả công ty: " + averageSalary(employees));
        //7
        System.out.println("\n2. Danh sách nhân viên fulltime có lương thấp hơn lương trung bình toàn công ty: \n" + lessThanAverageFulltime(employees));
        //8
        System.out.println("3. Tổng số lương phải trả cho tất cả nhân viên parttime: " + sumParttime(employees));
        //9
        System.out.println("\n4. Sắp xếp nhân viên toàn thời gian theo số lương tăng dần:\n" + sortFulltime(employees));


    }

    //6: Viết phương thức tính trung bình lương của nhân viên cả công ty
    public static int averageSalary(Employee[] arr) {
        int sum = 0;
        int averageSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getSalary();
        }
        averageSalary = sum / arr.length;
        return averageSalary;
    }

    //    7: Viết phương thức liệt kê danh sách nhân viên toàn thời gian có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty.
    public static String lessThanAverageFulltime(Employee[] arr) {
        int averageSalary = averageSalary(arr);
        String result = "";
        for (Employee e : arr
        ) {
            if (e instanceof FulltimeEmployee) {
                if (e.getSalary() < averageSalary) {
                    result += e.toString() + "\n";

                }
            }
        }
        return result;
    }

    //    8: Viết phương thức tính số lương phải trả cho tất cả các nhân viên bán thời gian.
    public static int sumParttime(Employee[] arr) {
        int sum = 0;
        for (Employee e : arr
        ) {
            if (e instanceof ParttimeEmployee) {
                sum += e.getSalary();
            }
        }
        return sum;
    }

    //9: Viết phương thức sắp xếp nhân viên toàn thời gian theo số lương tăng dần.
    public static String sortFulltime(Employee[] arr) {
        Arrays.sort(arr);
        String result = "";
        for (Employee e : arr
        ) {
            if (e instanceof FulltimeEmployee) {
                result += e.toString() + "\n";
            }
        }
        return result;
    }

}

