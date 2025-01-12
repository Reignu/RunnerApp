package daos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.RunningComp;
import model.Runner;

/**
 * A SQL Data Access Object class
 * to implement methods to access/update
 * an SQL database.
 */
public class SQLDAO extends DAO {
    static private final String userName = "root";
    static private final String password = "";
    static private final String url = "jdbc:mysql://localhost:3306/runningcomps";
    static private Connection connection = null;
    
    public SQLDAO() {
        try {
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to database");            
        } catch (SQLException ex) { 
            System.out.println(ex.getMessage());
        }
    }

    /**
     * A method to return the running competitions list through
     * querying the database using a stored procedure.
     */
    @Override
    public List<RunningComp> getRunningComps() {
        List<RunningComp> runningCompsList = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            String queryString = "CALL GetRunnerComps()";            
            ResultSet rs = stmt.executeQuery(queryString);
            
            while (rs.next()) {
                int runningCompId = rs.getInt("RUNNINGCOMPID");
                String season = rs.getString("SEASON");
                String competition = rs.getString("COMPETITION");
                String venue = rs.getString("VENUE");
                int rank = rs.getInt("RANK");
                List<Runner> runnersList = getRunningCompRunners(runningCompId);
                
                RunningComp runningComp = new RunningComp(runningCompId, season, competition, venue, rank);
                runningComp.setRunners(runnersList);
                runningCompsList.add(runningComp);
            }            
        } catch (SQLException ex) { 
            System.out.println(ex.getMessage());
        }
        return runningCompsList;
    }

    /**
     * A method to return the runners list associated with
     * a specified running competition through querying the database.
     */
    private List<Runner> getRunningCompRunners(int runningCompId) throws SQLException {
        List<Runner> runnersList = new ArrayList<>();
        String queryString = "CALL GetRunningCompRunners(" + Integer.toString(runningCompId) + ")";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(queryString);
        
        while (rs.next()) {
            int runnerNumber = rs.getInt("RUNNERNUMBER");
            String runnerName = rs.getString("RUNNERNAME");
            String gender = rs.getString("GENDER");
            
            Runner runner = new Runner(runnerNumber, runnerName, runningCompId, gender);
            runnersList.add(runner);
        }
        return runnersList;
    }
}
