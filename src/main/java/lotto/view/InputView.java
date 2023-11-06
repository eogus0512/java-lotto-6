package lotto.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {
    private static final Integer pricePerLotto = 1000;

    public Integer inputPurchaseAmount() {
        String inputLine = Console.readLine();
        Integer purchaseAmount = Integer.parseInt(inputLine);
        validatePurchaseAmount(purchaseAmount);
        return purchaseAmount;
    }

    public List<Integer> inputWinningNumbers() {
        String inputLine = Console.readLine();
        List<Integer> winningNumbers = Arrays.asList(Integer.parseInt(String.valueOf(inputLine.split(","))));
        validateWinningNumbers(winningNumbers);
        return winningNumbers;
    }

    public Integer inputBonusNumbers() {
        String inputLine = Console.readLine();
        Integer bonusNumber = Integer.parseInt(inputLine);
        validateBonusNumbers(bonusNumber);
        return bonusNumber;
    }

    private void validatePurchaseAmount(Integer amount) {
        if ((amount % pricePerLotto) != 0) {
            throw new IllegalArgumentException();
        }
    }

    private void validateWinningNumbers(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    private void validateBonusNumbers(Integer number) {
        if (number > 45 || number < 1) {
            throw new IllegalArgumentException();
        }
    }
}
