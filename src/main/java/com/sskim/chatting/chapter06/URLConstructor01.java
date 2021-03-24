package com.sskim.chatting.chapter06;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author sskim
 */
public class URLConstructor01 {
    public static void main(String[] args) {
        URL webURL, ftpURL, ldapURL;

        try {
            webURL = new URL("http://www.ssc.ac.kr/index.html");
            System.out.println("webURL = " + webURL);
            ftpURL = new URL("ftp://www.ssc.ac.kr/public");
            System.out.println("ftpURL = " + ftpURL);
            ldapURL = new URL("ldap://www.ssc.ac.kr/"); //예외 발생
            System.out.println("ldapURL = " + ldapURL);

            //결과
            //webURL = http://www.ssc.ac.kr/index.html
            //ftpURL = ftp://www.ssc.ac.kr/public
            //지정된 URL 못찾음
        } catch (MalformedURLException e) {
            System.out.println("지정된 URL 못찾음");
        }
    }
}
