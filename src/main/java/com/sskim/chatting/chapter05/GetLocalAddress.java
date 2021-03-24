package com.sskim.chatting.chapter05;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author sskim
 */
public class GetLocalAddress {
    public static void main(String[] args) {
        //5.3
        //현재 프로그램이 실행되는 로컬 호스트의 IP주소를 출력
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("localHost = " + localHost);
        } catch (UnknownHostException e) {
            System.out.println("지정된 호스트를 찾을 수 없습니다.");
        }

    }
}
