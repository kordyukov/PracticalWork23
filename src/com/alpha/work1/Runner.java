package com.alpha.work1;

public class Runner {
    public void run() {
        Device device = new Device();
        System.out.println(device + "\n");
        PrintDevices(CreateDevices());
//        System.out.println(equals(device));
//        System.out.println(device.hashCode());;

    }

    public Device[] CreateDevices() {
        return new Device[]{new EthernetAdapter("1234", "Assus", 150.15, 150, "2506"),
                new EthernetAdapter("3453", "D-Link", 200, 100, "5438"),
                new Monitor("2133", "Dell", 500.00, 1000, 2000),
                new Monitor("4323", "Samsung", 456, 1500, 2500)};
    }
    public void PrintDevices(Device[] device) {
        for (Device device1:device) {
            System.out.println(device1+"hashcode = "+ device1.hashCode()+"equals - " + device1.equals(device));
        }
//         for (int i = 0;i<device.length;i++){
//             System.out.println(device[i]);
//         }
    }


}

