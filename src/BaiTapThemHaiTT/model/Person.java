package BaiTapThemHaiTT.model;

public abstract class Person {
    private String id;
    private String name;
    private String dateOfBirth;
    private String sex;

    public Person(){

    }

    public Person(String id, String name, String dateOfBirth, String sex) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public abstract String getinFor();
    @Override
    public String toString() {
        return
                "  id = " + id +
                        ", name = " + name  +
                        ", dateOfBirth = " + dateOfBirth +
                        ", sex = " + sex ;

    }
}
