package com.sskim.chatting.chapter06;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author sskim
 */
public class ReadSourceFile {
    public static void main(String[] args) {
        //6.6
        String line;
        URL url;
        if (args.length > 0) {
            try {
                url = new URL(args[0]);
                System.out.println("url = " + url);
                InputStream is = url.openStream();
                Reader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
