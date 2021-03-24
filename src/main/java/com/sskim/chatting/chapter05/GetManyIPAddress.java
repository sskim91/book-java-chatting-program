package com.sskim.chatting.chapter05;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author sskim
 */
public class GetManyIPAddress {
    public static void main(String[] args) {
        // 5.2
        // Program argument에 추가 ex) www.naver.com
        if (args.length != 1) {
            System.out.println("호스트 이름을 입력하세요.");
            return;
        }
        try {
            InetAddress[] allByName = InetAddress.getAllByName(args[0]);
            String string = Arrays.toString(allByName);
            System.out.println("string = " + string);
        } catch (UnknownHostException e) {
            System.out.println("지정된 호스트를 찾을 수 없습니다.");
        }
    }
}
