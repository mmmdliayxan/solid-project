public class SendSms implements Service.SendSms{

    @Override
    public void sendSms(String phone, String message) {
        System.out.println("Sending SMS to " + phone + ": " + message);
    }
}
