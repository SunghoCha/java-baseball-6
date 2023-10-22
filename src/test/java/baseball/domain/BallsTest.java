package baseball.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallsTest {

    @Test
    void Balls_Balls비교_3스트라이크() {
        //given
        List<Integer> ballNumbers = Arrays.asList(4, 5, 6);
        Balls computerBalls = BallsFactory.createBalls(ballNumbers);
        Balls playerBalls = BallsFactory.createBalls(ballNumbers);
        //when
        Referee referee = computerBalls.play(playerBalls);
        //then
        assertThat(referee.getStrikeNumber()).isEqualTo(3);
        assertThat(referee.getBallNumber()).isEqualTo(0);
    }

    @Test
    void Balls_Balls비교_3볼() {
        //given
        List<Integer> computerNumbers = Arrays.asList(4, 5, 6);
        List<Integer> playerballNumbers = Arrays.asList(5, 6, 4);
        Balls computerBalls = BallsFactory.createBalls(computerNumbers);
        Balls playerBalls = BallsFactory.createBalls(playerballNumbers);
        //when
        Referee referee = computerBalls.play(playerBalls);
        //then
        assertThat(referee.getStrikeNumber()).isEqualTo(0);
        assertThat(referee.getBallNumber()).isEqualTo(3);
    }

    @Test
    void Balls_Balls비교_1스트라이크_2볼() {
        //given
        List<Integer> computerNumbers = Arrays.asList(4, 5, 6);
        List<Integer> playerballNumbers = Arrays.asList(4, 6, 5);
        Balls computerBalls = BallsFactory.createBalls(computerNumbers);
        Balls playerBalls = BallsFactory.createBalls(playerballNumbers);
        //when
        Referee referee = computerBalls.play(playerBalls);
        //then
        assertThat(referee.getStrikeNumber()).isEqualTo(1);
        assertThat(referee.getBallNumber()).isEqualTo(2);
    }

    @Test
    void Balls_Balls비교_낫싱() {
        //given
        List<Integer> computerNumbers = Arrays.asList(4, 5, 6);
        List<Integer> playerballNumbers = Arrays.asList(1, 2, 3);
        Balls computerBalls = BallsFactory.createBalls(computerNumbers);
        Balls playerBalls = BallsFactory.createBalls(playerballNumbers);
        //when
        Referee referee = computerBalls.play(playerBalls);
        //then
        assertThat(referee.getStrikeNumber()).isEqualTo(0);
        assertThat(referee.getBallNumber()).isEqualTo(0);
    }
}
