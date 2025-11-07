import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("✅ Connected to server: " + socket.getInetAddress());

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader clientInput = new BufferedReader(new InputStreamReader(System.in));

            String msgFromServer;
            String msgFromClient;

            System.out.println("🗨️ Chat started. Type your messages below:");

            while (true) {
                // Send message to server
                System.out.print("Client: ");
                msgFromClient = clientInput.readLine();
                out.println(msgFromClient);

                if (msgFromClient.equalsIgnoreCase("exit")) {
                    System.out.println("🔴 Client closed the chat.");
                    break;
                }

                // Receive message from server
                msgFromServer = in.readLine();
                if (msgFromServer == null) {
                    System.out.println("🔴 Server disconnected.");
                    break;
                }
                System.out.println("Server: " + msgFromServer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
