package providers;

public class Sendgird implements Provider {

    public Sendgird() {
        InstanceRegistry.register("sendgird", this);
    }

    @Override
    public void send(String email, String message) {
        System.out.println("Gửi sendgird: " + email + ", message: " + message);
    }
}
