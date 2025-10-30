public class SendEmail implements Service.SendEmail {
    @Override
    public void sendEmail(String email, String message) {
        EmailService emailService = new EmailService();
        emailService.send(email, message);
    }
}
