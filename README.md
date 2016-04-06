Network Interfaces Inspector
============================

Prints out basic information about all interfaces, especially to find out the interfaces' MTUs.

Usage:

        mvn compile exec:java

or

        mvn compile exec:java -Djava.net.preferIPv4Stack=true
        

Example output:

        Display name: utun0
        Name: utun0
        InetAddress: /fdb3:cb92:fcee:8e94:ecc4:e18e:a8b4:74c7
        InetAddress: /fe80:0:0:0:ecc4:e18e:a8b4:74c7%utun0
        MTU: 1380

        Display name: awdl0
        Name: awdl0
        InetAddress: /fe80:0:0:0:24da:b6ff:feaf:2e44%awdl0
        MTU: 1484

        Display name: utun1
        Name: utun1
        InetAddress: /10.36.7.93
        MTU: 1280

        Display name: en0
        Name: en0
        InetAddress: /fe80:0:0:0:3636:3bff:fed3:e8c0%en0
        InetAddress: /10.200.69.75
        MTU: 1500

        Display name: lo0
        Name: lo0
        InetAddress: /fe80:0:0:0:0:0:0:1%lo0
        InetAddress: /0:0:0:0:0:0:0:1
        InetAddress: /127.0.0.1
        MTU: 16384

Enjoy.