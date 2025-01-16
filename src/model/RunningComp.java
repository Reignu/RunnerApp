package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Models RunningComp entities
 *
 * @author Reignu
 */
public class RunningComp {
    private int id;
    private String season;
    private String competition;
    private String venue;
    private int rank;
    private List<Runner> runners;

    // Nested Runner class
    public static class Runner {
        private final int runnerNumber;
        private String runnerName;
        private String gender;
        private int runningCompId;

        public Runner(int runnerNumber, String runnerName, int runningCompId, String gender) {
            this.runnerNumber = runnerNumber;
            this.runnerName = runnerName;
            this.runningCompId = runningCompId;
            this.gender = gender;
        }

        public int getRunnerNumber() {
            return runnerNumber;
        }

        public String getRunnerName() {
            return runnerName;
        }

        public void setRunnerName(String runnerName) {
            this.runnerName = runnerName;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getRunningCompId() {
            return runningCompId;
        }

        @Override
        public String toString() {
            return "Runner: runnerNumber= " + this.runnerNumber +
                   ", runnerName= " + this.runnerName +
                   ", runningCompId= " + this.runningCompId +
                   ", gender= " + this.gender;
                   
        }
    }

    /**
     * The default RunningComp constructor
     */
    public RunningComp() {
        this.id = 0;
        this.season = null;
        this.competition = null;
        this.venue = null;
        this.rank = 0;
        this.runners = new ArrayList<>();
    }

    /**
     * A constructor which accepts season, competition and opponent values
     */
    public RunningComp(String season, String competition, String venue) {
        this.id = 0;
        this.season = season;
        this.competition = competition;
        this.venue = venue;
        this.rank = 0;
        this.runners = new ArrayList<>();
    }

    /**
     * A constructor which accepts id, competition, venue and result values
    */
   public RunningComp(int id, String season, String competition, String venue, int rank) {
       this.id = id;
       this.season = season;
       this.competition = competition;
       this.venue = venue;
       this.rank = rank;
       this.runners = new ArrayList<>();
   }

    /**
     * A getter for id values
     */
    public int getId() {
        return id;
    }

    /**
     * A setter method for id values
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * A getter for season values
     */
    public String getSeason() {
        return season;
    }

    /**
     * A setter method for season values
     */
    public void setSeason(String season) {
        this.season = season;
    }

    /**
     * A getter for competition values
     */
    public String getCompetition() {
        return competition;
    }

    /**
     * A setter method for competition values
     */
    public void setCompetition(String competition) {
        this.competition = competition;
    }

    /**
     * A getter for opponent values
     */
    public String getVenue() {
        return venue;
    }

    /**
     * A setter method for opponent values
     */
    public void setVenue(String venue) {
        this.venue = venue;
    }

    /**
     * A getter for result values
     */
    public int getRank() {
        return rank;
    }

    /**
     * A setter method for result values
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * A getter for players values
     */
    public List<Runner> getRunners() {
        return new ArrayList<>(runners);
    }

    /**
     * A setter method for players values
     */
    public void setRunners(List<Runner> runners) {
        this.runners = new ArrayList<>(runners);
    }

    /**
     * Adds a supplied Runner object to the runner attribute
     */
    public void addRunnerToComp(Runner runner) {
        runners.add(runner);
    }

    /**
     * Constructs and returns a String representing the state of the object
     */
    @Override
    public String toString() {
        // Complete this method
        return "Running comp: id: " + this.id +
        ", season: " + this.season +
        ", competition: " + this.competition +
        ", venue: " + this.venue +
        ", rank: " + this.rank +
        ", runners: " + this.runners;
    }
}
