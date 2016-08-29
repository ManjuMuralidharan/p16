package p16_nonrepeater_number;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class p16_nonrepeater_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,1,2,16,16,29,13,13};
		int[] b=new int[a.length];
		int[] c=new int[a.length];
		int v=0;
		int p=0;
		int cnt=0;
		
		for(int i=0;i<a.length;i++)
		{
			cnt=0;
			for(int j=0;j<a.length;j++)
			{
				if(i!=j)
				{
					if(a[i]==a[j])
					{
						cnt++;
					}
				}
			}
			if(cnt==0)
			{
				System.out.println(a[i]);
			}
		}
		

}
}
