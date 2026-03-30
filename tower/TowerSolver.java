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
        double number = Math.pow(2,model.height()) - 1;
        solve((int)number);
    }

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    public int solve(int n)
    {
        TowerModel.move(1,2);

        return solve();
    }

}
