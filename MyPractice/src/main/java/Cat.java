import java.time.LocalDateTime;

public class Cat {
    Cat() {
        color = "Black";
    }

    Cat(String color) {
        this.color = color;
    }

    private int age;
    String color;
    double weight;
    LocalDateTime birthday;

    void sayMeow() {
        switch (age) {
            case 0:
                System.out.println("Мяу");
            default:
                System.out.println("МЯЯЯЯЯЯЯЯЯЯЯУ");
        }
    }

    String getColor () {
        return color;
    }

    void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return age;
    }
}
