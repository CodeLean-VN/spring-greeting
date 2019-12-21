package codelean.model;

public class Account {
    private String email;
    private String fullname;

    public Account(){}

    public Account(String email, String fullname){
        this.email = email;
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
