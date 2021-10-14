
public class DiamondPattern {

	public static void main(String[] args) {
		
		int num=5;
		int space=num-1;
		int star=1;
		
		for(int i=1;i<num*2;i++)
		{
			//space
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			// star
			for(int j=1;j<star*2;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<num)
			{
				space--;
				star++;
				
			}
			else
			{
				space++;
				star--;
			}
		}

	}

}
