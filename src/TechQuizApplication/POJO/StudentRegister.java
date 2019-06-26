package TechQuizApplication.POJO;

public class StudentRegister {
    private String UserId;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }
    private String pwd;
    private String student;

    public StudentRegister(String UserId, String pwd, String student) {
        this.UserId = UserId;
        this.pwd = pwd;
        this.student = student;
    }
    
    
    
}
