import java.util.Scanner;

public class Banking_App_2 {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_GREEN_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = "Welcome to Smart Banking App";
        final String NEW_ACCOUNT = "➕ Open New Account";
        

        final String ERROR_MSG = String.format("\t%s%s%s\n", COLOR_RED_BOLD, "%s", RESET);
        final String SUCCESS_MSG = String.format("\t%s%s%s\n", COLOR_GREEN_BOLD, "%s", RESET);

        String[] customerIds = new String[0];
        String[] customerNames = new String[0];

        String screen = DASHBOARD;


        final String APP_TITLE = String.format("%s%s%s",
        COLOR_BLUE_BOLD, screen, RESET);

        System.out.println(CLEAR);
        System.out.println("-".repeat(45));
        System.out.println("\t" + APP_TITLE );
        System.out.println("-".repeat(45));

        switch(screen){
            case DASHBOARD: 
                System.out.println("\t[1]. Open New Account");
                System.out.println("\t[2]. Exit\n");
                System.out.println("-".repeat(45));
                System.out.print("\tEnter an option to continue: ");
                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option){
                    case 1: screen = NEW_ACCOUNT; break;
                    case 2: System.out.println(CLEAR); System.exit(0);
                    default: continue;
                }
                break;
        
    }
}