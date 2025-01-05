package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Models RunningComp entities
 *
 * @author Martin Gallacher
 * @author Bobby Law
 */
public class RunningComp {
    private int id;
    private String season;
    private String competition;
    private String venue;
    private int rank;
    private List<Runner> runners;

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
        // Complete this method
        return 0;
    }

    /**
     * A setter method for id values
     */
    public void setId(int id) {
        // Complete this method
    }

    /**
     * A getter for season values
     */
    public String getSeason() {
        // Complete this method
        return "Season";
    }

    /**
     * A setter method for season values
     */
    public void setSeason(String season) {
        // Complete this method
    }

    /**
     * A getter for competition values
     */
    public String getCompetition() {
        // Complete this method
        return "competition";
    }

    /**
     * A setter method for competition values
     */
    public void setCompetition(String competition) {
        // Complete this method
    }

    /**
     * A getter for opponent values
     */
    public String getVenue() {
        // Complete this method
        return "venue";
    }

    /**
     * A setter method for opponent values
     */
    public void setVenue(String venue) {
        // Complete this method
    }

    /**
     * A getter for result values
     */
    public int getRank() {
        // Complete this method
        return 0;
    }

    /**
     * A setter method for result values
     */
    public void setRank(int rank) {
        // Complete this method
    }

    /**
     * A getter for players values
     */
    public List<Runner> getRunners() {
		// Complete this method
        return runners;
    }

    /**
     * A setter method for players values
     */
    public void setRunners(List<Runner> runners) {
        // Complete this method
    }

    /**
     * Adds a supplied Runner object to the players attribute
     */
    public void addRunnerToComp(Runner player) {
        // Complete this method
    }

    /**
     * Constructs and returns a String representing the state of the object
     */
    @Override
    public String toString() {
        // Complete this method
        return "str";
    }
}
