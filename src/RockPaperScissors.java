import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {

		String[] rps = { "r", "p", "s" };
		String computerMove = rps[new Random().nextInt(rps.length)];

		Scanner scanner = new Scanner(System.in);
		String playerMove = scanner.nextLine();

		while (true) {
			System.out.println("please enter your move (r, p, or ,s)");
			playerMove = scanner.nextLine();
			if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
				break;
			}
			System.out.println(playerMove + " is not a valid move");

		}

		System.out.println("computer played: " + computerMove);

		if (playerMove.equals(computerMove)) {
			System.out.println("It's a tie!");
		} else if (playerMove.equals("r")) {
			if (computerMove.equals("p")) {
				System.out.println("You Lose!");
			} else if (computerMove.equals("s")) {
				System.out.println("You Win");
			}
		} else if (playerMove.equals("p")) {
			if (computerMove.equals("s")) {
				System.out.println("You Lose!");
			} else if (computerMove.equals("r")) {
				System.out.println("You Win");
			}
		} else if (playerMove.equals("s")) {
			if (computerMove.equals("r")) {
				System.out.println("You Lose!");
			} else if (computerMove.equals("p")) {
				System.out.println("You Win");
			}
		}

	}
}
