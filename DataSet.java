package WPO1;

public class DataSet{
    private double[] numSet;

    public DataSet(double[] set){
        this.numSet = set;
    }


    public void add(double value){
        double[] newNumSet = new double[numSet.length+1];
        for (int i = 0; i < numSet.length; i++){
            newNumSet[i] = numSet[i];
        }
        newNumSet[newNumSet.length-1] = value;
        numSet = newNumSet;
    }


    public double getAverage(){
        double averNum;
        double sum = 0;

        for(int i = 0; i < numSet.length; i++){
            sum += numSet[i];
        }

        averNum = sum / numSet.length;

        return averNum;

    }
    
    public double getSmallest(){
        double smallest=numSet[0];
        for(int i = 0; i < numSet.length; i++){
            if(numSet[i]<smallest){
                smallest = numSet[i];
            }
        }
        return smallest;
    }
    
    public double getLargest(){
        double largest=numSet[0];
        for(int i = 0; i < numSet.length; i++){
            if(numSet[i]>largest) { 
                largest = numSet[i];
            }
        }
        return largest;
    }
    
    public double getRange(){
        double largest = getLargest();
        double smallest = getSmallest();
        double range;
        range = largest - smallest;
        return range;
    }
    

}
