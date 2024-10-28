package com.vtiger.Utility;

import java.util.HashSet;

public class concate {

        public static void main(String[] args) {
            String str = "Bhumi";
            HashSet<String> combinations = new HashSet<>();
            generateCombinations("", str, combinations);

            // Print all combinations
            for (String combination : combinations) {
                System.out.println(combination);
            }
        }

        private static void generateCombinations(String prefix, String str, HashSet<String> combinations) {
            int n = str.length();
            if (!prefix.isEmpty()) {
                combinations.add(prefix);
            }
            for (int i = 0; i < n; i++) {
                generateCombinations(prefix + str.charAt(i), str.substring(i + 1), combinations);
            }
        }
    }
