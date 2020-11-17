import java.util.Scanner;
public class Berth {
    private static int[] berths = new int[40];

    public static void main(String args[]) {
        for (int i = 0; i < 40; i++) {
            berths[i] = 0;
        }
        Scanner s = new Scanner(System.in);
        int choice;
        System.out.println("Please enter 1 for lower berth,2 for upper berth,0 to exit: ");
        choice = s.nextInt();
        while (choice != 0) {
            int berthnumber = 0;
            if (choice == 1) {
                berthnumber = bookLowerberth();
                if (berthnumber == 2) {
                    berthnumber = bookUpperberth();
                    if (berthnumber != 0) {
                              System.out.println("Sorry, we have no lower berth.Do you want upper berth?");
                        printBoardingPass(berthnumber);
                    } else {
                        System.out.println("lower berth available");
                        printBoardingPass(berthnumber);
                    }
                    if (choice == 2) {
                        berthnumber = bookUpperberth();
                        if (berthnumber == 2) {
                            berthnumber = bookLowerberth();
                            if (berthnumber != 0) {
                                System.out.println("Sorry we are unable to book Upper berth.Do you want lower berth?");
                                printBoardingPass(berthnumber);
                            }
                        } else {
                            System.out.println("Upper berth available");
                            printBoardingPass(berthnumber);
                        }
                    } else {
                        System.out.println("Invalid choice made.Please try again");
                        choice = 0;
                    }
                    if (berthnumber == -1) {
                        System.out.println("We are sorry,there are no lower or uper berth available");
                        System.out.println();
                    }
                    System.out.println("Please enter 1 for lower berth,2 for upper berth,0 to exit");
                    choice = s.nextInt();
                }
            }
        }
    }
    private static int bookLowerberth() {
        for (int i = 0; i < 20; i++) {
            if (berths[i] == 0) {
                berths[i] = 1;
                return i + 1;
            }
        }
        return -1;
    }
    private static int bookUpperberth() {
        for (int i = 20; i < 40; i++) {
            if (berths[i] == 0){
                berths[i] = 1;
            return i + 1;
        }
    }
    return-1;
}
    private static void printBoardingPass(int berthnumber) {
        System.out.println("Boarding pass for berth number" + berthnumber);
        System.out.println("This ticket is non transferable.");
        System.out.println("Please be courteous.Do not smoke.");
        System.out.println("Enjoy your journey.");
        System.out.println();
    }
}
