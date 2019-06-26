package TechQuizApplication.POJO;

public class Exam {
          private String ExamId;
          private String Language;
          private int TotalQues;

    public Exam(String ExamId, String Language, int TotalQues) {
        this.ExamId = ExamId;
        this.Language = Language;
        this.TotalQues = TotalQues;
    }

    public String getExamId() {
        return ExamId;
    }

    public void setExamId(String ExamId) {
        this.ExamId = ExamId;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public int getTotalQues() {
        return TotalQues;
    }

    public void setTotalQues(int TotalQues) {
        this.TotalQues = TotalQues;
    }
          
}
