package tower;

public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        TowerModel tower = new TowerModel();
        this.model = model;
        int number = Math.pow(2,tower.height()) - 1;
        solve(number);
    }

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    public int solve(int n)
    {
        move(1,2);

        return solve();
    }

}
