package models;

public class JobInfo {
    private String jobTitle;
    private String department;
    private double salary;

    // Constructor
    public JobInfo(String jobTitle, String department, double salary) {
        this.jobTitle = jobTitle;
        this.department = department;
        this.salary = salary;
    }

    // Getter dan Setter
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method untuk menampilkan informasi pekerjaan
    public void displayJobInfo() {
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}
