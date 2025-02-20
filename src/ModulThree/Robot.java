package ModulThree;

public class Robot {
    int x;
    int y;
    Direction dir;

    public Robot(int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public static int findDifference(int first, int second) {
        int difference = Math.abs(first - second);
        return difference;
    }

    public Direction getDirection() {
        return dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        if (dir == Direction.UP) {
            dir = Direction.LEFT;
        } else if (dir == Direction.DOWN) {
            dir = Direction.RIGHT;
        } else if (dir == Direction.LEFT) {
            dir = Direction.DOWN;
        } else if (dir == Direction.RIGHT) {
            dir = Direction.UP;
        }
    }

    public void turnRight() {
        if (dir == Direction.UP) {
            dir = Direction.RIGHT;
        } else if (dir == Direction.DOWN) {
            dir = Direction.LEFT;
        } else if (dir == Direction.LEFT) {
            dir = Direction.UP;
        } else if (dir == Direction.RIGHT) {
            dir = Direction.DOWN;
        }
    }

    public void stepForward() {
        if (dir == Direction.UP) {
            y++;
        }
        if (dir == Direction.DOWN) {
            y--;
        }
        if (dir == Direction.LEFT) {
            x--;
        }
        if (dir == Direction.RIGHT) {
            x++;
        }
    }

    public void turn(Robot robot, Direction direction) {
        while (getDirection() != direction) {
            turnRight();
        }

    }

    public void go(Robot robot, int difference) {
        for (int i = 0; i < difference; i++) {
            robot.stepForward();
        }
    }


}
