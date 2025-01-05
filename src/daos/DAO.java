package daos;

import java.util.List;

import model.RunningComp;
import model.Runner;

/**
 * An abstract Data Access Object class
 * which specifies the functionality required
 * to interact with a data store and implemented
 * in concrete subclasses
 */
public abstract class DAO {

    /**
     * A Data Access Object needs to be able to fulfill an
     * addRunningComp() request
     */
    public abstract void addRunningComp(RunningComp runningComp);

    /**
     * A Data Access Object needs to be able to fulfill an
     * addRunner() request
     */
    public abstract void addRunner(Runner runner);

    /**
     * A Data Access Object needs to be able to fulfill a
     * getRunningComp() request when supplied with a vacancy id
     */
    public abstract RunningComp getRunningComp(int runningCompId);

    /**
     * A Data Access Object needs to be able to fulfill a
     * getRunningComps() request and return a List of RunningComp objects
     */
    public abstract List<RunningComp> getRunningComps();
}