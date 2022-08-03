public class Employee {

  private String firstName;
  private String lastName;

  public Employee(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
    if (finance) {
      runCreditHistory(customer, customer.getCashOnHand());
    }
    else if (vehicle.getPrice() <= customer.getCashOnHand()) {
      processTransaction(customer, vehicle);
    }
    else {
      System.out.println("Sorry we cannot process transaction! Please bring more money...");
    }
  }

  private void runCreditHistory(Customer customer, double loanAmount) {
    System.out.println(String.format("Successfully ran credit history for customer %s for loan amount of %s", customer.getName(), customer.getCashOnHand()));
  }


  private void processTransaction(Customer customer, Vehicle vehicle) {
    System.out.println(String.format("Successfully processed transaction for customer %s for %s vehicle..", customer.getName(), vehicle.getMake()));
  }
}
