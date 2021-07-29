package com.alpha.work1;

import java.util.Objects;

public class EthernetAdapter extends Device{
    private int speed;
    private String mac;


    public EthernetAdapter(String serialNumber, String manufacturer, double price, int speed, String mac) {
        super(serialNumber, manufacturer, price);
        this.speed = speed;
        this.mac = mac;
    }

    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "class=EthernetAdapter:" +
                ", serialNumber= " + this.getSerialNumber() +
                ", manufacturer= " + this.getManufacturer() +
                ", price= " + this.getPrice() +
                ", speed= " + speed +
                ", mac='" + mac + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter)) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return getSpeed() == that.getSpeed() && getMac().equals(that.getMac());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpeed(), getMac());
    }
}
