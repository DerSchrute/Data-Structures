
public class ArrayList {    
    private static int initialSize = 5;
    private static int multiplier = 2;
    private int currIndex;
    private int currBucketSize;
    private String[] bucket;

    // Constructor
    public ArrayList() {
        this.bucket = new String[initialSize];
        this.currBucketSize = initialSize;
        this.currIndex = 0;
    }
    public void add(String item) {
        // if no space left, resize the bucket
        if(this.currIndex > this.currBucketSize - 1) {
            
            // if the current index is at the end of the bucket, resize the bucket
            this.resize(this.currBucketSize * multiplier); // double the size
        }
        this.bucket[this.currIndex] = item;
        this.currIndex++; // this.currIndex = this.currIndex + 1
    }

    public void resize(int newLength){
       
        
        // create new empty array such that larger than previous
        String[] newBucket = new String[newLength];
        
        // copy items
        for (int i = 0; i < this.bucket.length; i++) {
            newBucket[i] = this.bucket[i]; //transfer items from existing to new 
        }
        // update the new Bucket Size
        this.currBucketSize = newLength;
        // point the new bucket as the main bucket
        this.bucket = newBucket; 
    
    }
    // for printing
    public String getStringItems(){
        String buildString = "";
        for (int i = 0; i < this.currIndex; i++) {
            // Index[0] : item1
            buildString += "Index [" + i + "]: " + this.bucket[i] + "\n";
            if (i < this.currIndex - 1) {
            }
        }
        return buildString;

    }

} 
