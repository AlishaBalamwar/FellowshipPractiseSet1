public class usecase2{
   public static void main(String[] args){
         int  present= 1;
         double empCheck = Math.floor(Math.random()*10)%2;
         if(empCheck==present){
           int empWagePerHour=20;
           int empHrs=8;
           int salary=empWagePerHour*empHrs;
           System.out.println("Daily salary of employee if present is: "+salary);
           }else{
             System.out.println("salary is 0");
           }
  }
}
