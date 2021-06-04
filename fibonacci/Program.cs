using System;

namespace Almostengr.CodingChallenge.Fibonacci
{
    class Program
    {
        static void Main(string[] args)
        {
            Int64 twoNumbersAgo = 0;
            Int64 oneNumberAgo = 1;
            Int64 currentNumber = 0;

            Console.WriteLine("How many Fibonacci sequence iterations would you like?");
            int iterations = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine();

            Console.WriteLine("{0} + {1} = {2}", 0, 0, 0);

            for (int i = 0; i < iterations-1; i++)
            {
                currentNumber = oneNumberAgo + twoNumbersAgo;

                Console.WriteLine("{0} + {1} = {2}", twoNumbersAgo, oneNumberAgo, currentNumber);

                twoNumbersAgo = oneNumberAgo;
                oneNumberAgo = currentNumber;
            }
        }
    }
}
