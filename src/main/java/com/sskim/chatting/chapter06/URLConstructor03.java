package com.sskim.chatting.chapter06;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author sskim
 */
public class URLConstructor03 {
    public static void main(String[] args) {
        URL u1, u2;

        try {
            u1 = new URL("http://www.ssc.ac.kr/index.html");
            u2 = new URL(u1, "haksa.html");
            System.out.println("u1 = " + u1);
            System.out.println("u2 = " + u2);

            //결과
            //u1 = http://www.ssc.ac.kr/index.html
            //u2 = http://www.ssc.ac.kr/haksa.html
        } catch (MalformedURLException e) {
            System.out.println("지정된 URL 못찾음");
        }
    }
}
