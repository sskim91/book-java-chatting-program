package com.sskim.chatting.chapter06;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author sskim
 */
public class GetURLFields {
    public static void main(String[] args) {
        //6.5
        //명령어 인수로 주어진 모든 URL 문자열에 대하여 URL 객체를 생성
        //프로토콜, 호스트, 포트번호, 파일이름, 및 파일 내 참조위치를 화면에 출력
        //http://www.ssc.ac.kr:80/index.html
        for (int i = 0; i < args.length; i++) {
            try {
                URL url = new URL(args[i]);
                System.out.println("url = " + url);
                System.out.println("url.getProtocol() = " + url.getProtocol());
                System.out.println("url.getHost() = " + url.getHost());
                System.out.println("url.getPort() = " + url.getPort());
                System.out.println("url.getFile() = " + url.getFile());
                System.out.println("url.getRef() = " + url.getRef());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }
}
