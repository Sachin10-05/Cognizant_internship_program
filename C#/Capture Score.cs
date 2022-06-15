using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Score            //DO NOT CHANGE the name of namespace
{
    public class Program                //DO NOT CHANGE the name of class 'Program'
    {
        public static void Main(string[] args)   //DO NOT CHANGE 'Main' Signature
        {
            Dictionary<string,int> players=new Dictionary<string,int>();
            players.Add("Bill",0);
            players.Add("Tommy",0);
            players.Add("Daisy",0);
            string previous="";
            for(int n=0;n<6;n++)
            {
                Console.Write("Player Name : ");
                string player=Console.ReadLine();
                if(!string.IsNullOrEmpty(player) && player!=" "){
                    players[player]++;
                    if(player.Equals(previous))
                        players[player]++;
                    previous=player;
                }
            }
            foreach(KeyValuePair<string,int> kvp in players)
            {
                Console.WriteLine($"{kvp.Key} Score : {kvp.Value}");
            }
        }
    }
}
