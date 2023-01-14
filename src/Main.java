import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ex1
{
    Ex1() {}

    void start()
    {
        JFrame window = new JFrame();
        window.setSize(500, 500);
        window.setName("Name");
        window.setVisible(true);

        JButton button = new JButton();
        button.setSize(10, 10);

        window.add(button);// добавление компонента
    }
}

class Ex2 extends JFrame
{
    Ex2()
    {
        setSize(600, 600);
        setName("Name 2");
        setVisible(true);
    }
}

class Ex3
{
    Ex3()
    {

        JFrame window = new JFrame();
        window.setSize(500, 500);
        window.setName("Name");
        window.setVisible(true);

        JButton button = new JButton();
        button.setSize(10, 10);

        window.add(button);// добавление компонента

        MouseListener listener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Click");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };

        KeyListener listener1 = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("tap");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key " + e.getKeyChar());
                if (e.getKeyChar() == 's'){
                    System.out.println("Super");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };



    }
}

class Ex4 extends JFrame implements ActionListener
{
    Graphics g;
    Image img;

    Ex4()
    {
        setSize(500, 500);
        setVisible(true);

        g = getGraphics();
        img = new ImageIcon("path"/*путь к картинке */).getImage();
    }


    @Override
    public void paint(Graphics g) {
        g.drawString("String", 100, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}

class Ex5
{

}
public class Main {
    public static void main(String[] args) {

        //Ex1 ex1 = new Ex1();
        //ex1.start();

        //Ex2 ex2 = new Ex2();//окно создается само по причине наследования от JFrame

        //Ex4 ex4 = new Ex4();




    }
}
// руководство