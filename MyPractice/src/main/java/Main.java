public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int i;
        i = 15;
        System.out.println(i); //15

        Cat luna = new Cat();
        System.out.println(luna.color); //Black
        System.out.println(luna.getAge()); //0

        Cat leo = new Cat("brown");
        System.out.println(leo.color); //brown
        leo.sayMeow(); //Мяу
        System.out.println(leo.getColor());

        leo.setAge(6);
        System.out.println(leo.getAge()); //6
        leo.sayMeow();
        luna.sayMeow();
    }
}