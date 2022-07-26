package BaiTapThemHaiTT.model;

public class Student extends Person{
    private String nameClass;
    private double score;

    public Student() {
    }

    public Student(int id, String name, String dateOfBitrh, String sex, String nameClass, double score) {
        super(id, name, dateOfBitrh, sex);
        this.nameClass = nameClass;
        this.score = score;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameClass='" + getNameClass() + '\'' +
                ", score=" + getScore() +
                '}' + super.toString();
    }
}
