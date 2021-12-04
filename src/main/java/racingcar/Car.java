package racingcar;

import java.util.Arrays;

public class Car {
    private static final char POSITION_BAR = '-';
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void goForward() {
        position++;
    }

    public String showPosition() {
        char[] positionBars = new char[position];
        Arrays.fill(positionBars, POSITION_BAR);
        String currentPosition = new String(positionBars);

        return name + SystemMessage.COLON + currentPosition;
    }
}
