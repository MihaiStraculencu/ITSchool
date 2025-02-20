package dip;
public class NotificationService {
    private final Notifier notifier;

    // constructor
    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendNotification(String message, String recipient) {
        notifier.send(message, recipient);
    }

}