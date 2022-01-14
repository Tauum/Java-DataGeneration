
public class Employee {

    public Long id;
    public String name;
    public String email;
    public String role;
    public String phone;
    public String imageURL; //can also be a file
    public String employeeCode;

    public Employee(){}

    public Employee(Long id, String name, String email, String role, String phone, String imageURL, String employeeCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.phone = phone;
        this.imageURL = imageURL;
        this.employeeCode = employeeCode;
    }

    public Employee(String name, String email, String role, String phone, String imageURL, String employeeCode) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.phone = phone;
        this.imageURL = imageURL;
        this.employeeCode = employeeCode;
    }

    public Employee(String name, String email, String role, String imageURL, String employeeCode) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.imageURL = imageURL;
        this.employeeCode = employeeCode;
    }

    public Employee(String name, String email, String role, String employeeCode) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.employeeCode = employeeCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Employee\n{\n" +
                "\"id\" : \"" + id + "\"" + ",\n" +
                "\"name\" : \"" + name + "\"" + ",\n" +
                "\"email\" : \"" + email + "\""  + ",\n" +
                "\"role\" : \"" + role + "\""  + ",\n" +
                "\"phone\" : \"" + phone + "\"" + ",\n" +
                "\"imageURL\" : \"" + imageURL + "\"" + ",\n" +
                "\"employeeCode\" : \"" + employeeCode + "\"" + "\n" +
                '}';
    }
//    @Override
//    public String toJson(){
//        return ""
//    }
}
