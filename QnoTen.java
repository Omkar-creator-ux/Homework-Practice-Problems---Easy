public class QnoTen {
    String brand;
    int year;
    void showcar(QnoTen car){
        System.out.println("Brand: "+car.brand);
        System.out.println("Year: "+car.year);
    }
    public static void main(String[] args) {
        QnoTen car = new QnoTen();
        car.brand = "Toyota";
        car.year = 2022;
        QnoTen car2 = new QnoTen();
        car2.brand = "Honda";
        car2.year = 2023;
        System.out.println("Car : ");
        car.showcar(car);
        System.out.println("Car2 : ");
        car.showcar(car2);
    }
    
}
