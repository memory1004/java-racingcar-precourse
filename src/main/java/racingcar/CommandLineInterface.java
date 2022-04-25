package racingcar;


import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class CommandLineInterface {

    private int round;
    private List<String> separatedCarnames;

    private CommandLineInterface(){

    }

    public static CommandLineInterface getInstance(){
        return new CommandLineInterface();
    }

    public void inputCarNames() {
        this.separatedCarnames = new ArrayList<>();
        try {
            System.out.println("경주 할 자동차이름(이름은쉼표(,)기준으로구분)");
            for (String carname : inputText().split(",")) {
                validationCarname(carname);
                separatedCarnames.add(carname);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] ");
            inputCarNames();
        }
    }

    private void validationCarname(String carname) {
        if (carname.length() > 5) {
            throw new IllegalArgumentException("자동차이름은 5글자이하로 작성해주세요.");
        }
        if ( this.separatedCarnames.contains(carname)){
            throw new IllegalArgumentException("같은 자동차이름은 등록이 불가능합니다.");
        }
    }

    public List<String> getSeparatedCarnames() {
        return separatedCarnames;
    }

    public int getRound() {
        return round;
    }

    public void inputRound() {
        try {
            System.out.println("시도할 회수는 몇회인가요?");
            round = Integer.parseInt(inputText());
        } catch (NumberFormatException numberFormatException) {
            System.out.println("[ERROR] : 숫자만 입력해주세요.");
            inputRound();
        }
    }

    private String inputText() {
        return Console.readLine();
    }

}
