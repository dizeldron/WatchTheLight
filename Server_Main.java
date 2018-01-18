import javax.swing.JFrame;

public class Server_Main {
    public static void main(String[] args) {

        Server iServer = new Server();
        iServer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iServer.startServer();
    }
}
