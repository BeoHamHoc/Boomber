package uet.oop.bomberman.entities.character;

import javafx.scene.image.Image;
import uet.oop.bomberman.entities.Entity;

public abstract class MovingObj extends Entity {

    protected double speed;
    protected int left = 0;
    protected int right = 0;
    protected int up = 0;
    protected int down = 0;
    protected final int animate = 5;
    protected boolean alive = true;

    public MovingObj(int x, int y, Image img, double speed) {
        super(x, y, img);
        this.speed = speed;
    }

    public abstract void movingPlayer();

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    @Override
    public void update() {
        movingPlayer();
    }

    public abstract void moveRight();

    public abstract void moveLeft();

    public abstract void moveUp();

    public abstract void moveDown();

}