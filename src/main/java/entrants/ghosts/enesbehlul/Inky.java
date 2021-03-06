package entrants.ghosts.enesbehlul;

import pacman.controllers.IndividualGhostController;
import pacman.game.Constants;
import pacman.game.Game;

/**
 * Created by Piers on 11/11/2015.
 */
public class Inky  extends  IndividualGhostController{

    GhostCommunication ghostCommunication;
    static int currentGhostLocation, pacmanLocation;

    public Inky() {
        super(Constants.GHOST.INKY);
        ghostCommunication = new GhostCommunication(Constants.GHOST.INKY);
    }

    @Override
    public Constants.MOVE getMove(Game game, long timeDue) {
        return ghostCommunication.getMove(game, timeDue);
    }
}
