package uet.oop.bomberman.Entities.Tile.Item;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import uet.oop.bomberman.Board;
import uet.oop.bomberman.BombermanGame;

import static uet.oop.bomberman.Board.bombCount;


public class BombItem extends Item {
    private boolean Activatedated = false;

    public BombItem(int xUnit, int yUnit, Image img) {
        super(xUnit, yUnit, img);

    }

    public BombItem(int xUnit, int yUnit, Image img, int timeActivated, boolean activated) {
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
            bombCount++;
            BombermanGame.board.removeEntityAt(this.x, this.y);
            System.out.println(bombCount);
        }
    }
    @Override
    public void render(GraphicsContext gc) {
        if (!remove) super.render(gc);
    }
}













