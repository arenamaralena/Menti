package PostOffice;

public class Thief implements MailService {
    private final int minPriceOfPackage;
    int thiefHave = 0;

    public Thief(int minPriceOfPackage) {
        this.minPriceOfPackage = minPriceOfPackage;
    }

    public int getStolenValue() {
        return thiefHave;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        MailPackage mailPackage;
        if (mail instanceof MailPackage) {
            mailPackage = (MailPackage) mail;
            int packagePrice = mailPackage.getContent().getPrice();
            if (packagePrice >= minPriceOfPackage) {
                thiefHave += packagePrice;
                String newContent = "stones instead of " + mailPackage.getContent().getContent();
                int newPrice = 0;
                mailPackage = new MailPackage(mailPackage.getFrom(), mailPackage.getTo(), new Package(newContent, newPrice));
                return mailPackage;
            }
        }
        return mail;
    }
}
