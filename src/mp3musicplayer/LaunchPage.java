
package mp3musicplayer;


import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;

public class LaunchPage implements ActionListener
{
    public static final Color FRAME_COLOR = Color.BLACK;
    public static final Color TEXT_COLOR = Color.WHITE;

    JFrame frame= new JFrame();
    JButton startButton = new JButton("Get started");
    JLabel launchImg = new JLabel(loadImage1("src/assets/4943330.png"));
    ImageIcon img = new ImageIcon("src/assets/multimedia.png");

    LaunchPage()
    {
        startButton.setBounds(250,500,200,40);
        startButton.setFocusable(false);
        startButton.addActionListener(this);


        JLabel welcome =new JLabel("Welcome to the music playlist manager!");
        welcome.setBounds(100, 400, 500, 30);
        welcome.setFont(new Font("Serif", Font.ITALIC, 24));
        welcome.setForeground(TEXT_COLOR);
        welcome.setHorizontalAlignment(SwingConstants.CENTER);


        launchImg.setBounds(200,50,300,300);

        frame.setTitle("Music Playlist Manager");
        frame.add(startButton);
        frame.add(welcome);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.getContentPane().setBackground(FRAME_COLOR);
        frame.setVisible(true);
        frame.add(launchImg);
        frame.setIconImage(img.getImage());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == startButton)
        {
            frame.dispose();

            new MusicPlayerGUI().setVisible(true);
        }
    }

    private ImageIcon loadImage1(String imagePath){
        try{
            // read the image file from the given path
            BufferedImage image = ImageIO.read(new File(imagePath));

            // returns an image icon so that our component can render the image
            return new ImageIcon(image);
        }catch(Exception e){
            e.printStackTrace();
        }

        // could not find resource
        return null;
    }
}