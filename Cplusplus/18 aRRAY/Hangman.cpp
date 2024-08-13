#include <iostream>
using namespace std;

int main()
{
    const int MAX_GUESSES = 6;
    const string WORDS[] = {"computer", "programming", "Algorithm", "Binary", "Variable", "Loop"};
    const int NUM_WORDS = 6;
    int numGuesses = 0;

    string word = WORDS[rand() % NUM_WORDS];       // Selected word : Loop
    int wordLength = word.length();
    string hiddenWord(wordLength, '_');
    cout << hiddenWord;


    cout << "Welcome to Hangman!" << endl;
    cout << "The word has " << wordLength << " letters." << endl;

    do {
        cout << "Guess a letter: ";
        char guess;
        cin >> guess;


        bool found = false;

        for (int i = 0; i < wordLength; i++) {
            if (word[i] == guess) {
                hiddenWord[i] = guess;
                found = true;
                cout << "this is match" << endl;
            }
        }

        if (!found){
                numGuesses++;   
                cout << "INCORRECT, " ;
        }


        cout << "You have " << MAX_GUESSES - numGuesses << " guesses left." << endl;
        // cout << "You have guessed this many time:" << numGuesses<< endl;

        cout << "The word : " <<   hiddenWord << endl;
    }while (numGuesses < MAX_GUESSES && hiddenWord != word);

    if (hiddenWord == word) {
        cout << "Congratulations, you won!" << endl;
    } else {
        cout << "Sorry, you lost. The word was " << word << "." << endl;
    }

return 0;
}