package PostOffice;

public class UntrustworthyMailWorker implements MailService {
    private final MailService[] anotherPersons;

    public UntrustworthyMailWorker(MailService[] anotherPersons) {
        this.anotherPersons = anotherPersons;
    }

    public MailService getRealMailService() {
        return new RealMailService();
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService person : anotherPersons) {
            mail = person.processMail(mail);
        }
        return getRealMailService().processMail(mail);
    }
}
