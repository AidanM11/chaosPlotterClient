package chaosSimulatorPlotter;

public class ConnectionChecker extends Thread{
	public void run() {
		while(true) {
			if(MainClient.getConnection() != null) {
				if(MainClient.getConnection().isClosed()) {
					MainClient.setConnectionAlive(false);
				}
				else {
					MainClient.setConnectionAlive(true);
				}
			}
			else {
				MainClient.setConnectionAlive(false);
			}
		}
	}
}
