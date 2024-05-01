package test;

public class ApplicationForm {
    public String name;
    public String course;
    public int age;
    public String marks;

    @Override
    public String toString() {
        return "ApplicationForm{" +
                "Name='" + name + '\'' +
                ", Course='" + course + '\'' +
                ", Age=" + age +
                ", Marks='" + marks + '\'' +
                '}';
    }
}
