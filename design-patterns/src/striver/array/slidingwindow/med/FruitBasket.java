package striver.array.slidingwindow.med;

public class FruitBasket {
    public int totalFruit(int[] fruits) {
        int count = 0;
        int lastFruitCount = 0;
        int fruita = -1;
        int fruitb = - 1;
        int ans = 0;

        for(int curr : fruits){
            if(fruita == curr || fruitb == curr)
                count++;
            else
                count = lastFruitCount + 1;

            if(fruitb == curr)
                lastFruitCount++;
            else{
                fruita = fruitb;
                fruitb = curr;
                lastFruitCount = 1;
            }
            ans = Math.max(count,ans);
        }
        return ans;
    }
}
