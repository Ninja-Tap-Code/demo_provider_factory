package providers;

public class SendSms implements Provider {

    public SendSms() {
        InstanceRegistry.register("sendsms", this);
    }

    @Override
    public void send(String email, String message) {
        System.out.println("Gửi sms: " + email + ", message: " + message);
    }
}
