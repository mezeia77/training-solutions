package exam03retake01.mailing;

import java.util.ArrayList;
import java.util.List;

public class Mail {

    private Contact from;
    private List<Contact> contacts = new ArrayList<>();
    private String subject;
    private String message;

    public Mail(Contact from, List<Contact> contacts, String subject, String message) {
        this.from = from;
        this.contacts = contacts;
        this.subject = subject;
        this.message = message;
    }

    public Contact getFrom() {
        return from;
    }

    public List<Contact> getTo() {
        return contacts;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "from=" + from +
                ", contacts=" + contacts +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
