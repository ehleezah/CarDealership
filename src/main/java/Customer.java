public class Customer {

  private String name;
  private String address;
  private double cashOnHand;

  public Customer(String name, String address, double cashOnHand) {
    this.name = name;
    this.address = address;
    this.cashOnHand = cashOnHand;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    address += "Dealership City "; //hiding details inside the setters and getters (encapsulation)
    this.address = address;
  }

  public double getCashOnHand() {
    return cashOnHand;
  }

  public void setCashOnHand(double cashOnHand) {
    cashOnHand += 500;
    this.cashOnHand = cashOnHand;
  }

  public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
    if (finance) {
      System.out.println(String.format("Purchased a vehicle model %s of make %s of year %s financed at %s from employee %s %s.",
              vehicle.getModel(), vehicle.getMake(), vehicle.getYear(), vehicle.getPrice(), employee.getFirstName(), employee.getLastName()));
    }
    else {
      System.out.println("Young money");
    }

  }
}
