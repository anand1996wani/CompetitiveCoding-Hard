/*

The Parking Slot

There is a parking facility which is in the form of a graph having N nodes and M edges. The graph does not have self loops or multiple edges.
Each node represents a parking slot and has a capacity of vehicles it can hold. Each edge (u,v) has a weight w representing we can reach from node u to node v incurring a cost of w units. All parking slots have a parking fee F per vehicle which is same for all slots. There are K identical vehicles entering the parking facility, each vehicle enumerated with a distinct number from 1 to K. The vehicles enter in their natural order, that is, vehicle number 1 enters, then vehicle number 2, then 3 and so on till vehicle number K.
For each vehicle, you have to print the minimum total cost that is incurred on the vehicle owner. Here, total cost includes cost of the path taken to reach the parking slot and parking fee of the slot.
It is guaranteed that you can reach any slot from any other slot.
All vehicles entering the parking facility enter from the parking slot 1.

Input Format:

The first line consists of three integers N, M and F, denoting number of nodes, number of edges and parking fee respectively.
The second line consists of N space separated integers denoting the parking capacity of each parking slot. This array is represented by C[].
Following M lines contain three space separated integers each: u,v and w, denoting we can reach from node u to node v incurring a cost of w units.
The last line of input contains an integer K.

Output Format:

Print K space separated integers denoting answer for each vehicle.Ith  integer in the space separated integers denotes ith answer for  vehicle number.
If it is not possible to park a vehicle , print -1 for that vehicle.

*/
import java.util.*;
class Dijkstra’s shortest path algorithm {
    public static int minDistance(long distance[], Boolean visited[],int n)
    {
        // Initialize min value
        long min = Integer.MAX_VALUE; 
        int minIndex=-1;
 
        for (int v = 0; v < n; v++){
            if (visited[v] == false && distance[v] <= min)
            {
                min = distance[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int f = scanner.nextInt();
        long c[] = new long[n];
        long[][] array = new long[n][n];
        for(int i = 0;i<n;i++){
            c[i] = scanner.nextInt();
        }
        for(int i = 0;i<m;i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int d = scanner.nextInt();
            array[x-1][y-1] = d;
            array[y-1][x-1] = d;
        }
        int k = scanner.nextInt();
        long dist[] = new long[n];
        Boolean visited[] = new Boolean[n];
        for (int i = 0; i < n; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        int src = 0;
        dist[src] = 0;
        for (int count = 0; count < n-1; count++){
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. u is always equal to src in first
            // iteration.
            int u = minDistance(dist,visited,n);
 
            // Mark the picked vertex as processed
            visited[u] = true;
 
            // Update dist value of the adjacent vertices of the
            // picked vertex.
            for (int v = 0; v < n; v++){
                // Update dist[v] only if is not in sptSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                if (!visited[v] && array[u][v]!=0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u]+array[u][v] < dist[v])
                    dist[v] = dist[u] + array[u][v];
            }
        }
        for(int i = 0;i<k;i++){
            long ma = Integer.MAX_VALUE;
            int slot = -1;
            for(int j = 0;j<n;j++){
                if(dist[j] < ma){
                    ma = dist[j];
                    slot = j;
                }
            }
            if(slot != -1){
                c[slot]--;
                if(c[slot]==0){
                    dist[slot] = Integer.MAX_VALUE;
                }
                System.out.print(ma + f);
                System.out.print(" ");
            }
            else{
                System.out.print("-1");
            }
        }
    }
}
