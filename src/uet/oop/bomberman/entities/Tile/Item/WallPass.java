package uet.oop.bomberman.entities.Tile.Item;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import uet.oop.bomberman.Board;
import uet.oop.bomberman.BombermanGame;


public class WallPass extends Item {
    private boolean active = false;

    public WallPass(int xUnit, int yUnit, Image img) {
        super(xUnit, yUnit, img);

    }

    public WallPass(int xUnit, int yUnit, Image img, int timeActive, boolean activated) {
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
            Board.wallPass = true;
            BombermanGame.board.removeEntityAt(this.x, this.y);
        }
    }
    @Override
    public void render(GraphicsContext gc) {
        if (!remove) super.render(gc);
    }
}













