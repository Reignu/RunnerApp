package controllers;

import helpers.InputHelper;
import model.RunningComp;
import model.Runner;
import repositories.Repository;

import java.util.List;

public class Controller {
    private Repository repository;

    public Controller() {
        repository = new Repository();
    }

    public void run() {
        boolean finished = false;
        InputHelper inputHelper = new InputHelper();
        // Complete this method
        do {
            System.out.println("Running Competition Management System \n");
            System.out.println("================================");
            System.out.println("1. List Running Competitions");

            int option = inputHelper.readInt("Enter choice (0 to Quit): ");

            switch (option) {
                case 1:
                    listRunningComps();
                    break;
                case 0:
                    finished = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (!finished);
    }

    private void listRunningComps() {
        System.out.println("List Running Competitions");
        System.out.println("=========================");
        List<RunningComp> runningComps = repository.getRunningComps();
        System.out.println(runningComps);

    }

    private void addRunningComp() {
        System.out.println("Add Running Competition");
        System.out.println("=======================");
        // Complete this method
    }

    private void addRunner() {
        System.out.println("Add Runner");
        System.out.println("==========");
        // Complete this method

    }

    private RunningComp findRunningComp() {
        InputHelper inputHelper = new InputHelper();
        RunningComp requiredRunningComp;
        int runningCompId;
        do {
            runningCompId = inputHelper.readInt("Enter Running Competition Id (0 to Quit)");
            if (runningCompId != 0) {
                requiredRunningComp = repository.getRunningCompId(runningCompId);
                if (requiredRunningComp != null)
                    return requiredRunningComp;
                else
                    System.out.println("Running Competition Not Found");
            }
        } while (runningCompId != 0);
        return null;
    }
}
