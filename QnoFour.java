public class QnoFour {
    String name;
    int age;
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        QnoFour s1 = new QnoFour();
        s1.name = "Omakr";
        s1.age = 21;
        s1.displayInfo();
    }
}
