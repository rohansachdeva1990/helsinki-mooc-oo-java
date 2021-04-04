import repository.FinnishPhoneRepository;
import repository.PhoneRepository;
import ui.UserInterface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        PhoneRepository phoneRepository = new FinnishPhoneRepository();
        UserInterface ui = new UserInterface(reader, phoneRepository);
        ui.start();
    }
}
