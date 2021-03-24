package com.sskim.chatting.chapter06;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author sskim
 */
public class ProtocolTester {
    public static void main(String[] args) {
        //6.4
        //프로토콜 중에서 호스트가 사용하는 운영체제와 JVM의 버전에 따라 지원하는 프로토콜 및
        //지원하지 않는 프로토콜을 보여준다.

        String host = "www.naver.com";
        String file = "/root/";
        String[] protocols = {
                "http", "https", "ftp", "mailto", "telnet", "ldap", "gopher",
                "jdbc", "rmi", "jndi", "doc", "netdoc", "nfs", "verbatim", "finger", "daytime", "systemresource"
        };

        for (int i = 0; i < protocols.length; i++) {
            try {
                URL url = new URL(protocols[i], host, file);
                System.out.println(host + "는 " + protocols[i] + " 프로토콜을 지원한다.");
            } catch (MalformedURLException e) {
                System.out.println(host + "는 " + protocols[i] + " 프로토콜을 지원하지 않는다.");
            }
        }
    }
}
