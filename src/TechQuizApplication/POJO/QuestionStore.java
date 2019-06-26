package TechQuizApplication.POJO;

import java.util.ArrayList;

public class QuestionStore {

    ArrayList<Questions> questionList;
    public QuestionStore(){
        questionList= new ArrayList<>();
    }
    public void addQuestion(Questions q){
        questionList.add(q);
    }
    public Questions getQuestion(int i){
        return questionList.get(i);
    }
    public void removeQuestion(int i){
        questionList.remove(i);
    }
    public void setQuestionAt(int pos,Questions q){
        questionList.add(pos, q);
    }
    public ArrayList<Questions> getAllQuestions(){
        return questionList;
    }
    public int getCount(){
        return questionList.size();
    }
    
}