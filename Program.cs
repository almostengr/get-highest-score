using System;

namespace Almostengr.higheststudentscore
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Input a list of student scores:");
            string studentScoresInput = Console.ReadLine();

            string[] studentScores = studentScoresInput.Split(" ");

            double highestScore = 0;
            foreach (var scoreString in studentScores)
            {
                double scoreInt = 0;

                try
                {
                    scoreInt = Convert.ToDouble(scoreString);

                    if (scoreInt > highestScore)
                    {
                        highestScore = scoreInt;
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
