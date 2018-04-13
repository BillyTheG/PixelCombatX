package pixelCombat.ki;

public interface AI {

	public int getNumberOfActions();

	public int[] getActionPriorities();
	
	public void calculateNewProbabilities();

	public void doOtherAction(int actionId);

}
