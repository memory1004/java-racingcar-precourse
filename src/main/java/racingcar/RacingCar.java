package racingcar;

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

    public void run() {
        incrementDistance();
    }

    private void incrementDistance() {
        this.distance++;
    }

    public void printDistance() {
        System.out.println(distance);
    }

    public int getDistance() {
        return distance;
    }
}
