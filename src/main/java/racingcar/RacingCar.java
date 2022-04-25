package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingCar {
    private String name;
    private int totalDistance;

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

    public void start() {
        incrementDistance(Randoms.pickNumberInRange(0, 9));
        printDistance();
    }

    private void incrementDistance(int distance) {
        if (validationGeneratedDistance(distance)) {
            this.totalDistance += distance;
        }
    }

    private boolean validationGeneratedDistance(int distance) {
        return distance >= 4;
    }

    public void printDistance() {
        System.out.println(getName()+" : ");
        for (int i = 0; i < getTotalDistance(); i++) {
            System.out.print("-");
        }
        System.out.println("");
    }

    public int getTotalDistance() {
        return totalDistance;
    }
}
