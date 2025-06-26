package Graph;

public class Matrix {
	static int[][] matrix;
	static int vertex;
	Matrix(int vertex)
	{
		Matrix.matrix = new int[vertex][vertex];
		Matrix.vertex = vertex;
		
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
	}
	public static void main(String[] args)
	{
		Matrix m = new Matrix(5);
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
	}
}
