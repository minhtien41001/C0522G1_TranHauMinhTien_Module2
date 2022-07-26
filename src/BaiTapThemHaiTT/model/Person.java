package BaiTapThemHaiTT.model;

public class Person {
    private int id;
    private String name;
    private String dateOfBitrh;
    private String sex;

    public Person() {
    }

    public Person(int id, String name, String dateOfBitrh, String sex) {
        this.id = id;
        this.name = name;
        this.dateOfBitrh = dateOfBitrh;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBitrh() {
        return dateOfBitrh;
    }

    public void setDateOfBitrh(String dateOfBitrh) {
        this.dateOfBitrh = dateOfBitrh;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", dateOfBitrh='" + getDateOfBitrh() + '\'' +
                ", sex='" + getSex() + '\'' +
                '}';
    }
}
