import java.util.Date;

public class Employee {
    private String name;
    private String phone;
    private String address;
    private String birthCity;
    private Date birthDate;
    private String employeeId;
    private float salary;
    private Department department;
    private Date joinDate;
    private EmergencyContact emergencyContact;

    // Constructor
    public Employee(String name, String phone, String address, String birthCity, Date birthDate, 
                    String employeeId, float salary, Department department, Date joinDate, 
                    EmergencyContact emergencyContact) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.birthCity = birthCity;
        this.birthDate = birthDate;
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
        this.joinDate = joinDate;
        this.emergencyContact = emergencyContact;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getBirthCity() { return birthCity; }
    public void setBirthCity(String birthCity) { this.birthCity = birthCity; }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public float getSalary() { return salary; }
    public void setSalary(float salary) { this.salary = salary; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }

    public Date getJoinDate() { return joinDate; }
    public void setJoinDate(Date joinDate) { this.joinDate = joinDate; }

    public EmergencyContact getEmergencyContact() { return emergencyContact; }
    public void setEmergencyContact(EmergencyContact emergencyContact) { this.emergencyContact = emergencyContact; }
}
