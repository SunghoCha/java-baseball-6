package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class BallsFactory {


    public static Balls createBalls(List<Integer> ballNumbers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < ballNumbers.size(); i++) {
            balls.add(new Ball(new Position(i + 1), new BallNumber(ballNumbers.get(i))));
        }
        return new Balls(balls);
    }
}
