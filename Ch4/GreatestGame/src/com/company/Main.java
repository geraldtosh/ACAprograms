package com.company;

public class Main

{
    public static void main(String[] args)
    {

        final int STARTING_POSITION = 0;
        final int WINNING_POSITION = 12;
        final int SIDES_OF_DIE = 6;

        java.util.Random random = new java.util.Random();

        int playerOnePosition = STARTING_POSITION;

        int playerTwoPosition = STARTING_POSITION;

        boolean playerOneTurn = true;

        do

        {
            int die1Roll = random.nextInt(SIDES_OF_DIE) + 1;

            int die2Roll = random.nextInt(SIDES_OF_DIE) + 1;

            int dieTotal = die1Roll + die2Roll;


            if (playerOneTurn)
            {
                int rollNeeded;

                if (playerOnePosition == 0)
                {
                    rollNeeded = 5;
                }

                else

                {
                    rollNeeded = playerOnePosition + 1;
                }

                System.out.println("D1:" + die1Roll + "   D2:" + die2Roll + "   DT:" + dieTotal + "  N:" + rollNeeded);

                boolean moveForward = (die1Roll == rollNeeded || die2Roll == rollNeeded || dieTotal == rollNeeded);

                if (moveForward)

                {
                    playerOnePosition = playerOnePosition + 1;

                    if (playerOnePosition == playerTwoPosition)

                    {
                        playerTwoPosition = STARTING_POSITION;
                    }
                }
            }

            else

            {
                int rollNeeded;

                if (playerTwoPosition == 0)

                {
                    rollNeeded = 5;
                }

                else

                {
                    rollNeeded = playerTwoPosition + 1;
                }

                System.out.println("D1:" + die1Roll + "   D2:" + die2Roll + "   DT:" + dieTotal + "  N:" + rollNeeded);

                boolean moveForward = (die1Roll == rollNeeded || die2Roll == rollNeeded || dieTotal == rollNeeded);

                if (moveForward)

                {
                    playerTwoPosition = playerTwoPosition + 1;

                    if (playerTwoPosition == playerOnePosition)

                    {
                        playerOnePosition = STARTING_POSITION;
                    }
                }
            }

            System.out.println("Player One at position: " + playerOnePosition);

            System.out.println("Player Two at position: " + playerTwoPosition);

            playerOneTurn = !playerOneTurn;

        }

        while (playerOnePosition < WINNING_POSITION && playerTwoPosition < WINNING_POSITION);

        if (playerOnePosition == WINNING_POSITION)

        {
            System.out.println("Player One Wins!");
        }

        else

        {
            System.out.println("Player Two Wins!");
        }
    }
}

