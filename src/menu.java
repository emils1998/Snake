/**
 * Created by scem14 on 2017-05-12.
 */
import javax.swing.*;
import java.util.*;
public class menu {
    public static void main(String[] args) {
        class Game1 extends JFrame
        public static Display f = new Display();
        {
            public Game1() {
                Game1.f.setSize(1000, 750);
                Game1.f.setResizable(false);
                Game1.f.setVisible(true);
                Game1.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Game1.f.setTitle("Online First Person Shooter");

                ImageIcon image = new ImageIcon("C:\\Users\\scem14\\IdeaProjects\\Snake\\src\\newButon.png");
                JLabel imageLabel = new JLabel(image);
                imageLabel.setBounds(10, 10, 400, 400);
                imageLabel.setVisible(true);

                Game1.f.add(imageLabel);
        }
        }
        class Display extends JFrame
        {
        }
    }
}
