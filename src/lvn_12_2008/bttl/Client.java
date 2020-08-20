package lvn_12_2008.bttl;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {


    public static void main(String[] args) throws IOException {
        int port = 8300;
        String host = "localhost";
        DataInputStream in;
        DataOutputStream out;
        Socket socket;


        socket = new Socket(host, port);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        out.writeDouble(5);

        System.out.println(in.readDouble());
    }
}
