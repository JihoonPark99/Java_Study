package Lab6;

public class Student {
    private String userName;
    private double[] scores;

    public Student() {
        userName = "";
        scores = new double[3];
    }

    // public Student(String username) {
    // userName = username;
    // scores = new double[3];
    // }

    // userName
    public void setuserName(String username) {
        userName = username;
    }

    public String getuserName() {
        return userName;
    }

    public void setScore(int index, double score) {
        scores[index] = score;
    }

    public double getScore(int index) {
        return scores[index];
    }

    // Next Class
    // public String toString(){
    // return userName, scores ;
    // }

    public String toString() {
        return "Student: " + userName + "\nTest scores: " + scores[0] + ", " + scores[1] + ", " + scores[2];
    }

}
