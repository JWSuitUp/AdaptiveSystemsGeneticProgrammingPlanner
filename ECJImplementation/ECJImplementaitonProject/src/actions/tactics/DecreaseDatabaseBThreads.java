package actions.tactics;

import components.DatabaseBThread;
import main.StateData;

public class DecreaseDatabaseBThreads extends DecreaseDatabaseThreads {
	
	
	public DecreaseDatabaseBThreads(){
		component=new DatabaseBThread();
	}
	
	@Override
	public String toString() {
		return "DecreaseDatabaseBThreads";
	}

	@Override
	protected boolean isInvalidChange(StateData sd) {
		sd.setDatabaseBThreadsCount(sd.getDatabaseBThreadsCount()-1);
		return sd.getDatabaseBThreadsCount() < 1; 
	}
}