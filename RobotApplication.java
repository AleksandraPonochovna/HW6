package com.company;

public class RobotApplication {

    public static void main(String[] args) {
        RobotConnectionManager robotConnection = null;
        moveRobot(robotConnection, 4, 5);
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean check = false;
        for (int i = 1; !check && i <= 3; i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                check = true;
            } catch (RobotConnectionException ex) {
                if (i == 3) {
                    throw new RobotConnectionException("Close connection.");
                }
            } 
        }
    }
}

