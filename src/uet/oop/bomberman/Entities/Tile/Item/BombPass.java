package uet.oop.bomberman.Entities.Tile.Item;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import uet.oop.bomberman.Board;
import uet.oop.bomberman.BombermanGame;


public class BombPass extends Item {
    private boolean activated = false;

    public BombPass(int xUnit, int yUnit, Image img) {
        super(xUnit, yUnit, img);

    }

    public BombPass(int xUnit, int yUnit, Image img, int timeActivated, boolean activated) {
        super(xUnit, yUnit, img, timeActivated, activated);
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    @Override
    public void update() {

        if (activated) {
            remove = true;
            Board.bombPass = true;
            BombermanGame.board.removeEntityAt(this.x, this.y);
        }
    }
    @Override
    public void render(GraphicsContext gc) {
        if (!remove) super.render(gc);
    }
}













