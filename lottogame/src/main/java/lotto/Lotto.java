package lotto;

import java.util.HashSet;
import java.util.Set;

public class Lotto {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 45;
    public static final int GAME_FEE = 1000;

    private final int lottoCount = 6;
    private int random;
    private Set<Integer> lottoNumber;
    private String rank;

    public Lotto() {
        this.random = (int) (Math.random() * MAX_NUMBER) + MIN_NUMBER;
    }

    public void lottoStart(int gameCount) {
        for (int i = 0; i < gameCount; i++) {
            System.out.println(lottoMachine(gameCount));
        }
    }

    private Set<Integer> lottoMachine(int gameCount) {
        for (int i = 0; i < gameCount; i++) {
            lottoNumber = new HashSet<>();
            lottoNumber = randomNumber();
        }
        return lottoNumber;
    }

    private Set<Integer> randomNumber() {
        while (lottoNumber.size() < lottoCount) {
            lottoNumber.add(new Lotto().random);
        }
        return lottoNumber;
    }
}
