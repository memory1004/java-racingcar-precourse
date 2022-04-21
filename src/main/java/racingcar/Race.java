package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<RacingCar> racingCars;
    private int round;
    private Race() {

    }

    private Race(List<String> carNames, int round) {
        createRaceCar(carNames);
        this.round = round;
    }

    public static Race getIntance(List<String> carNames, int round) {
        return new Race(carNames, round);

    }

    private void createRaceCar(List<String> carNames) {
        this.racingCars = new ArrayList<>();
        for (String carName : carNames) {
            this.racingCars.add(RacingCar.getNewInstance(carName));
        }
    }

    public void start(){
        for (int i = 0; i < this.round; i++) {
            this.getRacingCars()
                    .forEach(RacingCar::start);
            System.out.println("=========");
        }
    }

    private List<RacingCar> getRacingCars() {
        return this.racingCars;
    }
}
