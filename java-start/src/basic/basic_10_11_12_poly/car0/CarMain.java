package basic.basic_10_11_12_poly.car0;

public class CarMain {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car);
        driver.drive();

        System.out.println();
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null); // 꼭 해줘야해(조건문떄매), 이제 안타니까 Nill
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
