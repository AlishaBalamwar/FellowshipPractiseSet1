public class usecase3{
   public static void main(String[] args){
         int is_full_time = 1;
         int is_part_time = 2;
         double empCheck = Math.floor(Math.random()*10)%3;
         if(empCheck==is_full_time){
           int empWagePerHour=20;
           int empHrs=8;
           int salary=empWagePerHour*empHrs;
           System.out.println("Daily salary of employee in full time is: "+salary);
           }else if(empCheck==is_part_time){
           int empWagePerHour=20;
           int empHrs=4;
           int salary=empWagePerHour*empHrs;
           System.out.println("Daily salary of employee in part time is: "+salary);
           }else{
             System.out.println("salary is 0");
           }
  }
}

