package PostOffice;

import static PostOffice.Main.BANNED_SUBSTANCE;
import static PostOffice.Main.WEAPONS;

class IllegalPackageException extends RuntimeException {
    public IllegalPackageException() {
        super();
    }
}

class StolenPackageException extends RuntimeException {
    public StolenPackageException() {
        super();
    }
}

public class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) throws IllegalPackageException, StolenPackageException {
        MailPackage mailPackage;
        if (mail.getClass() == MailPackage.class) {
            mailPackage = (MailPackage) mail;
        } else {
            return mail;
        }
        if ((mailPackage.getContent().getContent().contains(WEAPONS))
                || (mailPackage.getContent().getContent().contains(BANNED_SUBSTANCE))) {
            throw new IllegalPackageException();
        } else if (mailPackage.getContent().getContent().contains("stones")) {
            throw new StolenPackageException();
        }
        return mailPackage;
    }
}
