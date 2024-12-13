package providers;

public class SendSms implements Provider {

    @Override
    public void send(String email, String message) {
        System.out.println("Gửi sms: " + email + ", message: " + message);
    }
}
