public class Vehicle {

  private String model;
  private String make;
  private int year;
  private int price;

  public Vehicle(String model, String make, int year, int price) {
    this.model = model;
    this.make = make;
    this.year = year;
    this.price = price;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Vehicle{" +
            "model='" + model + '\'' +
            ", make='" + make + '\'' +
            ", year=" + year +
            ", price=" + price +
            '}';
  }
}
