package NewRobot;

public class MoveRobot {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int attemptCounter = 1;
        int maxAttempt = 3;
        int endAttempts = maxAttempt++;
        while (attemptCounter <= maxAttempt) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                attemptCounter = endAttempts;
            } catch (RobotConnectionException e) {
                if (attemptCounter == maxAttempt) {
                    throw new RobotConnectionException("нет соединения");
                }
                attemptCounter++;
            }
        }
    }

}
