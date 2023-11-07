package cvut.fel.omo;

import cvut.fel.omo.strategy.ChainStrategy;
import cvut.fel.omo.strategy.CommandStrategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No arguments, add one of these arguments to run the app:");
            System.out.println("  1 for iterator");
            System.out.println("  2 for chain of responsibility");
            return;
        }
        switch (args[0]) {
            case "1":

                break;
            case "2":
                new ChainStrategy().execute();
                break;

        }

    }
}