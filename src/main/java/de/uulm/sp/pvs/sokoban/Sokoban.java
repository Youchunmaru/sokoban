package de.uulm.sp.pvs.sokoban;

import de.uulm.sp.pvs.exceptions.SokobanException;
import de.uulm.sp.pvs.util.*;


/**
 * @author Samuel Gröner
 *
 * */
public class Sokoban extends SokobanLevel{


    public Sokoban(String path) throws SokobanException {
        super(path);
    }

    /**
     * handles movement according to given command input or ends the game
     * if the player used the according input
     * @param command the command input of the player
     * @return true if player doesnt want to end the game
     * */
    public boolean command(String command){

        switch (command){
            case "N":
                this.move(Direction.NORTH);
                break;
            case "E":
                this.move(Direction.EAST);
                break;
            case "S":
                this.move(Direction.SOUTH);
                break;
            case "W":
                this.move(Direction.WEST);
                break;
            case "X":
                System.out.println("Bye");
                return false;
            default:
                System.err.println("undefined input!");
        }
        return true;
    }
}
