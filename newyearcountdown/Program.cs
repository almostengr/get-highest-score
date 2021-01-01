using System;
using System.Threading;

namespace Almostengr.NewYearCountdown
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Starting countdown!");

            for (int i = 10; i > 0; i--)
            {
                Console.WriteLine(i);
                Thread.Sleep(TimeSpan.FromSeconds(1)); // Thread.Sleep(1000);
            }

            Console.WriteLine("Happy New Year {0}", DateTime.Now.Year);
        }
    }
}
