package Classes.Q2;

public class SmartPhone {
    private int year;
    private float battery;
    private int chargingMinutes;
    private int [] counter = new int[3];

    void setYear(int year) {
        this.year = year;
    }

    boolean needsCharging() {
        if (battery <= 15) {
            return true;
        }
        return false;
    }

    boolean isBatteryFull() {
        if (battery == 100) {
            return true;
        }
        return false;
    }

    boolean isNewPhone() {
        if (year >= 2021) {
            return true;
        }
        return false;
    }

    boolean charge(int minutes) {
        float chargeTime = 0;
        if (isBatteryFull()) {
            return false;
        }
        if (year == 2024) {
            for (int i = 0; i < minutes; i++) {
                chargeTime++;
                if (!isBatteryFull()) {
                    battery = battery + chargeTime;
                }
                if (isBatteryFull()) {
                    return true;
                }
            }
        } else if (year >= 2021) {
            for (int i = 0; i < minutes; i++) {
                chargeTime += 0.75f;
                if (!isBatteryFull()) {
                    this.battery += chargeTime;
                }
                if (isBatteryFull()) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < minutes; i++) {
                chargeTime += 0.5f;
                if (!isBatteryFull()) {
                    this.battery += chargeTime;
                }
                if (isBatteryFull()) {
                    return false;
                }
            }
        }
        return true;

    }

    public String toString() {
        String newOld = "old";
        if (isNewPhone()) {
            newOld = "true";
        }
        return "the phone is " + newOld + " and got charge for " + this.chargingMinutes + " minutes , and the phone has " + battery + " presents";
    }

    boolean startApp(String app, int minutes) {
        float batteryPresents = 0f;
        if (minutes * batteryPresents <= this.battery) {
            for (int i = 0; i < minutes; i++) {
                if (app.equals("waze")) {
                    batteryPresents += 1.2f;
                    this.battery -= batteryPresents;
                } else if (app.equals("gmail")) {
                    batteryPresents += 0.3f;
                    this.battery -= batteryPresents;

                } else if (app.equals("instagram")) {
                    batteryPresents += 0.5f;
                    this.battery -= batteryPresents;
                } else {
                    batteryPresents += 1;
                    this.battery -= batteryPresents;
                }
                return true;
            }
        }
        return false;

    }

}