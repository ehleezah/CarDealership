public class Employee {

  private String firstName;
  private String lastName;

  public Employee(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
    if (finance) {
      double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
      runCreditHistory(customer, loanAmount);
    }
    else if (vehicle.getPrice() <= customer.getCashOnHand()) {
      processTransaction(customer, vehicle);
    }
    else {
      System.out.println("Sorry we cannot process transaction! Please bring more money to purchase the vehicle.");
    }
  }

  private void runCreditHistory(Customer customer, double loanAmount) {
    System.out.println(String.format("Successfully ran credit history for customer %s for loan amount of %s", customer.getName(), loanAmount));
    System.out.println("Customer has been approved to purchase the vehicle.");
  }


  private void processTransaction(Customer customer, Vehicle vehicle) {
    System.out.println(String.format("%s has purchased the %s vehicle.", customer, vehicle));
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

  @Override
  public String toString() {
    return "Employee{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
  }
}
