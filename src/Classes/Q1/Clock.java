package Classes.Q1;

import java.util.Random;

public class Clock {
    int seconds;
    int minutes;
    int hours;

    void print() {
        if (this.hours < 10) {
            System.out.print("0" + this.hours + ":");
        } else {
            System.out.print(this.hours + ":");
        }
        if (this.minutes < 10) {
            System.out.print("0" + this.minutes + ":");
        } else {
            System.out.print(this.minutes + ":");
        }
        if (this.seconds < 10) {
            System.out.print("0" + this.seconds + ":");
        } else {
            System.out.print(this.seconds);
        }
    }

    void ampm() {
        if (this.hours > 12) {
            int newHour = this.hours - 12;
            if (newHour < 10) {
                System.out.print("0" + this.hours + ":");
            } else {
                System.out.print(newHour + ":");
            }
            if (this.minutes < 10) {
                System.out.print("0" + this.minutes + ":");
            } else {
                System.out.print(this.minutes + ":");
            }
            if (this.seconds < 10) {
                System.out.print("0" + this.seconds + ":");
            } else {
                System.out.print(this.seconds);
            }
            System.out.print("PM");
        } else {
            print();
            System.out.print("AM");
        }
    }

    boolean valid() {
        if (this.hours > 24 || this.hours < 0) {
            return false;
        }
        if (this.minutes > 24 || this.minutes < 0) {
            return false;
        }
        if (this.seconds > 24 || this.seconds < 0) {
            return false;
        }
        return true;
    }

    void randomized() {
        Random random = new Random();
        this.hours = random.nextInt(0, 25);
        this.minutes = random.nextInt(0, 60);
        this.seconds = random.nextInt(0, 60);
    }

    boolean isMorning() {
        if (this.hours > 12 || this.hours < 8) {
            return false;
        }
        return true;
    }

    void tick() {
        this.seconds++;
        if (this.seconds == 60) {
            this.minutes++;
            this.seconds = 0;
        }
        if (this.minutes == 60) {
            this.hours++;
            this.seconds = 0;
            this.minutes = 0;
        }
        if (this.hours == 25) {
            this.hours = 1;
            this.minutes = 0;
            this.seconds = 0;
        }
    }

    int compare(Clock other) {
        if (this.hours == other.hours && this.minutes == other.minutes && this.seconds == other.seconds){
            return 0;

        }
        if (this.hours == other.hours && this.minutes == other.minutes) {
            if (this.seconds > other.seconds) {
                return 1;
            }
            return -1;
        }
        if (this.hours == other.hours){
            if (this.minutes > other.minutes){
                return 1;
            }
            return -1;
        }
        if (this.hours > other.hours){
            return 1;
        }
        return -1;
    }
    int secondsDiff (Clock other){
        int sum = 0;
        int result = compare(other);
        if (result == 0){
            return 0;
        }
        if (result== 1){
            int newHour =this.hours - other.hours;
            int newMinutes = this.minutes - other.minutes;
            int newSeconds = this.seconds - other.seconds;
            sum =newHour * 60 *60 + newMinutes *60 + newSeconds;
        } else {
            int newHour =other.hours - this.hours;
            int newMinutes = other.minutes - this.minutes;
            int newSeconds = other.seconds - this.seconds;
            sum =newHour * 60 *60 + newMinutes *60 + newSeconds;
        }
        return sum;
    }
    void addHours (int toAdd){
        int newHour =this.hours + toAdd;
        int newHour2= newHour % 24;
        if (newHour2 == 0){
            newHour2 = 24;
        }
        this.hours = newHour2;
    }
    void addMinutes (int toAdd){
        int newMinutes = this.minutes + toAdd;
        int newHours = newMinutes / 60;
        int newMinutes2 = newMinutes % 60;
        this.minutes = newMinutes2;
        addHours(newHours);
    }
    void addSeconds (int toAdd){
        int newSeconds = this.seconds + toAdd;
        int newHours = newSeconds / 60;
        int newMinutes2 = newSeconds % 60;
        this.minutes = newMinutes2;
        addMinutes(newSeconds);
    }
}
