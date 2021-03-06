package com.radoslavhusar;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

import static java.lang.System.exit;
import static java.lang.System.out;

/**
 * @author Radoslav Husar
 */
public class NetworkInterfacesInspector {

    static {
        System.setProperty("java.net.preferIPv4Stack", "true");
    }

    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> ifaces = NetworkInterface.getNetworkInterfaces();
            for (NetworkInterface iface : Collections.list(ifaces)) {
                out.println("Display name: " + iface.getDisplayName());
                out.println("Name: " + iface.getName());
                for (InetAddress addr : Collections.list(iface.getInetAddresses())) {
                    out.println("InetAddress: " + addr);
                }
                out.println("MTU: " + iface.getMTU());
                out.println("Loopback?: " + iface.isLoopback());
                out.println("Up?: " + iface.isUp());
                out.println("PointToPoint?: " + iface.isPointToPoint());
                out.println("Virtual?: " + iface.isVirtual());
                out.println("Multicast?: " + iface.supportsMulticast());
                out.println();
            }
        } catch (SocketException e) {
            e.printStackTrace();
            exit(1);
        }
    }
}
