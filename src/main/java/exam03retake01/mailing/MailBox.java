package exam03retake01.mailing;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<Mail> mails = new ArrayList<>();

    public void addMail(Mail mail1) {
        mails.add(mail1);
    }

    public List<Mail> getMails() {
        return mails;
    }

    public List<Mail> findByCriteria(String s) {
        List<Mail> result = new ArrayList<>();
        String[] emailParts = s.split(":");

        if(emailParts[0].equals("from")) {
            from(result, emailParts);
            return result;
        }

        if(emailParts[0].equals("to")) {
            to(result, emailParts);
            return result;
        }

        for (Mail mail : mails) {
            subjectOrBody(s, result, mail);
        }
        return result;
    }

    private void from(List<Mail> result, String[] emailParts) {
        for (Mail mail : mails) {
            if (mail.getFrom().getEmail().equals(emailParts[1]) || mail.getFrom().getName().equals(emailParts[1])) {
                result.add(mail);
            }
        }
    }

    private void to(List<Mail> result, String[] emailParts) {
        for (Mail mail : mails) {
            for (Contact contact : mail.getTo()) {
                if (contact.getEmail().equals(emailParts[1]) || contact.getName().equals(emailParts[1])) {
                    result.add(mail);
                }
            }
        }
    }

    private void subjectOrBody(String s, List<Mail> result, Mail mail) {
        if (mail.getSubject().contains(s) || mail.getMessage().contains(s)) {
            result.add(mail);
        }
    }
}
