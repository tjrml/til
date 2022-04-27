package lotto;

public class Lotto {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 45;
    public static final int GAME_FEE = 1000;
    private int lottoNumber[] = new int[6];
    private String rank;
    private int gameCount;

    public int[] getLottoNumber() {
        return lottoNumber;
    }

    public void setLottoNumber(int[] lottoNumber) {
        this.lottoNumber = lottoNumber;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getGameCount() {
        return gameCount;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

}
