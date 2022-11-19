import javax.print.attribute.HashAttributeSet;

public class Human {
    public String name;
    public int age;
    public String city;
    public String job;

    public Human(String name, int age, String city, String job) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
            if (name == null) {
                this.name = "Информация не указана";
            } else {
                this.name = name;
            }
            if (city == null) {
                this.city = "Информация не указана";
            } else {
                this.city = city;
            }
            if (job == null) {
                this.job = "Информация не указана";
            } else {
                this.job = job;
            }
        }
    }
}

