package PostOffice;

import java.util.logging.Logger;

import static PostOffice.Main.AUSTIN_POWERS;

public class Spy implements MailService {
    private final Logger spy;

    public Spy(Logger spy) {
        this.spy = spy;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        MailMessage mailMessage;
        if (mail instanceof MailMessage) {
            mailMessage = (MailMessage) mail;
            if (mailMessage.getFrom().equals(AUSTIN_POWERS) || (mailMessage.getTo().equals(AUSTIN_POWERS))) {
                spy.warning("Detected target mail correspondence: from " + mailMessage.getFrom()
                        + " to " + mailMessage.getTo() + " \"" + mailMessage.getMessage() + "\"");
            } else {
                spy.info("Usual correspondence: from " + mailMessage.getFrom() + " to " + mailMessage.getTo());
            }
        }
        return mail;
    }
}
