import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Server extends JFrame{
    private JTextField userInputText;
    private JTextArea chatWindow;
    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;
    private ServerSocket serverSocket;
    private Socket connection;

    public Server(){
        super("Server ");
        userInputText = new JTextField();
        userInputText.setEditable(false);
        userInputText.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        sendMessage(e.getActionCommand());
                        userInputText.setText(" ");
                    }
                }
        );
        add(userInputText, BorderLayout.NORTH);
        chatWindow = new JTextArea();
        add(new JScrollPane(chatWindow));
        setSize(300,600);
        setVisible(true);
    }
    //настройка и запуск серверной части

    public void startServer(){
        try{
            serverSocket = new ServerSocket(777, 100);
            while (true){
                try{
                    waitForConnection();
                    setupStreams();
                    whileChating();
                }
                catch (EOFException eofException){
                    showMessage("\n Server interupted connection!!!");

                }finally {
                    closeConnection();
                }
            }
        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
    //ожидание соединения и отображение инфы о соединении
    private void waitForConnection()throws IOException{
        showMessage("Waiting for connection...\n");
        connection = serverSocket.accept();
        showMessage("Connected with \n" + connection.getInetAddress().getHostName());
    }
    //настройка потоков для отправки и получения данных
    private void setupStreams()throws IOException{
        outputStream = new ObjectOutputStream(connection.getOutputStream());
        outputStream.flush();
        inputStream = new ObjectInputStream(connection.getInputStream());
        showMessage("\n Stream installed.\n");
    }
    //обрвботка данных во время общения
    private void whileChating()throws IOException{
     String message = " You are online!!!";
     sendMessage(message);
     readyToType(true);
     do{
         try{
             message = (String) inputStream.readObject();
             showMessage("\n" + message);
         }

         catch (ClassNotFoundException classNotFoundException){
             showMessage("\nDo not understand what message user send");
         }
     }
     while( !message.equals("User - *"));
    }
    //Закрываем сокеты и потоки когда юзер начатился
    private void closeConnection(){
        showMessage("\n Closing Connection...");
        readyToType(false);
        try{
            outputStream.close();
            inputStream.close();
            connection.close();

        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
    //отправка сообщений клиенту

    private void sendMessage(String message){
        try{
            outputStream.writeObject("SERVER  - " + message);
            outputStream.flush();
            showMessage("\nSERVER  - \" + message");
        }
        catch (IOException ioException){
            chatWindow.append("\nERROR. Cannot send this message");

        }
    }
    //обновление окна чата
    private void showMessage(final String text){
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        chatWindow.append(text);

                    }
                }
        );
    }
    // установка прав на ввод данных
    private void readyToType(final boolean tof  ){
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        userInputText.setEditable(tof);
                    }
                }

        );
    }
}
