using System;

namespace Almostenger.FizzBuzz
{
    class Program
    {
        static void Main(string[] args)
        {
            for (int i = 1; i <= 100; i++)
            {
                string output = "";

                if (i % 3 == 0)
                {
                    output = "Fizz";
                }

                if (i % 5 == 0)
                {
                    output += "Buzz";  // output = output + "Buzz";
                }

                if (output.Length == 0)
                {
                    output = i.ToString();
                }

                Console.WriteLine(output);
            }
        }
    }
}
