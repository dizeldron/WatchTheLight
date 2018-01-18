
import java.awt.event.*;
import java.awt.*;
import java.util.logging.Handler;
import javax.swing.*;

public class GUI73 extends JFrame {
    private JPanel mousepanel;
    private JLabel statusBar;

    public GUI73() {
        super("Work with the mouse!!!");
        mousepanel = new JPanel();
        mousepanel.setBackground(Color.WHITE);
        add(mousepanel, BorderLayout.CENTER);
        statusBar = new JLabel("Status String");
        add(statusBar, BorderLayout.SOUTH);

        HandlerClass handler = new HandlerClass();
        mousepanel.addMouseListener(handler);
        mousepanel.addMouseMotionListener(handler);

    }

    private class HandlerClass implements MouseListener,MouseMotionListener{

        public void mouseClicked (MouseEvent event){
        statusBar.setText(String.format("You've clicked here %d, %d", event.getX(), event.getY()));
    }

    public void mousePressed(MouseEvent event) {
        statusBar.setText("You've pressed the mouse !!!");
    }

    public void mouseReleased(MouseEvent event) {
        statusBar.setText("You've unblocked the mouse !!!");
    }
    public void mouseEntered(MouseEvent event) {
        statusBar.setText("You've put the mouse in the window !!!");
        mousepanel.setBackground(Color.GREEN);
    }
    public void mouseExited(MouseEvent event) {
        statusBar.setText("You've put the mouse out the window !!!");
        mousepanel.setBackground(Color.WHITE);
}
public void mouseDragged(MouseEvent event){
            statusBar.setText("You drag the mouse");
}
public void mouseMoved(MouseEvent event){
    statusBar.setText("You move the mouse");
        }


}
}