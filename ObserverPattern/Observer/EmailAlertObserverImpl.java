package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl (String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        sendEmail(emailId, "Product in stock!");
    }

    private void sendEmail(String emailId, String message) {
        System.out.println("mail - " + message + " - sent to " + emailId);
    }
}
