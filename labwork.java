/* Case Study Smart Watch 

Scenario
A smart watch can track fitness activities and receive notifications.
Interface 1: FitnessTracker
    Data:
        - stepsCount
    Operations:
        - countSteps()
        - calculateCalories()
Interface 2: NotificationReceiver
    Data:
        - notificationMessage
    Operations:
        - receiveNotification()
        - displayNotification()
Class: SmartWatch
    Data:
        - watchBrand
        - model
    Operations:
        - showTime()
Multiple Inheritance:
    SmartWatch implements:
        - FitnessTracker
        - NotificationReceiver*/

import java.time.LocalTime;

interface FitnessTracker {
    int stepsCount = 500;

    void countSteps();

    void calculateCalories();
}

interface NotificationReceiver {
    String notificationMessage = "This is a default notification";

    void receiveNotification();

    void displayNotification();
}

class SmartWatch implements FitnessTracker, NotificationReceiver {
    String watchbrand, model;

    SmartWatch(String watchbrand, String model) {
        this.watchbrand = watchbrand;
        this.model = model;
    }

    public void countSteps() {
        System.out.println("Steps Count taken: " + stepsCount);
    }

    public void calculateCalories() {
        System.out.println("Calories burned: " + stepsCount * 0.1 + " kcal");
    }

    String notif;

    public void receiveNotification() {
        notif = notificationMessage;
    }

    public void displayNotification() {
        System.out.println("Notification received: " + notif);
    }

    void showTime() {
        System.out.println("Current Time: " + LocalTime.now());
    }

    void dispModel() {
        System.out.println("Brand: " + watchbrand);
        System.out.println("Model: " + model);
    }
}

public class labwork {
    public static void main(String[] args) {
        SmartWatch s1 = new SmartWatch("Firebolt", "ABC123");
        s1.dispModel();
        s1.countSteps();
        s1.calculateCalories();
        s1.receiveNotification();
        s1.displayNotification();
        s1.showTime();
    }
}
