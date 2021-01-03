using System;
using System.Collections.Generic;

namespace Almostengr.Hangman
{
    class Program
    {
        static int remainingAttempts = 7;

        static void Main(string[] args)
        {
            Console.WriteLine("Welcome to Hangman!");

            string[] wordList = { "aardvark", "baboon", "camel", "dog", "elephant", "ferret", "giraffe" };

            // todo 1
            // randomly choose a word from the word list and assign it to a variable called chosenWord

            Random random = new Random();
            int wordListInt = random.Next(0, wordList.Length-1);

            string chosenWord = wordList[wordListInt].ToLower();
            Console.WriteLine("The word has {0} characters", chosenWord.Length);

            List<string> alreadyGuessedLetters = new List<string>();
            string displayWord = "";

            while (remainingAttempts > 0 && displayWord != chosenWord)
            {
                Console.WriteLine("Remaining attempts: {0}", remainingAttempts);

                // todo 2
                // ask the user to guess a letter and assign their answer to a variable called
                // "guess". Make guess lowercase.

                Console.WriteLine("Enter a letter: ");
                char[] input = Console.ReadLine().ToCharArray();

                string guess = "";
                if (input.Length > 0)
                {
                    guess = input[0].ToString();
                    guess = guess.ToLower();
                }

                alreadyGuessedLetters.Add(guess);

                // todo 3
                // check if the letter the user guessed (guess) is one of the letters in the chosenWord

                displayWord = "";
                if (chosenWord.Contains(guess))
                {
                    Console.WriteLine("The letter {0} is contained in the word.", guess);

                    displayWord = ProcessDisplayWord(chosenWord, alreadyGuessedLetters, displayWord);
                }
                else
                {
                    Console.WriteLine("The letter {0} is NOT contained in the word.", guess);
                    displayWord = ProcessDisplayWord(chosenWord, alreadyGuessedLetters, displayWord);
                    remainingAttempts--;
                }

                Console.WriteLine(displayWord);
                Console.WriteLine();
            }

            ExitGame(chosenWord);
        }

        private static string ProcessDisplayWord(string chosenWord, List<string> alreadyGuessedLetters, string displayWord)
        {
            foreach (var letter in chosenWord)
            {
                if (alreadyGuessedLetters.Contains(letter.ToString()))
                {
                    displayWord += letter;
                }
                else
                {
                    displayWord += "*";
                }
            }

            return displayWord;
        }

        private static void ExitGame(string theWord)
        {
            if (remainingAttempts == 0)
            {
                Console.WriteLine("You have ran out of attempts. You lose!");
                Console.WriteLine("The word was: {0}", theWord);
            }
            else
            {
                Console.WriteLine("You have won the game!");
            }
        }
    }
}
