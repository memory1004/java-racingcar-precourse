package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingCar {
    private String name;
    private int distance;

    private RacingCar() {
    }

    private RacingCar(String name) {
        validationCarname(name);
        this.name = name;
    }

    public static RacingCar getNewInstance(String name) {
        return new RacingCar(name);
    }

    private void validationCarname(String carname) {
        if (carname == null) {
            throw new IllegalArgumentException("null일수 없음");
        }

        if (carname.length() > 5) {
            throw new IllegalArgumentException("5글자 초과");
        }
    }

    public String getName() {
        return name;
    }

    public void race() {
        incrementDistance(Randoms.pickNumberInRange(0, 9));
    }

    private void incrementDistance(int distance) {
        if (validationGeneratedDistance(distance)) {
            this.distance += distance;
        }
    }

    private boolean validationGeneratedDistance(int distance) {
        return distance >= 4;
    }

    public void printDistance() {
        System.out.println(getName() + ":" + getDistance());
    }

    public int getDistance() {
        return distance;
    }
}
