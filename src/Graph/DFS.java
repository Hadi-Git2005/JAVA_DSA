package Graph;
import java.util.Queue;
import java.util.LinkedList;
public class DFS {
	static int[][] matrix;
	static int vertex;
	DFS(int vertex)
	{
		matrix = new int[vertex][vertex];
		DFS.vertex = vertex;
		
	}
	public static void addEdge(int src,int dest)
	{
		matrix[src][dest] = 1;
		matrix[dest][src] = 1;
	}
	public static void display()
	{
		System.out.println("Adjacency Matrix");
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
	public static void dfslogic(int start,boolean[] visited)
	{
		visited[start] = true;
		System.out.print(start + " ");
		for(int i=0;i<vertex;i++)
		{
			if(matrix[start][i] == 1 && !visited[i])
			{
				dfslogic(i,visited);
			}
		}
	}
	public static void dfs(int start)
	{
		boolean[] visited = new boolean[vertex];
		dfslogic(start,visited);
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
		DFS m = new DFS(6);
		addEdge(0,1);
		addEdge(1,2);
		addEdge(1,3);
		addEdge(2,4);
		addEdge(3,4);
		addEdge(4,5);
		display();
		System.out.println("BFS");
		bfs(0);
		System.out.println();
		System.out.println("DFS");
		dfs(0);
	}
}
