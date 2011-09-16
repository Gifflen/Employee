public class Employee {

    private String name;
    private int ID;
    private double hourlyWage;

    public Employee(String name, int ID, double hourlyWage) {
        this.name = name;
        this.ID = ID;
        this.hourlyWage = hourlyWage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getYearlyWage(){
        return (hourlyWage*40*52);
    }

    public void increaseSalary(double percentIncrease){

    }

    public double paycheck(double [] hours) {
        double totalPay = 0;
        for (int i = 0; i <hours.length;i++){
            if (hours[i] <= 40){
                totalPay+=(hours[i]*hourlyWage);
            }else{
                totalPay+=40*hourlyWage;
                totalPay+=((hours[i]-40)*(hourlyWage*1.5));
            }
        }
        return totalPay;
    }
}
