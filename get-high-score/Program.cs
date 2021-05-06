using System;
using System.Collections.Generic;

namespace Almostengr.CodingChallenge.HighStudentScore
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Input a list of student scores ");
            string input = Console.ReadLine();
            string[] studentScores = input.Split(" ");
            List<int> studentScoresInt = new List<int>();

            for (int n = 0; n < studentScores.Length; n++)
            {
                try
                {
                    studentScoresInt.Add(Convert.ToInt32(studentScores[n]));
                }
                catch (Exception ex)
                {
                    Console.WriteLine("Exception occurred for {0}. {1}", studentScores[n], ex.Message);
                }
            }

            // print(student_scores)
            foreach (int score in studentScoresInt)
            {
                Console.WriteLine(score + " ");
            }

            // do not modify above here -- do not modify code above here

            int highestScore = 0;
            foreach (int score in studentScoresInt)
            {
                if (score > highestScore)
                {
                    highestScore = score;
                }
            }

            Console.WriteLine("The highest score is {0}", highestScore);
        }
    }
}
