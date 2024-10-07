package org.example;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {



        try {
            //remote socket
            //request to the server
            Socket socket = new Socket("localhost",3000);
            String massage ="Hi I'm from client";
            DataOutputStream dataOutputStream= new DataOutputStream(socket.getOutputStream());

            dataOutputStream.writeUTF(massage);
            dataOutputStream.flush();
            //send the data




            //close

            socket.close();






        }catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}