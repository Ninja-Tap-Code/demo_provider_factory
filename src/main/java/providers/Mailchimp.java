package providers;

public class Mailchimp implements Provider {

    @Override
    public void send(String email, String message) {
        System.out.println("Gửi mailchimp: " + email + ", message: " + message);
    }
}
