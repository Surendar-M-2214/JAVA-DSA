import java.util.Arrays;

public class Question {
    private int id;
    private String Ques ,ans;
    private String[] opt=new String[4] ;

    public Question(int id, String ques, String ans, String... opt) {
        this.id = id;
        Ques = ques;
        this.ans = ans;
        this.opt = opt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQues() {
        return Ques;
    }

    public void setQues(String ques) {
        Ques = ques;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }



    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", Ques='" + Ques + '\'' +
                ", ans='" + ans + '\'' +
                ", opt=" + Arrays.toString(opt) +
                '}';
    }

    public String[] getOpt() {
        return opt;
    }

    public void setOpt(String[] opt) {
        this.opt = opt;
    }
}
