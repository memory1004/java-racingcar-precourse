package racingcar;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class RacingCarTest {

    @ParameterizedTest
    @DisplayName("자동차의 이름 설정 및 호출")
    @ValueSource(strings = {"hyundai", "genesis", "kia", "bmw", "benz", "audi"})
    void getName(String carName) {
        assertThat(RacingCar.getNewInstance(carName).getName()).isEqualTo(carName);
    }
}