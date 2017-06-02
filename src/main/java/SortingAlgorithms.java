public class SortingAlgorithms {

	public void sort(double[] toSort, boolean asc) {
		int n = toSort.length;
		do {
			for (int i = 0; i < n - 1; i++) {
				if (asc) {
					if (toSort[i] > toSort[i + 1]) {
						double tmp = toSort[i];
						toSort[i] = toSort[i + 1];
						toSort[i + 1] = tmp;
					}
				} else {
					if (toSort[i] < toSort[i + 1]) {
						double tmp = toSort[i];
						toSort[i] = toSort[i + 1];
						toSort[i + 1] = tmp;
					}
				}
			}
			n--;
		} while (n > 1);
	}
}
