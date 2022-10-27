package uet.oop.bomberman.Entities.Tile.Item;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import uet.oop.bomberman.Board;
import uet.oop.bomberman.BombermanGame;


public class SpeedItem extends Item {
    private boolean active = false;

    public SpeedItem(int xUnit, int yUnit, Image img) {
        super(xUnit, yUnit, img);
    }

    public SpeedItem(int xUnit, int yUnit, Image img, int timeActive, boolean activated) {
        super(xUnit, yUnit, img, timeActive, activated);
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public void update() {

        if (active) {
            remove = true;
            Board.getPlayer().setSpeed(Board.getPlayer().getSpeed()+0.005);
            BombermanGame.board.removeEntityAt(this.x, this.y);
        }
    }
    public void render(GraphicsContext gc) {
        if (!remove) super.render(gc);
    }
}


