package tower;

public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        solve(0);
    }

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    public void solve(int a)
    {

    }

}
