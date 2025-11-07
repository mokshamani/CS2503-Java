import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(5000)) {
            System.out.println("💻 Server started. Waiting for client connection...");

            Socket client = server.accept();
            System.out.println("✅ Client connected: " + client.getInetAddress());

            // Streams for communication
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in));

            String msgFromClient;
            String msgFromServer;

            System.out.println("🗨️ Chat started. Type your messages below:");

            while (true) {
                // Read from client
                msgFromClient = in.readLine();
                if (msgFromClient == null || msgFromClient.equalsIgnoreCase("exit")) {
                    System.out.println("🔴 Client disconnected.");
                    break;
                }
                System.out.println("Client: " + msgFromClient);

                // Send response
                System.out.print("Server: ");
                msgFromServer = serverInput.readLine();
                out.println(msgFromServer);

                if (msgFromServer.equalsIgnoreCase("exit")) {
                    System.out.println("🔴 Server closed the chat.");
                    break;
                }
            }

            client.close();
            server.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
