package com.mycompany.ftp.project.a1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12
 */


import javax.swing.JFrame;

public class FTP_App {
           
    public static void main(String[] args) {
        FTP_Client frame = new FTP_Client();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
