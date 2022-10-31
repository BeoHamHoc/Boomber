package uet.oop.bomberman.Entities.Tile.Item;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import uet.oop.bomberman.Board;
import uet.oop.bomberman.BombermanGame;


public class SpeedItem extends Item {
    private boolean activated = false;

    public SpeedItem(int xUnit, int yUnit, Image img) {
        super(xUnit, yUnit, img);
    }

    public SpeedItem(int xUnit, int yUnit, Image img, int timeActivated, boolean activated) {
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
            Board.getPlayer().setSpeed(Board.getPlayer().getSpeed()+0.001);
            BombermanGame.board.removeEntityAt(this.x, this.y);
            System.out.println(Board.getPlayer().getSpeed());
        }
    }
    public void render(GraphicsContext gc) {
        if (!remove) super.render(gc);
    }
}


