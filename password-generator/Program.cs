using System;

namespace Almostengr.PasswordGenerator
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Welcome to the Password Generator!");

            Console.WriteLine("How many letters would you like in your password?");
            int numOfLetters = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("How many symbols would you like?");
            int numOfSymbols = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("How many numbers would you like?");
            int numOfNumbers = Convert.ToInt32(Console.ReadLine());

            string generatedPassword = "";
            Random random = new Random();

            string allLetters = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
            string allSymbols = "~!@#$%^&*()_-+=}{?><.,";
            string allNumbers = "123456789";

            int countLetters = 0, countSymbols = 0, countNumbers = 0;

            while (countLetters < numOfLetters ||
                countSymbols < numOfSymbols ||
                countNumbers < numOfNumbers)
            {
                int charType = random.Next(1, 4);

                if (charType == 1 && countLetters < numOfLetters)
                {
                    AddCharToPassword(ref generatedPassword, random, allLetters);
                    countLetters++;
                }
                else if (charType == 2 && countSymbols < numOfSymbols)
                {
                    AddCharToPassword(ref generatedPassword, random, allSymbols);
                    countSymbols++;
                }
                else if (charType == 3 && countNumbers < numOfNumbers)
                {
                    AddCharToPassword(ref generatedPassword, random, allNumbers);
                    countNumbers++;
                }
                else
                {
                    // do nothing
                }
            }

            Console.WriteLine("Your password is: {0}", generatedPassword);
        }

        private static void AddCharToPassword(ref string generatedPassword, Random random, string inputString)
        {
            int subStringInt = random.Next(0, inputString.Length - 1);
            generatedPassword += inputString.Substring(subStringInt, 1);
        }
    }
}
