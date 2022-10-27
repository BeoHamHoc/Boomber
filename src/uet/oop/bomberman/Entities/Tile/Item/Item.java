package uet.oop.bomberman.Entities.Tile.Item;
import javafx.scene.image.Image;
import uet.oop.bomberman.Entities.Entity;
public abstract class Item  extends Entity{
    protected int timeActive = 1200;
    protected boolean activated = false;

    public Item(int xUnit, int yUnit, Image img) {
        super(xUnit, yUnit, img);
    }

    public Item(int xUnit, int yUnit, Image img, int timeActive, boolean activated) {
        super(xUnit, yUnit, img);
        this.timeActive = timeActive;
        this.activated = activated;
    }

    public int getTimeActive() {
        return timeActive;
    }

    public void setTimeActive(int timeActive) {
        this.timeActive = timeActive;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
