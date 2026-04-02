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
        //double number = Math.pow(2,model.height()) - 1;
        solve(0, model);
    }

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    public int solve(int n, TowerModel model)
    {
        if (n < 3)
        {
        if (model.height() > 2)
        {
        model.move(0,n);
        }
        else
        {
        model.move(n,0);
        }

        return solve(n+1, model);
        }
        return 0;
    }

}
