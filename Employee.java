/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if(age>=16){
            System.out.println("You can drive yay");
            return true;
        }
        else { int remainingYears = 16 - age; System.out.println("You cannot drive" + remainingYears); return false; 
        }   
    }
    
    
    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        double taxes =0.3;
        double pay = (hourlyWage+unpaidHours)-((hourlyWage+unpaidHours)+taxes);
        return pay;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){}
        
    
    
    public int setyearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
        return yearOfBirth;
    }
    
    public double setunpaidHours (double unpaidHours){
        this.unpaidHours = unpaidHours;
        return unpaidHours;
    }
    
    public double sethourlyWage(double hourlyWage){
        this.hourlyWage = hourlyWage;
        return hourlyWage;
    }
    
}