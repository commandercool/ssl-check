import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class SSLCheck {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java -cp . SSLCheck <host> <port>");
            System.exit(1);
        }

        String hostname = args[0];
        int port = Integer.parseInt(args[1]);

        System.out.println("About to connect to '" + hostname + "' on port " + port);

        SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();

        try (SSLSocket sslsocket = (SSLSocket) sslsocketfactory.createSocket(hostname, port)) {
            sslsocket.startHandshake();
            System.out.println("Successfully connected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
