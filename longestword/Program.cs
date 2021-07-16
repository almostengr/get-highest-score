using System;

namespace Almostengr.CodingChallenge.LongestWord
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter a string:");
            string inputText = Console.ReadLine(); // read a line of text from the console
            Console.WriteLine("The longest word is: " + LongestWord(inputText));
        }

        static string LongestWord(string sen)
        {
            string[] senArray = sen.Split(" "); // split the string into an array of words

            string longestWord = string.Empty;

            foreach (string word in senArray) // iterate through the array of words
            {
                if (word.Length > longestWord.Length) // check if the word is longer than the longest word
                {
                    longestWord = word; // if so, set the longest word to the current word
                }
            }

            sen = longestWord;

            return sen; // return the longest word
        }
    }
}
