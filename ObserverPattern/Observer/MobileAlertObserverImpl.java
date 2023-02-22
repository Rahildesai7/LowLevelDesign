package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String phoneNumber;
    StockObservable stockObservable;

    public MobileAlertObserverImpl (String phoneNumber, StockObservable stockObservable) {
        this.phoneNumber = phoneNumber;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        sendEmail(phoneNumber, "Product in stock!");
    }

    private void sendEmail(String emailId, String message) {
        System.out.println("sms - " + message + " - sent to " + emailId);
    }
}
