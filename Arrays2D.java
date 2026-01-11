public class Arrays2D
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of floors");
		int f=scan.nextInt();
		System.out.println("enter the number of houses");
		int h=scan.nextInt();
		int[][] ar=new int[f][h];
		for(int i=0;i<f;i++)
		{
			for(int j=0;j<h;j++)
			{
				System.out.println("enter the"+(i+1)+" th floor"+j+" th house number");
				ar[i][j]=scan.nextInt();
			}
			System.out.println();
		}
			System.out.println("enter the number of floors and number of house numbers are ");
			for(int i=0;i<f;i++)
			{
				for(int j=0;j<h;j++)
				{
					System.out.print(ar[i][j]+ " ");
				}
			}
				System.out.println();
		}		
	}
