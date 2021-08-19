public class usecase5{
   public static void main(String[] args){
         int is_full_time = 1;
         double empCheck = Math.floor(Math.random()*10)%2;
         if(empCheck==is_full_time){
           int empWagePerHour=20;
           int WorkingDays=20;
           int empHrs=8;
           int MonthlySalary=empWagePerHour*empHrs*WorkingDays;
           System.out.println("Monthly salary of employee if present: "+MonthlySalary);
           }else{
             System.out.println("salary is 0");
           }
  }
}
