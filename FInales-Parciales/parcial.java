//ejercicio de refactorizar
interface Car{
    String getName();
    String getMileage();
}

public class Audi implements Car{
    String getName(){ return "Audi";};
    Strng getMileage(){ return "10 M";}
}

public class Mercedes implements Car{
    String getName(){ return "Mercedes";}
    Strng getMileage(){ return "20 M";}
}

public class mileageCalculator{
    List<Car> cars;

    public mileageCalculator(list<Car> cars){this.cars=cars;}

    public void calculateMileage(){
        for (Car car: cars){
            System.out.println("Mileage of the car "+car.getName()+" is: " + car.getMileage());
        }
    }
}

//ejemplo basic auth
curl -H "Authorization: Basic anVuYW46MTIzNA==" https://api.ejemplo.com/usuarios
//ejercicio de refactorizar
boolean isMacOrIE(String platform) {
    String upper = platform.toUpperCase();
    return upper.contains("MAC") || upper.contains("IE");
}
void someFunction() {
    if (isMacOrIE(platform) && wasInitialized() && resize >0) {
        someCode();
    }
    otherCode();
}

//ejemplos strategy y state
interface OrdenStrategy {
    void ordenar();
}

class OrdenPorNombre implements OrdenStrategy {
    public void ordenar() {
        System.out.println("Ordenando por nombre...");
    }
}

class OrdenPorEdad implements OrdenStrategy {
    public void ordenar() {
        System.out.println("Ordenando por edad...");
    }
}

class Lista {
    private OrdenStrategy strategy;

    public void setStrategy(OrdenStrategy strategy) {
        this.strategy = strategy;
    }

    public void mostrar() {
        strategy.ordenar();
    }
}

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.setStrategy(new OrdenPorNombre());
        lista.mostrar(); // Ordenando por nombre

        lista.setStrategy(new OrdenPorEdad());
        lista.mostrar(); // Ordenando por edad
    }
}


public class Lamp {

    private int brightness;
    private boolean isOn;

    public Lamp() {
        this.brightness = 50; // brillo por defecto
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void setBrightness(int brightness) {
        if (brightness < 0) {
            this.brightness = 0;
        } else if (brightness > 100) {
            this.brightness = 100;
        } else {
            this.brightness = brightness;
        }
    }

    public boolean isOn() {
        return isOn;
    }
}
public class Button {

    private Lamp lamp;

    public Button(Lamp lamp) {
        this.lamp = lamp;
    }

    public void press() {
        if (lamp.isOn()) {
            lamp.turnOff();
        } else {
            lamp.turnOn();
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Button button = new Button(lamp);

        button.press();          // enciende
        button.press();          // apaga

        lamp.setBrightness(75);  // se configura la lámpara
        button.press();          // enciende con brillo ajustado
    }
}


