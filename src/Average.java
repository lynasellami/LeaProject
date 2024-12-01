public class Average {
    private int[] data; // Array to contain scores
    private double mean; // The arithmetic mean

    // Constructor
    public Average() {
        data = new int[5]; // Allocate memory for array
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompt user for scores
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter score number " + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        // Sort and calculate mean
        selectionSort();
        calculateMean();
    }

    // Calculate the mean of the array
    public void calculateMean() {
        int total = 0;
        for (int score : data) {
            total += score;
        }
        mean = (double) total / data.length;
    }

    // Selection sort: Sort array in descending order
    public void selectionSort() {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap
            int temp = data[maxIndex];
            data[maxIndex] = data[i];
            data[i] = temp;
        }
    }

    // Return array and mean as string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Data in descending order: ");
        for (int score : data) {
            sb.append(score).append(" ");
        }
        sb.append("\nMean: ").append(mean);
        return sb.toString();
    }
}