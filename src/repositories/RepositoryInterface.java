package repositories;

import model.RunningComp;

import java.util.List;

/**
 *
 * @author Reignu
 */
public interface RepositoryInterface {
    /**
     * A class that implements this interface must provide this method
     *
     * @return List of RunningComp
     */
    List<RunningComp> getRunningComps();

    /**
     * A class that implements this interface must provide this method
     *
     * @param runningComp
     */
    void addRunningComp(RunningComp runningComp);

    /**
     * A class that implements this interface must provide this method
     *
     * @param runner
     */
    void addRunner(RunningComp.Runner runner);

    /**
     * A class that implements this interface must provide this method
     *
     * @param id
     * @return RunningComp
     */
    RunningComp getRunningCompId(int id);
}
