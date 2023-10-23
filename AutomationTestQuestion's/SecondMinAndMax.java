public class SecondMinAndMax {
    public static void findSecondMinAndMax(int[] arr) {
        if (arr.length < 2) {
            System.out.println("The array should have at least two elements.");
            return;
        }

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin && num != firstMin) {
                secondMin = num;
            }

            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        System.out.println("Second Minimum: " + secondMin);
        System.out.println("Second Maximum: " + secondMax);
    }

    public static void main(String[] args) {
        int[] array = {12, 34, 45, 9, 8, 76, 45, 100};

        findSecondMinAndMax(array);
    }
}
