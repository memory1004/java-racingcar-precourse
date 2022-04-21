package racingcar;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class RacingCarTest {

    @ParameterizedTest
    @DisplayName("자동차의 이름 설정 및 호출")
    @ValueSource(strings = {"kia,bmw,benz,audi"})
    void checkCarnameTest(String carNames) {
        String [] carArray = carNames.split(",");
        for (String carName : carArray) {
            assertThat(RacingCar.getNewInstance(carName).getName()).isEqualTo(carName);
        }
    }

    @ParameterizedTest
    @DisplayName("자동차의 이름 설정 및 호출")
    @ValueSource(strings = {"hyundai,genesis"})
    void validationCarnameTest(String carNames) {
        String [] carArray = carNames.split(",");
        for (String carName : carArray) {
            assertThatThrownBy(()-> RacingCar.getNewInstance(carName))
                    .isExactlyInstanceOf(IllegalArgumentException.class);
        }
    }
}