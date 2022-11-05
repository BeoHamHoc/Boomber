package uet.oop.bomberman.Entities.Tile.Item;
import javafx.scene.image.Image;
import uet.oop.bomberman.Entities.Entity;
public abstract class Item  extends Entity{
    protected int timeActivated = 1200;
    protected boolean activated = false;

    public Item(int xUnit, int yUnit, Image img) {
        super(xUnit, yUnit, img);
    }

    public Item(int xUnit, int yUnit, Image img, int timeActivated, boolean activated) {
        super(xUnit, yUnit, img);
        this.timeActivated = timeActivated;
        this.activated = activated;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
