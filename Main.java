import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean try_it = true;

        while (try_it) {
            System.out.print("Hello! Do you want auto-generate array? Y/N/Exit - ");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();

            switch (command.toUpperCase()) {
                case ("Y"):
                    int[] arr = generateArr();
                    System.out.println("Source array - " + Arrays.toString(arr));
                    System.out.println("Sorted array - " + Arrays.toString(sortArr(arr)));
                    break;

                case ("N"):
                    boolean isBreak = false;
                    System.out.println("Enter an array separated by commas: ");
                    String src = scanner.nextLine();
                    src.trim();
                    String[] arrString = src.trim().replaceAll("\\s+", "").split(",");
                    int[] results = new int[arrString.length];

                    for (int i = 0; i < arrString.length; i++) {
                        try {
                            results[i] = Integer.parseInt(arrString[i]);
                        } catch (NumberFormatException nfe) {
                            System.out.println("Wrong array: " + Arrays.toString(arrString));
                            System.out.println("Try once more");
                            isBreak = true;
                        }
                    }

                    if (isBreak) {
                        break;
                    } else {
                        System.out.println("Source array - " + Arrays.toString(results));
                        System.out.println("Sorted array - " + Arrays.toString(sortArr(results)));
                    }
                    break;

                case ("EXIT"):
                    try_it = false;
                    break;

                default:
                    System.out.println("Wrong command: " + command);
                    System.out.println("Try once more");
                    break;

            }
            System.out.println();
        }


    }

    private static int[] generateArr() {
        int length = (int) Math.round(Math.random() * 19 + 1);
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100) - 50);
        }

        return array;
    }

    private static int[] sortArr(int[] arr) {

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }

        return arr;
    }
}
