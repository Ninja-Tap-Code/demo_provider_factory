package providers;

public class Sendgird implements Provider {

    @Override
    public void send(String email, String message) {
        System.out.println("Gửi sendgird: " + email + ", message: " + message);
    }
}
