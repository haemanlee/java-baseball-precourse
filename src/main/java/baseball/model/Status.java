package baseball.model;

public enum Status {
    Ball, Strike, Nothing;

    public boolean isNotNothing() {
        return this != Nothing;
    }
}
