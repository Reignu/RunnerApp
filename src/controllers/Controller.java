package controllers;

import helpers.InputHelper;
import model.RunningComp;
import model.Runner;
import repositories.Repository;

import java.util.List;

public class Controller {
    private Repository repository;

    public Controller() {

    }

    public void run() {
        boolean finished = false;
        InputHelper inputHelper = new InputHelper();
        // Complete this method

    }

    private void listRunningComps() {
        System.out.println("List Running Competitions");
        System.out.println("=========================");
        // Complete this method

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
