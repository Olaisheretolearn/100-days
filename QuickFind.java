import java.util.Random;
import java.util.Arrays;

public class QuickFindUF{
    private int [] id;
    
    public int [] getId(){
        return id;
    }
    
    public void setId(int[] id){
        this.id = id;
    }
    
    
    public QuickFindUF(int N){
        this.id  = new int [N];
        for (int i=0;i < N ; i++){
            this.id[i] = new Random().nextInt(10)+1;
            // this.id = new int[]{0,1,2,3,4,5,6,7,8,9};
            //custom array instead of generating random arrays
        }
    }
    
    public int find (int index){
        return id[index];
    }
        
        public boolean connected(int p, int q){
            return id[p] == id[q];
        }
        
        public void union(int p , int q ){
            int pid = id[p];
            int qid = id[q];
            
            for(int i = 0; i< id.length ;i++){
                if (id[p]== pid){
                    id[p]= qid;
                }
            }
        }
         public static void main (String [] args ){
              QuickFindUF quickfind = new QuickFindUF(10);
             System.out.println("Values of array" + Arrays.toString(quickfind.getId()));
             System.out.println("Value at 4th Index is " + quickfind.find(4));
             System.out.println("Is 1 and 4 connected? "  +  quickfind.connected(1,4));
            System.out.println ("Processing union of indexes 5 and 6 .... Please wait");
            quickfind.union(5,6);
            System.out.println("Done");
            System.out.println("array values after the union : " + Arrays.toString(quickfind.getId()));
            }
    }
