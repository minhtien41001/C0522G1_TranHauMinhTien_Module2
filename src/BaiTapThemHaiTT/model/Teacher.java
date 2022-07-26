package BaiTapThemHaiTT.model;

public class Teacher extends Person{
    private String specialize;

    public Teacher() {
    }

    public Teacher(int id, String name, String dateOfBitrh, String sex, String specialize) {
        super(id, name, dateOfBitrh, sex);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "specialize='" + getSpecialize() + '\'' +
                '}' + super.toString();
    }
}
