import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Random;
import javax.swing.*;

public class PacMan extends JPanel {

    class Block{
        int x;
        int y;
        int width;
        int height;
        Image image;

        int startx;
        int startY;

        Block(Image image, int x, int y, int height, int width){
            this.image=image;
            this.x=x;
            this.y=y;
            this.height=height;
            this.width=width;
            this.startx=x;
            this.startY=y;
        }

    }
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

    //X = wall, O = skip, P = pac man, ' ' = food
    //Ghosts: b = blue, o = orange, p = pink, r = red
    private String[] tileMap = {
        "XXXXXXXXXXXXXXXXXXX",
        "X        X        X",
        "X XX XXX X XXX XX X",
        "X                 X",
        "X XX X XXXXX X XX X",
        "X    X       X    X",
        "XXXX XXXX XXXX XXXX",
        "OOOX X       X XOOO",
        "XXXX X XXrXX X XXXX",
        "O       bpo       O",
        "XXXX X XXXXX X XXXX",
        "OOOX X       X XOOO",
        "XXXX X XXXXX X XXXX",
        "X        X        X",
        "X XX XXX X XXX XX X",
        "X  X     P     X  X",
        "XX X X XXXXX X X XX",
        "X    X   X   X    X",
        "X XXXXXX X XXXXXX X",
        "X                 X",
        "XXXXXXXXXXXXXXXXXXX" 
    };

    HashSet<Block> walls;
    HashSet<Block> foods;
    HashSet<Block> ghosts;
    Block pacman;

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

    public void loadMap(){
        walls = new HashSet<Block>();
        foods = new HashSet<Block>();
        ghosts = new HashSet<Block>();

    }
}
