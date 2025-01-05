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
        // Complete this method
        return 0;
    }

    /**
     * A getter for name values
     */
    public String getRunnerName() {
        // Complete this method
        return "runnerName";
    }

    /**
     * A setter method for name values
     */
    public void setRunnerName(String runnerName) {
        // Complete this method
    }

    /**
     * A getter for Running Comp id values
     */
    public int getRunningCompId() {
        // Complete this method
        return 0;
    }

    /**
     * A setter method for Running Comp id values
     */
    public void setRunningCompId(int runningCompId) {
        // Complete this method
    }

    /**
     * A getter for Runner Gender values
     */
    public String getGender() {
        // Complete this method
        return "gender";
    }
    /**
     * A setter method for runner gender values
     */
    public void setGender(String gender) {
        // Complete this method
    }


    /**
     * Constructs and returns a String representing the state of the object
     */
    @Override
    public String toString() {
        // Complete this method
        return "toString";
    }

}
