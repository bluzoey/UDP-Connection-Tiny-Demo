import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class UDPA {
    public static void main(String[] args) throws IOException {
        byte[] bs="a send to b".getBytes();
        InetAddress desIp=InetAddress.getLocalHost();
        DatagramPacket p=new DatagramPacket(bs,bs.length,desIp,10010);
        DatagramSocket socket_A=new DatagramSocket(10086);
        socket_A.send(p);
        socket_A.close();
    }
}
