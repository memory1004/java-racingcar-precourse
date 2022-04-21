package racingcar;

public class RacingCar {
    private String name;
    private int distance;

    private RacingCar() {
    }

    private RacingCar(String name) {
        this.name = name;
    }

    public static RacingCar getNewInstance(String name) {
        return new RacingCar(name);
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
