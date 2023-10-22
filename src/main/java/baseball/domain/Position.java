package baseball.domain;

import java.util.Objects;

public class Position {
    private final int position;

    public Position(int position) {
        if (position < 1 || position > 3) {
            throw new IllegalArgumentException("유효하지 않은 자리수 값 입력");
        }
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
