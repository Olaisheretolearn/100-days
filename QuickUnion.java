import java.util.Arrays;
public class QuickUnion{
    private int[] id ;
    
    public int[] getId(){
        return id;
    }
    
    public void setId(int [] id){
        this.id = id;
    }
    
    
    public QuickUnion(int N){
        this.id = new int[N];
        for (int i=0; i < N ; i++) {
            this.id = new int[]{0,1,2,3,4,5,6,7,8,9};
        }
    }
        
        private int root(int i){
            while (i != id[i]){
                i = id[i];
              
            }
            return i;
        }
            
            public boolean connected (int p , int q){
                return root(p) == root(q);
            }
            
            public void union(int p, int q){
                int i = root(p);
                int j = root(q);
                id[i] = j;
            }
            
           public static void main (String[] args) {
               // Can enter size of array using N = scnr.nextInt();
               // and manually enter array in the constructor
                QuickUnion quickunion = new QuickUnion(10);
               
                System.out.println("The values in the array " + Arrays.toString(quickunion.getId()));
                 System.out.println("Union 4, 3");
                 quickunion.union(4,3);
                 System.out.println("is 4 and 3 connected? " +quickunion.connected(4,3) );
                  System.out.println("The values in the array " + Arrays.toString(quickunion.getId()));
                  System.out.println("Union 3, 8");
                 quickunion.union(3,8);
                 System.out.println("is 3 and 8 connected ? " +quickunion.connected(3,8) );
                  System.out.println("The values in the array " + Arrays.toString(quickunion.getId()));
                  System.out.println("Union 3, 8");
                 quickunion.union(6,5);
                 System.out.println("is 6 and 5 connected ? " +quickunion.connected(6,5) );
                  System.out.println("The values in the array " + Arrays.toString(quickunion.getId()));
                quickunion.union(9,4);
                 System.out.println("is 9 and 4 connected ? " +quickunion.connected(9,4) );
                  System.out.println("The values in the array " + Arrays.toString(quickunion.getId()));
                   quickunion.union(2,1);
                 System.out.println("is 2 and 1 connected ? " +quickunion.connected(2,1) );
                  System.out.println("The values in the array " + Arrays.toString(quickunion.getId()));
            }
        }
        
