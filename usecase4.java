public class usecase4{
   public static void main(String[] args){
         int empCheck = ((int)(Math.random()*10)%3);
         int EmpWagePerHr=20;
         int empHrs=1;
         int salary;
         switch(empCheck){
           case 1: empHrs=8;
           break;
           case 2: empHrs=4;
           break;
           default:empHrs=0;
            }
           salary=EmpWagePerHr*empHrs;
           System.out.println("Salary is: "+salary);
       }
}


