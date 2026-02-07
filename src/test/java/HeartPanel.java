import javax.swing.*;
import java.awt.*;

public class HeartPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for smoother drawing
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Define heart color
        g2d.setColor(Color.RED);

        // Calculate dimensions and position
        int width = getWidth();
        int height = getHeight();
        int heartSize = Math.min(width, height) / 2; // Adjust size as needed
        int x = (width - heartSize) / 2;
        int y = (height - heartSize) / 2;

        // Draw the two upper circles
        g2d.fillOval(x, y, heartSize / 2, heartSize / 2);
        g2d.fillOval(x + heartSize / 2, y, heartSize / 2, heartSize / 2);

        // Draw the lower triangle
        int[] triangleX = {x, x + heartSize, x + heartSize / 2};
        int[] triangleY = {y + heartSize / 4, y + heartSize / 4, y + heartSize};
        g2d.fillPolygon(triangleX, triangleY, 3);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Heart Sign");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new HeartPanel());
        frame.setVisible(true);
    }
}