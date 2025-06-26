package Graph;
import java.util.Queue;
import java.util.LinkedList;
public class BFS {
	static int[][] matrix;
	static int vertex;
	BFS(int vertex)
	{
		matrix = new int[vertex][vertex];
		BFS.vertex = vertex;
		
	}
	public static void addEdge(int src,int dest)
	{
		matrix[src][dest] = 1;
	}
	public static void display()
	{
		for(int i=0;i<vertex;i++)
		{
			for(int j=0;j<vertex;j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void bfs(int start)
	{
		boolean[] visited = new boolean[vertex];
		Queue<Integer> data = new LinkedList<>();
		visited[start] = true;
		data.offer(start);
		while(!data.isEmpty())
		{
			int current = data.poll();
			System.out.print(current + " ");
			for(int i=0;i<vertex;i++)
			{
				if(matrix[current][i] == 1 && !visited[i])
				{
					visited[i] = true;
					data.add(i);
				}
			}
		}
		
	}
	public static void main(String[] args)
	{
		BFS m = new BFS(5);
		addEdge(0,1);
		addEdge(0,2);
		addEdge(0,3);
		addEdge(0,4);
		addEdge(1,0);
		addEdge(1,3);
		addEdge(1,2);
		addEdge(2,0);
		addEdge(2,1);
		addEdge(4,3);
		addEdge(4,0);
		addEdge(3,1);
		addEdge(3,0);
		addEdge(3,4);
		addEdge(4,3);
		addEdge(4,0);
		display();
		System.out.println("BFS");
		bfs(1);
	}
}
