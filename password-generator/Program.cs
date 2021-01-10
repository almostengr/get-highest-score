using System;

namespace Almostengr.PasswordGenerator
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Welcome to the Password Generator!");

            Random random = new Random();

            int numOfLetters = 0;
            int numOfSymbols = 0;
            int numOfNumbers = 0;
            int passwordGenCount = 1;

            bool doHelp = false;
            bool randomLengths = false;

            for (int i = 0; i < args.Length; i++)
            {
                switch (args[i])
                {
                    case "--randomlength":
                    case "-r":
                        randomLengths = true;
                        break;

                    case "--count":
                    case "-c":
                        try
                        {
                            passwordGenCount = Convert.ToInt32(args[i + 1]);
                        }
                        catch (FormatException ex)
                        {
                            Console.WriteLine("Invalid input. {0}", ex.Message);
                            passwordGenCount = 1;
                        }
                        catch (OverflowException ex)
                        {
                            Console.WriteLine("Number is too large. {0}", ex.Message);
                            passwordGenCount = 1;
                        }
                        catch (IndexOutOfRangeException)
                        {
                            passwordGenCount = 1;
                        }
                        break;

                    case "--help":
                    case "-h":
                        PrintHelp();
                        doHelp = true;
                        break;

                    default:
                        break;
                }
            }

            if (doHelp == false)   // if (!doHelp)
            {
                for (int i = 0; i < passwordGenCount; i++)
                {
                    if (randomLengths)
                    {
                        GetRandomLengths(random, out numOfLetters, out numOfSymbols, out numOfNumbers);
                    }

                    GeneratePassword(random, numOfLetters, numOfSymbols, numOfNumbers);
                }
            }
        }

        private static void GetRandomLengths(Random random, out int numOfLetters, out int numOfSymbols, out int numOfNumbers)
        {
            numOfLetters = random.Next(4, 8);
            numOfSymbols = random.Next(2, 4);
            numOfNumbers = random.Next(2, 4);
        }

        private static void GeneratePassword(Random random, int numOfLetters, int numOfSymbols, int numOfNumbers)
        {
            if (numOfLetters == 0)
            {
                numOfLetters = ProcessInput("How many letters would you like in your password?");
                numOfSymbols = ProcessInput("How many symbols would you like?");
                numOfNumbers = ProcessInput("How many numbers would you like?");
            }

            string generatedPassword = "";

            string allLetters = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
            string allSymbols = "~!@#$%^&*()_-+=}{?><.,";
            string allNumbers = "123456789";

            int countLetters = 0, countSymbols = 0, countNumbers = 0;

            while (countLetters < numOfLetters || countSymbols < numOfSymbols || countNumbers < numOfNumbers)
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

        private static void PrintHelp()
        {
            string newLine = "\r\n";
            string helpOutput = "Usage: password-generator [arguments]" + newLine +
                "" + newLine +
                "Generate a password" + newLine +
                "" + newLine +
                "-h | --help           Displays this screen" + newLine +
                "-r | --randomlength   Generates password(s) of random length" + newLine +
                "-c | --count <n>      Generates specified <n> of passwords";
            Console.WriteLine(helpOutput);
        }

        private static int ProcessInput(string inputMessage)
        {
            int returnInt;

            while (true)
            {
                try
                {
                    Console.WriteLine(inputMessage);
                    returnInt = Convert.ToInt32(Console.ReadLine());
                    break;
                }
                catch (FormatException ex)
                {
                    Console.WriteLine("Invalid input. {0}", ex.Message);
                }
                catch (OverflowException ex)
                {
                    Console.WriteLine("Number is too large. {0}", ex.Message);
                }
            }

            return returnInt;
        }

        private static void AddCharToPassword(ref string generatedPassword, Random random, string inputString)
        {
            int subStringInt = random.Next(0, inputString.Length - 1);
            generatedPassword += inputString.Substring(subStringInt, 1);
        }
    }
}
