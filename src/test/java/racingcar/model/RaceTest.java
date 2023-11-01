package racingcar.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RaceTest {

    @Test
    void Race_객체_생성_테스트() {
        Car c1 = new Car(new Name("a"));
        Car c2 = new Car(new Name("b"));

        Entry entry = new Entry();
        entry.join(c1);
        entry.join(c2);

        try {
            Race race = new Race(new Round(2), entry);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    void Race_객체_생성_실패() {
        // 엔트리 크기가 너무 작은 경우
        assertThrows(IllegalArgumentException.class, () -> {
            Entry entry = new Entry();
            Car c1 = new Car(new Name("a"));
            entry.join(c1);

            Race race = new Race(new Round(2), entry);
        });
    }
}