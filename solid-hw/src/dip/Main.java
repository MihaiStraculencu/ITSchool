package dip;

/**
 * Refactor the NotificationService to depend on an abstraction.
 * Implement a new notifier for SMS without changing NotificationService.
 */

public class Main {
    public static void main(String[] args) {
        // email service
        Notifier emailNotifier = new EmailNotifier();
        NotificationService emailService = new NotificationService(emailNotifier);
        emailService.sendNotification("Email working", "email@gmail.com");

        // sms service
        Notifier smsNotifier = new SMSNotifier();
        NotificationService smsService = new NotificationService(smsNotifier);
        smsService.sendNotification("SMS working", "2135232");
    }
}