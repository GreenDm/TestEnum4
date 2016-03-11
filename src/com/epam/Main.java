package com.epam;

import java.util.Random;

/**
 * Created by Hrinchenko on 12.03.2016.
 */
public class Main {

    public static void main(String[] args) {

Card[]arr = new Card[52];
        Random rand = new Random();

        for(int i = 0; i< arr.length; i++) {
            int b = rand.nextInt(Rank.values().length);
            int c = rand.nextInt(Suit.values().length);

            arr[i] = new Card(Rank.values()[b],Suit.values()[c]);
            System.out.println(arr[i]);
        }
        }




    }

