#include <iostream>
using namespace std;

int main()
{
    const int MAX_GUESSES = 6;
    int numGuesses = 0;

    string word = "computer";
    int wordLength = word.length();

    cout << "Welcome to Hangman!" << endl;
    cout << "The word has " << wordLength << " letters." << endl;

    do {
        cout << "Guess a letter: ";
        char guess;
        cin >> guess;

        numGuesses++;
        cout << "You have " << MAX_GUESSES - numGuesses << " guesses left." << endl;
        // cout << "You have guessed this many time:" << numGuesses<< endl;

    }while (numGuesses < MAX_GUESSES);

    

return 0;
}