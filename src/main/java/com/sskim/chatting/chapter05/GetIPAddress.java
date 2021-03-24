package com.sskim.chatting.chapter05;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author sskim
 */
public class GetIPAddress {
    public static void main(String[] args) {
        // 5.1
        // Program argument에 추가 ex) www.ssc.ac.kr
        if (args.length != 1) {
            System.out.println("호스트 이름을 입력하세요.");
            return;
        }
        try {
            InetAddress address = InetAddress.getByName(args[0]);
            System.out.println("address = " + address);
        } catch (UnknownHostException e) {
            System.out.println("지정된 호스트를 찾을 수 없습니다.");
        }
    }
}
