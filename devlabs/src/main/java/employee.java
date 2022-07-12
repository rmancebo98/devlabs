public class employee {

    int empID;
    String empName;
    public employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public void employeeInfo(){
        System.out.println();
        System.out.println("The employee ID is " + empID + " and the name is " + empName);
    }
}
