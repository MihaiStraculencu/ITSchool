package dip;
public class EmailNotifier implements Notifier {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}