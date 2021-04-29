/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manduca.fabio
 */
public class Serverr implements Runnable {



    public Serverr(Socket clientSocket) {
       
    }
            
    public static void main(String[] args) {
        try {
            
            ServerSocket server = new ServerSocket(5500);
            Socket clientSocket = server.accept();

            System.out.println("partito");
  
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println(in.readLine());
            
            
        } catch (IOException ex) {
            Logger.getLogger(Serverr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
