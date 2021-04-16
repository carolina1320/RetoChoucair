package automation.demo.site.model;

public class AutomationDemoData {
    private String full_name;
    private String last_name;
    private String address;
    private String email;
    private String phone;
    private String password;
    private String confirm_password;

    public AutomationDemoData(String full_name, String last_name, String address, String email, String phone, String password, String confirm_password) {
        this.full_name = full_name;
        this.last_name = last_name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.confirm_password = confirm_password;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }
}
