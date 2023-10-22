package baseball.domain;

import java.util.List;

public class Referee {
    private int strikeNumber = 0;
    private int ballNumber = 0;

    public Referee(List<BallStatus> ballStatuses) {
        this.strikeNumber = (int) ballStatuses.stream()
                .filter(ballStatus -> ballStatus.equals(BallStatus.STRIKE))
                .count();

        this.ballNumber = (int) ballStatuses.stream()
                .filter(ballStatus -> ballStatus.equals(BallStatus.BALL))
                .count();
    }

    public int getStrikeNumber() {
        return strikeNumber;
    }

    public int getBallNumber() {
        return ballNumber;
    }

}
