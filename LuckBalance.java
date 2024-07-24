package hackerrank;

import java.util.*;

import lombok.experimental.var;

/**
 * Sample Input:
 * 6 3
 * 5 1
 * 2 1
 * 1 1
 * 8 1
 * 10 0
 * 5 0
 */

public class LuckBalance {

	private static int luckBalance(int k, List<List<Integer>> contests) {
		
		int total = 0;
		List<Integer> importantContests = new ArrayList<>();

		for (List<Integer> contest : contests) {
			if (contest.get(1) == 0) {
				total += contest.get(0);
			} else {
				importantContests.add(contest.get(0));
			}
		}

		importantContests.sort(Collections.reverseOrder());

		for (int i = 0; i < importantContests.size(); i++) {
			if (i < k) {
				total += importantContests.get(i);
			} else {
				total -= importantContests.get(i);
			}
		}

		return total;

	}

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int k = in.nextInt();
			List<List<Integer>> contests = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				List<Integer> contest = new ArrayList<>();
				for (int j = 0; j < 2; j++) {
					contest.add(in.nextInt());
				}
				contests.add(contest);
			}

			int result = luckBalance(k, contests);
			System.out.println(result);
		}
	}
}