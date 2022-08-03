public class Dealership {

  public static void main(String[] args) {

    Customer cust1 = new Customer("Tom", "123 Main Street", 28000);
    Vehicle vehicle = new Vehicle("Toyota", "RAV4", 2019, 28000);
    Employee employee = new Employee("Eliza", "Karki");
    cust1.purchaseCar(vehicle, employee, false);



  }
}
