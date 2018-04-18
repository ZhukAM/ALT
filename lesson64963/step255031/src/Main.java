interface Moveable {

    void move(float dx, float dy);
}

interface Scalable {

    void scale(float factor);
}

interface MutableShape extends Moveable, Scalable {}

final class Circle implements MutableShape {
    private float centerX;
    private float centerY;
    private float radius;

    public Circle(float centerX, float centerY, float radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public float getCenterX() {
        return centerX;
    }

    public float getCenterY() {
        return centerY;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public void move(float dx, float dy) {
        centerX += dx;
        centerY += dy;
    }

    @Override
    public void scale(float factor) {
        radius *= factor;
    }
}

final class Rectangle implements MutableShape {
    private float x;
    private float y;
    private float width;
    private float height;

    public Rectangle(float x, float y, float w, float h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void scale(float factor) {
        width *= factor;
        height *= factor;
    }
}