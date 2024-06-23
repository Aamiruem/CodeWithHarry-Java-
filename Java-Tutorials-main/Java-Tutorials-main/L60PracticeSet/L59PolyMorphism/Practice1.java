abstract class Pen {
    // Abstract method for writing
    abstract void write();

    // Abstract method for refilling
    abstract void refill();
}
class BallPointPen extends Pen {
    @Override
    void write() {
        System.out.println("Writing with a ballpoint pen...");
    }

    @Override
    void refill() {
        System.out.println("Refilling the ballpoint pen...");
    }
}

class FountainPen extends Pen {
    @Override
    void write() {
        System.out.println("Writing with a fountain pen...");
    }

    @Override
    void refill() {
        System.out.println("Refilling the fountain pen...");
    }
}

public class  {
    public static void main(String[] args) {
        Pen ballPointPen = new BallPointPen();
        ballPointPen.write();
        ballPointPen.refill();

        Pen fountainPen = new FountainPen();
        fountainPen.write();
        fountainPen.refill();
    }
}
