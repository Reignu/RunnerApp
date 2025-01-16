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
        do {
            System.out.println("Running Competition Management System \n");
            System.out.println("================================");
            System.out.println("1. List Running Competitions");
            System.out.println("2. Add Running Competition");
            System.out.println("3. Add Runner");
            
            int option = inputHelper.readInt("Enter choice (0 to Quit): ");

            switch (option) {
                case 1:
                    listRunningComps();
                    break;
                case 2:
                    addRunningComp();
                    break;
                case 3:
                    addRunner();
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
        
        InputHelper inputHelper = new InputHelper();
        String season = inputHelper.readString("Enter season: ");
        String competition = inputHelper.readString("Enter competition name: ");
        String venue = inputHelper.readString("Enter venue: ");
        int rank = inputHelper.readInt("Enter rank: ");
        
        RunningComp newComp = new RunningComp(season, competition, venue);
        newComp.setRank(rank);
        
        repository.addRunningComp(newComp);
    }

    private void addRunner() {
        System.out.println("Add Runner");
        System.out.println("==========");
        
        InputHelper inputHelper = new InputHelper();
        int runnerNumber = inputHelper.readInt("Enter runner number: ");
        String runnerName = inputHelper.readString("Enter runner name: ");
        String gender = inputHelper.readString("Enter gender (M/F): ");
        int runningCompId = inputHelper.readInt("Enter running competition ID: ");
        
        Runner newRunner = new Runner(runnerNumber, runnerName, runningCompId, gender);
        
        repository.addRunner(newRunner);
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
