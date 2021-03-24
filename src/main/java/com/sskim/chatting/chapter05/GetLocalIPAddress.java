package com.sskim.chatting.chapter05;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author sskim
 */
public class GetLocalIPAddress {
    public static void main(String[] args) {
        //5.5 getAddress() 메서드를 이용해서 로컬 호스트의 IP 주소를 구한다.
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            byte[] address = localHost.getAddress();
            System.out.println("사용중인 호스트 IP 주소는");
            for (int i = 0; i < address.length; i++) {
                int unsigned = address[i] < 0 ? address[i] + 256 : address[i];
                System.out.print(unsigned + ".");
            }
            System.out.println();

        } catch (UnknownHostException e) {
            System.out.println("지정된 호스트를 찾을 수 없습니다.");
        }
    }
}
