package com.alpha.work1;

import java.util.Objects;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;


    public Monitor(String serialNumber, String manufacturer, double price, int resolutionX, int resolutionY) {
        super(serialNumber, manufacturer, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }



    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "class=Monitor:" +
                ", serialNumber= " + this.getSerialNumber()+
                ", manufacturer= "+ this.getManufacturer() +
                ", price= "+ this.getPrice() +
                ", X= " + resolutionX +
                ", Y=" + resolutionY +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return getResolutionX() == monitor.getResolutionX() && getResolutionY() == monitor.getResolutionY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getResolutionX(), getResolutionY());
    }
}
