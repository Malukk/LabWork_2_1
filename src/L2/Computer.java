package L2;

/**
 * Created by Bulik on 13.07.2016.
 */
public class Computer {
    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public int getQuantityCPU() {
        return quantityCPU;
    }
    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {

        this.price = price;
    }
    public int getFrequencyCPU() {
        return frequencyCPU;
    }
    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public void view (){
        System.out.println(manufacturer + "\t" + serialNumber + "\t" + price + "\t" + quantityCPU + "\t" + frequencyCPU);
    }
}