package classAndInterface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {


    public String[] validateEmails(String email, String alternative) {

        class Email {
            private String email;

            public Email(String email) {
                if (email == null || email.isEmpty()) {
                    this.email = "Unknown";
                }
                this.email = email;
            }
        }

        Email email1 = new Email(email);
        Email email2 = new Email(alternative);
        return new String[]{email1.email, email2.email};


    }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher =
                VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
}
