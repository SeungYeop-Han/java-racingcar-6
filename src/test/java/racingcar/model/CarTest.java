package racingcar.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void Car_객체_생성_테스트() {
        try {
            Car car = new Car(new Name("픽업 트럭"));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    void Car_객체_생성_실패() {
        assertThrows(IllegalArgumentException.class, () -> {
            Car car = new Car(null);
        });
    }

    @Test
    void getMyName_테스트() {
        Car c1 = new Car(new Name("픽업 트럭"));
        Car c2 = new Car(new Name("스포츠 카"));
        Car c3 = new Car(new Name("자전거"));

        assertEquals(c1.getMyName(), "픽업 트럭");
        assertEquals(c2.getMyName(), "스포츠 카");
        assertEquals(c3.getMyName(), "자전거");
    }
}