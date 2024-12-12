package providers;

public class Sendinblue implements Provider {

    @Override
    public void send(String email, String message) {
        System.out.println("Gửi sendinblue: " + email + ", message: " + message);
    }
}
