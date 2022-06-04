//*****************************************************************************JaggedArrays.cs****************************************************************************

using System;


namespace JaggedArray     
{
    public class Program    
    {
        public static void Main(string[] args)   
        {
	        //Implement code here
	        // Get input from the user and construct a jagged array 
	        
	        int NoOfTeams, NoOfAttempts, Score;
			int i, j;

			Console.WriteLine("Enter the number of teams:");
			NoOfTeams = Convert.ToInt32(Console.ReadLine());
			int[][] array = new int[NoOfTeams][];                       //Declaration of Jagged Array


			for (i = 0; i < NoOfTeams; i++)
			{
				Console.WriteLine("No.of attempts for team {0}:", i + 1);
				NoOfAttempts = Convert.ToInt32(Console.ReadLine());
				array[i] = new int[NoOfAttempts];

                Console.WriteLine("Enter the score for team {0}", i + 1);
                for (j = 0; j < NoOfAttempts; j++)
				{
					Score = Convert.ToInt32(Console.ReadLine());
					array[i][j] = Score;
				}
			}
			string a = GetTotalScore(array);
            string[] p = a.Split(' ');
            for(int n=0;n<NoOfTeams;n++)
            {
                Console.Write("Team " + (n + 1) + " Total Score is " + p[n] + ". ");
            }
        }
        
        
        
        
        
        
        public static string GetTotalScore(int[][] array)       
        {
            //Implement code here 
            //Method to calculate total score for each team and return a string as specified in the sample output.
            int size = array.Length;
            string z = "";
            
            for (int k = 0; k < size; k++)
            {
                int res = 0;
                for (int m = 0; m < array[k].Length; m++)
                {
                    res += array[k][m];
                }

                z += res + " ";
            }
            return z;
            
        }

    }
}

