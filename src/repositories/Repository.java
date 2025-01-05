package repositories;

import daos.DAO;
import java.util.List;

import daos.TestDAO;
import model.RunningComp;
import model.Runner;

/**
 * Implements model management
 * and acts as an intermediary
 * to a data access object
 */
public class Repository implements RepositoryInterface {
    private final DAO dao;

    /**
     * The default constructor which instantiates the dao attribute as a
     * specified type of Data Access Object
     */
    public Repository() {
        dao = new TestDAO();
    }

    /**
     * Responds to a request from the Controller to provide a List of
     * RunningComp objects.
     * Fulfils this request by sending a getRunningComps() message to the
     * data access object
     */
    @Override
    public List<RunningComp> getRunningComps() {
        return dao.getRunningComps();
    }

    /**
     * Responds to a request from the Controller to add a
     * RunningComp object.
     * Fulfils this request by sending a addRunningComp() message to the
     * data access object
     */
    @Override
    public void addRunningComp(RunningComp runningComp) {
        dao.addRunningComp(runningComp);
    }

    /**
     * Responds to a request from the Controller to add a
     * Runner object.
     * Fulfils this request by sending a addRunner() message to the
     * data access object
     */
    @Override
    public void addRunner(Runner runner) {
        dao.addRunner(runner);
    }

    /**
     * Responds to a request from the Controller to provide a specified
     * RunningComp object.
     * Fulfils this request by sending a getRunningComp() message to the
     * data access object
     */
    @Override
    public RunningComp getRunningCompId(int id) {
        return dao.getRunningComp(id);
    }
}
