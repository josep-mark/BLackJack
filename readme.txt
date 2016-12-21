The black jack game in my program on the whole dealse to the user and the computer
It prints one of the dealers cards and all of the players cards.
It then asks the user to hit.
To hit the user must write "hit"
After the user is edone hitting or has busted the computer plays
Then it evaluates the two scores and declares a winner

Card class
The card class creates a card with a rank and a suit. Both are represented by integers.
1 through 13 1 being Ace and 11 as a jack, 12 as a queen, and 13 as a King
The card class has getter and setter methods as well as methods to print the cards as strings
This is to print to the console during the game.

Deck class
The deck class creates a deck
It creates an ArrayList of Cards then creates a card of each rank for each suit using a nested for loop.
The deck class can also deal using the decks size it picks a random card from the deck to give to the player

Hand class
The Hand class cretes a hand
A  hand is an ArrayList of cards dealt  from the deck. The constructor takes in a deck to be dealt from
The hand class also has two score counts
The first score count counts Aces as 11
The second score count counts aces as 1
In my program the scoreCount() method is used first and after the player or computers score busts it starts countiing Aces as one
The class also has getters, setters and printing methods

player deal class
The player class creates a hand for the player and sets up the players game
It has a start method which deals two cards to the hand and prints those cards to the console
It has a hit method which asks the user to hit and takes the input, should the user wish to hit it deals them a new card and asks them to hit
In the program Aces are counted as 11 first, if the player wants to treat aces as one he can keep hitting and the program will adjust

computer deal class
The computer creates a computer hand and provides the algorithm for the computer
The computer gets two cards and while its score is less than 17 it hits

Game class
The game class takes a player and computer and runs both of those games
After the player and computer have finishedd it takes their final score and evaluates them.
It then declares a winner.

In my initial design I did not have the hand class
As I wrote my program, specifically the player deal class and computer deal class I found that I was repeating code
After talking with Swap I decided to create a hand class so that I didnt repeat myself needlessly.