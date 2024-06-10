package classAndInterface;

public class Main {
    public static void main(String[] args) {
        //Main i task 2 email validation
        UserValidator userValidator = new UserValidator();
        String[] results = userValidator.validateEmails("pb@", "@yahoo.com");
        System.out.println(results[0]);
        System.out.println(results[1]);
    }
}
