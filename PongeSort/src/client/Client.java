/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manduca.fabio
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String caratteri = "qwertyuiopsdfghjklzxcvbnm";
        char[]a = new char[10];
        
        for (int i = 0; i < 10; i++) {
            a[i]=caratteri.charAt((int) (Math.random() * 20));
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
        
        try {
            
            
            Socket server = new Socket("127.0.0.1", 5500);
            PrintWriter out = new PrintWriter(server.getOutputStream(), true);
            
            BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));
 
           out.println(a[0]);
            
            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
   
    
}
