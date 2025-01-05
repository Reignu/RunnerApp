package daos;

import java.util.ArrayList;
import java.util.List;

import model.RunningComp;
import model.Runner;

/**
 * An Test Data Access Object class
 * to hard code test data for
 * cup finals and players.
 */
public class TestDAO extends DAO {
	List<RunningComp> runningCompList;

    /**
     * Initializes and populates the cup finals list
     * with test data.
     */
    public TestDAO() {
        runningCompList = new ArrayList<>();
        populate();
    }

    /**
     * Populates the cup finals list
     * with test data.
     */
    private void populate() {
        RunningComp runningComp;
        Runner runner;
        runningComp = new RunningComp(21, "2023", "Boston Marathon", "Boston, USA", 1);
        runner = new Runner(24,"Fiona O'KEEFFE",21,"F");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(143,"Atalel ANMUT",21,"F");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(18,"Zouhair TALBI",21,"M");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(27,"Asefa BOKI",21,"M");
        runningComp.addRunnerToComp(runner);
        runningCompList.add(runningComp);
        runningComp = new RunningComp(22, "2023", "London Marathon", "London, UK", 2);
        runner = new Runner(26,"Morhad AMDOUNI",22,"M");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(120,"Antenayeh DAGNACHEW",22,"M");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(11,"Honami MAEDA",22,"F");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(132,"Gashau AYALE",22,"M");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(44,"Ghirmay GHEBRESLASSIE",22,"M");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(33,"Emily SISSON",22,"F");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(79,"Dejane MEGERSA",22,"M");
        runningComp.addRunnerToComp(runner);
        runningCompList.add(runningComp);
        runningComp = new RunningComp(24, "2023", "Berlin Marathon", "Berlin, Germany", 4);
        runner = new Runner(66,"Addisu GOBENA",24,"M");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(59,"Abdi FUFA",24,"M");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(146,"Lemi DUMECHA",24,"M");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(16,"Ruti AGA",24,"F");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(125,"Rahma TUSA",24,"F");
        runningComp.addRunnerToComp(runner);
        runningCompList.add(runningComp);
        runningComp = new RunningComp(25, "2023", "Chicago Marathon", "Chicago, USA", 5);
        runner = new Runner(144,"Melat Yisak KEJETA",25,"F");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(80,"Shitaye ESHETE",25,"F");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(82,"Josephine CHEPKOECH",25,"F");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(40,"Workenesh EDESA",25,"F");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(108,"Yemaneberhan CRIPPA",25,"M");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(11,"Tafese DELELEGN",25,"M");
        runningComp.addRunnerToComp(runner);
        runningCompList.add(runningComp);
        runningComp = new RunningComp(26, "2023", "Tokyo Marathon", "Tokyo, Japan", 6);
        runner = new Runner(71,"Tigist KETEMA",26,"F");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(38,"Vicoty CHEPNGENO",26,"F");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(148,"Azmera GEBRU",26,"F");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(135,"Deresa GELETA",26,"M");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(19,"Dera DIDA",26,"F");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(130,"Amid Fozya JEMAL",26,"F");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(50,"Felix KIRWA",26,"M");
        runningComp.addRunnerToComp(runner);
        runner = new Runner(69,"Samuel FITWI SIBHATU",26,"M");
        runningComp.addRunnerToComp(runner);
        runningCompList.add(runningComp);
    }
    
    /**
     * Overrides the abstract method specified in the DAO class
     * and returns a List of Cup Final objects as requested
     */
    @Override
	public List<RunningComp> getRunningComps() {
        return runningCompList;
    }
    
    /**
     * Overrides the abstract method specified in the DAO class,
     * accepts a cup final id value
     * and returns a matching Cup Final object or null as requested
     */
    @Override
	public RunningComp getRunningComp(int runningCompId) {
        for (RunningComp runningComp : runningCompList) {
            if (runningComp.getId() == runningCompId) {
                return runningComp;
            }
        }    	
        return null;
    }
    
    /**
     * Overrides the abstract method specified in the DAO class,
     * accepts a Cup Final object and adds it to the list
     */
    @Override
    public void addRunningComp(RunningComp runningComp) {
        int runningCompId = runningCompList.stream().map(RunningComp::getId).max(Integer::compare).get()+1;
        runningComp.setId(runningCompId);
        runningCompList.add(runningComp);
    }
    
    /**
     * Overrides the abstract method specified in the DAO class,
     * accepts a Runner object and updates a Cup Final in the list
     */
    @Override
	public void addRunner(Runner runner) {
        for (RunningComp runningComp : runningCompList) {
            if (runningComp.getId() == runner.getRunningCompId()) {
                runningComp.addRunnerToComp(runner);
            }
        }    	
    }  
}
