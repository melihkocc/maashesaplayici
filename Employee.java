package nesneyonelimli.maas;

public class Employee {
    String name;
    double salary;
    int workHours;
    int year;


    Employee(String name, double salary,int workHours,int year){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.year = year;
    }

    void showEmployee(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Work Hours: "+workHours);
        System.out.println("Beginning Year: "+year);
    }

    void tax(){
        if(this.salary<1000){
            System.out.println("Vergi 0");
        }
        else if(this.salary>=1000){
            double vergi = this.salary*0.03;
            System.out.println("Vergi: "+vergi);
            this.salary-=vergi;
        }
    }

    void bonus(){
        if(this.workHours>40){
            int bonus=0;
            for (int i = 1; i <= workHours-40; i++) {
                bonus+=30;
            }
            System.out.println("Toplam bonus: "+bonus);
            this.salary+=bonus;
        }
    }

    void raiseSalary(){
        double zam;
        if(2021-year<=10){
            zam = this.salary*0.05;
            this.salary+=zam;
            System.out.println("Toplam Zam: "+zam);
        }
        else if(2021-year>10 && 2021-year<=20){
            zam = this.salary*0.1;
            this.salary+=zam;
            System.out.println("Toplam Zam: "+zam);
        }
        else if(2021-year>20){
            zam = this.salary*0.15;
            this.salary+=zam;
            System.out.println("Toplam Zam: "+zam);
        }
    }

    void NewSalary(){
        System.out.println("New Salary: "+this.salary);
        System.out.println("---------------------------------");
    }

    void abc(){
        this.showEmployee();
        this.tax();
        this.bonus();
        this.raiseSalary();
        this.NewSalary();
    }


}
