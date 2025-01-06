package model;

/**
 * Models Runner entities
 *
 * @author Martin Gallacher
 * @author Bobby Law
 */
public class Runner {

    private final int runnerNumber;
    private String runnerName;
    private int runningCompId;
    private String gender;

    /**
     * A constructor which accepts player number, name, and cup final id values
     */
    public Runner(int runnerNumber, String runnerName, int runningCompId, String gender) {
    	this.runnerNumber = runnerNumber;
        this.runnerName = runnerName;
        this.runningCompId = runningCompId;
        this.gender = gender;
    }

    /**
     * A getter for player number values
     */
    public int getRunnerNumber() {
        return runnerNumber;
    }

    /**
     * A getter for name values
     */
    public String getRunnerName() {
        return runnerName;
    }

    /**
     * A setter method for name values
     */
    public void setRunnerName(String runnerName) {
        this.runnerName = runnerName;
    }

    /**
     * A getter for Running Comp id values
     */
    public int getRunningCompId() {
        return runningCompId;
    }

    /**
     * A setter method for Running Comp id values
     */
    public void setRunningCompId(int runningCompId) {
        this.runningCompId = runningCompId;
    }

    /**
     * A getter for Runner Gender values
     */
    public String getGender() {
        return gender;
    }
    /**
     * A setter method for runner gender values
     */
    public void setGender(String gender) {
        this.gender = gender;
    }


    /**
     * Constructs and returns a String representing the state of the object
     */
    @Override
    public String toString() {
        return "Runner: runnerNumber= " + this.runnerNumber +
        ", runnerName= " + this.runnerName +
        ", runningCompId= " + this.runningCompId +
        ", gender= " + this.gender + "]";
    }

}
