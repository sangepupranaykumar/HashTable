package employeewage;

public class SwitchCase {
    public static void main(String[] args) {
        double WagePerHour=20;
        double FulldayHour=8;
        double DailyWage=0;
        double val= Math.random()*3;
        int data = (int) Math.floor(val);
        switch (data){
            case 0:
            System.out.println("Employee is Absent");
            System.out.println("Wage for employee "+DailyWage);
            break;
            case 1:
            System.out.println("Employee is present");
            DailyWage=WagePerHour*FulldayHour;
            System.out.println("Wage For employee"+DailyWage);
            break;
            case 2:
                System.out.println("Employee is present for only part time ");
            DailyWage=(WagePerHour*FulldayHour)/2;
            System.out.println("Wage for Part Time Employee"+DailyWage);
        break;
        }
    }
}
