package composition.example1;

import java.util.ArrayList;
import java.util.List;

public class ComputerMain {

    public static void main(String[] args) {

        ComputerSet computerSet = new ComputerSet();

        Monitor monitor = new Monitor(17);
        computerSet.setMonitor(monitor);
        Mouse mouse = new Mouse(true);
        computerSet.setMouse(mouse);
        Keyboard keyboard = new Keyboard(20, "Hitachi");
        computerSet.setKeyboard(keyboard);

        computerSet.setTotalPrice(500);

        ComputerSet cheaperComputerSet = new ComputerSet(300,
                new Monitor(15),
                new Mouse(false),
                new Keyboard(15, "Padielka"));

        List<ComputerSet> uzsakymas = new ArrayList<>();
        uzsakymas.add(computerSet);
        uzsakymas.add(cheaperComputerSet);

        System.out.println("Computer set:");
        for (ComputerSet singleUzsakymas : uzsakymas) {
            System.out.println(singleUzsakymas);
        }
        System.out.println(computerSet.getMonitor().getDisplaySize());

    }
}
