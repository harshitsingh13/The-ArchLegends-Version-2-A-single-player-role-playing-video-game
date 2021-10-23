# The-head-of-ArchFable-a-single-player-role-playing-video-game
The head of ArchFable, a single-player role-playing video game to which we design a prototype for their new title, ArchLegends. The game is set in a time where a demon named Lionfang and his lieutenants have taken over the kingdom of Thunderforge. The purpose of the game is to allow the user to start as a hero and then defeat Lionfang.
1) Each invocation of the game will be considered as a new game. After starting the game
you have to first provide your username (no password required) to create a new hero
(hero described in point-2 below). Then you can log into the game as this hero by typing
in the username. Note that there is no file handling in this assignment. Hence, no need
to create a database of users or saving their game. During a game the player has the
option to exit his current game.Then he can start a new game with a different username
(without rebooting the game executable) and hence a new hero. He also has the option
to switch between two heros. Note that all these functionalities are within a single launch
of the Java executable. Also, there is no need to provide save game feature for users.
Choosing the same user next time simply automatically assigns him the hero from his
previous game.
2) A new user has to first choose his hero avatar. This username must play this game as
this particular hero only. There are four different types of heroes to choose from: Warrior,
Mage, Thief, and Healer. All these heroes have an XP and a HP attribute. XP is used to
level up (see point 4 below) and HP is an indicator of the health of the hero, and they
default to 0 and 100 respectively at the start of the game.
3) The hero starts a new game at level 1. A level is decided based on the hero’s HP and
XP. He can move to a different level (i.e., “level up”) by gaining enough XP as described
below.
a) For level 1: The Hero has 100 HP. The hero needs 20 XP to go to level 2.
b) For level 2: The hero has 150 HP. The hero needs 40 XP to go to level 3.
c) For level 3: The hero has 200 HP. The hero needs 60 XP to go to level 4.
d) For level 4: The hero has 250 HP.
4) A new game is always started from the initial location in the Game Layout