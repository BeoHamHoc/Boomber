package uet.oop.bomberman.Entities.Tile.Item;

import javafx.scene.image.Image;
import uet.oop.bomberman.Board;
import uet.oop.bomberman.BombermanGame;

public class Portal extends Item {

    private boolean activated = false;

    public boolean getActivated() {
        return this.activated;
    }
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public Portal(int x, int y, Image img) {
        super(x, y, img);
        remove = false;
    }

    /**
     * Tạo cổng qua màn, chỉ qua màn khi win
     */
    @Override
    public void update() {

        if (BombermanGame.board.getEnemies().size() == 0) {
            activated = true;
        }
        if (activated) {
            Board.map[(int) this.y][(int) this.x] = ' ';
        } else {
            Board.map[(int) this.y][(int) this.x] = '#';
        }
    }
}