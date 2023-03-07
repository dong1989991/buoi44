package BT_trenlop;

public class employees {
    public class engineer {
        public static void main(String[] args) {
            // Test constructor and toString()
            class_employees e1 = new class_employees(8, "Peter", "Tan", 2500);
            System.out.println(e1);  // toString();

            // Test Setters and Getters
            e1.setSalary(999);
            System.out.println(e1);  // toString();
            System.out.println("id is: " + e1.getId());
            System.out.println("firstname is: " + e1.getFirstName());
            System.out.println("lastname is: " + e1.getLastName());
            System.out.println("salary is: " + e1.getSalary());

            System.out.println("name is: " + e1.getName());
            System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

            // Test raiseSalary()
            System.out.println(e1.raiseSalary(10));
            System.out.println(e1);
        }
    }
}
