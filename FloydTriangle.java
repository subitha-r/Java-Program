import java.io.*;

public class FloydTriangle 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int rows,j,i,number=1;
        System.out.println("Enter the number of rows");
        rows=Integer.parseInt(br.readLine());

        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        
    }
}
