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
    private EmergencyContact emergencyContact;
    private Date joinDate;

    // Private constructor untuk Builder Pattern
    private Employee(Builder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.address = builder.address;
        this.birthCity = builder.birthCity;
        this.birthDate = builder.birthDate;
        this.employeeId = builder.employeeId;
        this.salary = builder.salary;
        this.department = builder.department;
        this.emergencyContact = builder.emergencyContact;
        this.joinDate = builder.joinDate;
    }

    // Builder Class
    public static class Builder {
        private String name;
        private String phone;
        private String address;
        private String birthCity;
        private Date birthDate;
        private String employeeId;
        private float salary;
        private Department department;
        private EmergencyContact emergencyContact;
        private Date joinDate;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setBirthCity(String birthCity) {
            this.birthCity = birthCity;
            return this;
        }

        public Builder setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setSalary(float salary) {
            this.salary = salary;
            return this;
        }

        public Builder setDepartment(Department department) {
            this.department = department;
            return this;
        }

        public Builder setEmergencyContact(EmergencyContact emergencyContact) {
            this.emergencyContact = emergencyContact;
            return this;
        }

        public Builder setJoinDate(Date joinDate) {
            this.joinDate = joinDate;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}

// Enum untuk Department
enum Department {
    HR, IT, FINANCE
}

// Class EmergencyContact sebagai contoh
class EmergencyContact {
    private String name;
    private String phone;

    public EmergencyContact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}