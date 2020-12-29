using System;

namespace Almostengr.higheststudentscore
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Input a list of student scores:");
            string input = Console.ReadLine();

            string[] studentScores = input.Split(" ");

            double highestScore = 0;
            foreach (var scoreString in studentScores)
            {
                try
                {
                    double score = Convert.ToDouble(scoreString);

                    if (score > highestScore)
                    {
                        highestScore = score;
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine("Exception: {0}; value: {1}", ex.Message, scoreString);
                }
            }

            Console.WriteLine("The highest score is {0}", highestScore);
        }
    }
}
