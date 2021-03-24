package com.sskim.chatting.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

/**
 * @author sskim
 */
public class GetNameAddress {
    public static void main(String[] args) {
        //5.4
        String hostname;
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("호스트 이름을 입력하세요.");

        try {
            if ((hostname = br.readLine()) != null) {
                InetAddress address = InetAddress.getByName(hostname);
                System.out.println("호스트 이름은 " + address.getHostName());
                System.out.println("IP 주소는 " + address.getHostAddress());
            }
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("로컬 호스트 이름: "+ localHost.getHostName());
            System.out.println("로컬 IP 주소: "+ localHost.getHostAddress());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
