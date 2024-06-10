package classAndInterface;

public class Main {
    public static void main(String[] args) {
        //Main i task 2 email validation
        UserValidator userValidator = new UserValidator();
        String[] results = userValidator.validateEmails("pb@", "@yahoo.com");
        System.out.println(results[0]);
        System.out.println(results[1]);

        //ushtrimi me makine
        Car economyCar = new Car("economy", "Toyota");
        System.out.println("Economy Car Engine: " + economyCar.getEngine().getEngineType());

        Car luxuryCar = new Car("luxury", "Mercedes");
        System.out.println("Luxury Car Engine: " + luxuryCar.getEngine().getEngineType());

        Car standardCar = new Car("standard", "Honda");
        System.out.println("Standard Car Engine: " + standardCar.getEngine().getEngineType());
    }
}
