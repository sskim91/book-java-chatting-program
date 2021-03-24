package com.sskim.chatting.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author sskim
 */
public class InetExample {
    public static void main(String[] args) {
        //5.6 지금까지 쓴 다양한 메서드
        String hostname;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        printLocalAddress();    //로컬 호스트의 이름 및 IP 주소 출력
        try {
            do {
                System.out.println("호스트 이름 및 IP주소를 입력하세요.");
                if ((hostname = br.readLine()) != null) {
                    printRemoteAddress(hostname);
                }

            } while (hostname != null);
            System.out.println("종료");
        } catch (IOException e) {
            System.out.println("입력 에러");
        }
    }

    private static void printLocalAddress() {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("로컬 호스트 이름: "+ localHost.getHostName());
            System.out.println("로컬 IP 주소: "+ localHost.getHostAddress());
            System.out.println("로컬 호스트 class: "+ ipClass(localHost.getAddress()));
            System.out.println("로컬 호스트 InetAddress: "+ localHost.toString());
        } catch (UnknownHostException e) {
            System.out.println("e = " + e);
        }
    }

    private static void printRemoteAddress(String hostname) {
        try {
            System.out.println("호스트를 찾고 있습니다. " + hostname + "...");
            InetAddress machine = InetAddress.getByName(hostname);
            System.out.println("원격 호스트 이름: " + machine.getHostName());
            System.out.println("원격 호스트 IP: " + machine.getHostAddress());
            System.out.println("원격 호스트 class: " + ipClass(machine.getAddress()));
            System.out.println("원격 호스트 InetAddress: " + machine.toString());
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }

    private static char ipClass(byte[] ip) {
        int highByte = 0xff & ip[0];
        if (highByte < 128) {
            return 'A';
        } else if (highByte < 192) {
            return 'B';
        } else if (highByte < 224) {
            return 'C';
        } else if (highByte < 240) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
