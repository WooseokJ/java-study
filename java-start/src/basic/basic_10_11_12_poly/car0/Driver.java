package basic.basic_10_11_12_poly.car0;

public class Driver {
    // 차 늘어날떄마다 코드량이 늘어난다.(역할과 구현 분리안해서 이렇게된거)


    private K3Car k3Car; // null  참조형은 null
    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    private Model3Car model3Car;
    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("운전");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.offEngine();
        } else if (model3Car != null) {
            model3Car.startEngine();
            model3Car.offEngine();
        }

    }


}
