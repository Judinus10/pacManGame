import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Random;
import javax.swing.*;

public class PacMan extends JPanel {
    private int rowCount = 21;
    private int colCount = 19;
    private int tileSize = 32;
    private int boardWidth = colCount * tileSize;
    private int boardHeight = rowCount * tileSize;

    private Image wallImage;
    private Image blueGhostImage;
    private Image orangeGhostImage;
    private Image pinkGhostImage;
    private Image redGhostImage;

    private Image pacmanUp;
    private Image pacmanDown;
    private Image pacmanRight;
    private Image pacmanLeft;

    PacMan() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLACK);

        //load images
        wallImage = new ImageIcon(getClass().getResource("assets/wall.png")).getImage();
        blueGhostImage = new ImageIcon(getClass().getResource("assets/blueGhost.png")).getImage();
        orangeGhostImage = new ImageIcon(getClass().getResource("assets/orangeGhost.png")).getImage();
        redGhostImage = new ImageIcon(getClass().getResource("assets/redGhost.png")).getImage();
        pinkGhostImage = new ImageIcon(getClass().getResource("assets/pinkGhost.png")).getImage();

        pacmanUp = new ImageIcon(getClass().getResource("assets/pacmanUp.png")).getImage();
        pacmanDown = new ImageIcon(getClass().getResource("assets/pacmanDown.png")).getImage();
        pacmanLeft = new ImageIcon(getClass().getResource("assets/pacmanLeft.png")).getImage();
        pacmanRight = new ImageIcon(getClass().getResource("assets/pacmanRight.png")).getImage();

    }
}
