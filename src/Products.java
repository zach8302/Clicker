public class Products {
    public int pointValue;
    public int clickValue;
    public double cost;
    public int amountOwned;

    public Products(int a, int b, int c, int d){
        pointValue = a;
        clickValue = b;
        cost = c;
        amountOwned = d;
    }

    public void increasePrice(){
        cost = cost*Math.pow(1.25,amountOwned);

    }

    Products p3 = new Products(0,1,10,0);

    Products p2 = new Products(1,0,10,0);


}
