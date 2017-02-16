package L2;

/**
 * Created by Bulik on 13.07.2016.
 */
public class Main {public static void main(String[] args){
    Computer computer = new Computer();

    System.out.println(computer.getManufacturer());
    computer.setManufacturer("Dell");
    System.out.println(computer.getManufacturer());
    System.out.println();

    Computer[] arrayComp = new Computer[5];
    for (int i=0; i<arrayComp.length; i++){
        //arrayComp[i] = new Computer();
        //arrayComp[i].setManufacturer("Asus" + (i+1));
        Computer object = new Computer();
        object.setManufacturer("Asus" + (i+1));
        object.setFrequencyCPU(1500);
        object.setQuantityCPU(4);
        object.setPrice((float)Math.random() * 1000);
        object.setSerialNumber(201600 + (i+1));
        arrayComp[i] = object;
    }
    for (Computer element : arrayComp){
        float price = element.getPrice();
        System.out.println("Old price: " + price);
        element.setPrice(price * 1.1F);
        System.out.println("New price: " + element.getPrice());
    }
    System.out.println();


    for (Computer element : arrayComp){
        element.view();
    }
}
}