package com.sskim.chatting.chapter05;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author sskim
 */
public class GetHostInfoWindowMode extends Frame implements ActionListener {

    TextField hostname; //호스트 이름을 입력받는 필드
    Button getInfo; //입력된 호스트에 관한 IP 정보를 읽는 버튼
    TextArea display;   //구해진 IP에 관한 정보를 출력하는 필드

    public static void main(String[] args) {
        GetHostInfoWindowMode host = new GetHostInfoWindowMode("InetAddress 클래스");
        host.setVisible(true);
    }

    public GetHostInfoWindowMode(String title) {
        super(title);
        addWindowListener(new WinListener());
        setLayout(new BorderLayout());
        Panel inputpanel = new Panel(); // 첫 번째 패널
        inputpanel.setLayout(new BorderLayout());
        inputpanel.add("North", new Label("호스트 이름"));
        hostname = new TextField("", 30);

        getInfo = new Button("호스트 정보 얻기");
        inputpanel.add("Center", hostname);
        inputpanel.add("South", getInfo);
        getInfo.addActionListener(this);
        add("North", inputpanel);
        Panel outputpanel = new Panel();
        outputpanel.setLayout(new BorderLayout());
        display = new TextArea("", 24, 40);
        display.setEditable(false);
        outputpanel.add("North", new Label("인터넷 주소"));
        outputpanel.add("Center", display);
        add("Center", outputpanel);
        setSize(270, 200);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = hostname.getText();   //입력된 호스트 이름 구함
        try {
            InetAddress inet = InetAddress.getByName(name);
            String ip = inet.getHostName() + "\n";  //호스트 이름
            display.append(ip);
            ip = inet.getHostAddress() + "\n";  //호스트 IP 주소
            display.append(ip);
        } catch (UnknownHostException unknownHostException) {
            String ip = name + ": 해당 호스트가 없습니다.\n";
            display.append(ip);
        }
    }

    class WinListener extends WindowAdapter {
        public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
        }
    }

}
