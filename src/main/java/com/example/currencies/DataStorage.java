package com.example.currencies;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class DataStorage {
    public static Currency getCurrency(String base, String symbols) {
        System.out.println("dasdasdasda");

        HashMap<String, Double> rates = new HashMap();
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("YYYY-MM-DD"));
        String[] symb = symbols.split(",");

        for (String symbol : symb) {
            Pair<String, Double> pair = getPairSymbolRateForBase(base, symbol);
            if (pair != null) rates.put(pair.getFirst(), pair.getSecond());
        }

        Currency currency = new Currency("true", 1736111823L, base, date, rates);
        System.out.println(currency.toString());
        return currency;
    }

    private static Pair<String, Double> getPairSymbolRateForBase(String base, String symbol) {
        switch (base) {
            case "USD" -> {
                switch (symbol) {
                    case "GBP" -> {
                        return new Pair("GBP", 0.830034);
                    }
                    case "JPY" -> {
                        return new Pair("JPY", 157.161003);
                    }
                    case "BYN" -> {
                        return new Pair("BYN", 3.267245);
                    }
                    case "EUR" -> {
                        return new Pair("EUR", 0.970375);
                    }
                }
            }
            case "EUR" -> {
                switch (symbol) {
                    case "GBP" -> {
                        return new Pair("GBP", 0.805145);
                    }
                    case "JPY" -> {
                        return new Pair("JPY", 161.987379);
                    }
                    case "BYN" -> {
                        return new Pair("BYN", 3.366854);
                    }
                    case "USD" -> {
                        return new Pair("USD", 1.030487);
                    }
                }
            }
            case "BYN" -> {
                switch (symbol) {
                    case "GBP" -> {
                        return new Pair("GBP", 0.246531);
                    }
                    case "JPY" -> {
                        return new Pair("JPY", 48.112393);
                    }
                    case "EUR" -> {
                        return new Pair("EUR", 0.297013);
                    }
                    case "USD" -> {
                        return new Pair("USD", 0.306068);
                    }
                }
            }
            case "GBP" -> {
                switch (symbol) {
                    case "BYN" -> {
                        return new Pair("BYN", 4.056284);
                    }
                    case "JPY" -> {
                        return new Pair("JPY", 195.157539);
                    }
                    case "EUR" -> {
                        return new Pair("EUR", 1.20477);
                    }
                    case "USD" -> {
                        return new Pair("USD", 1.2415);
                    }
                }
            }
            case "JPY" -> {
                switch (symbol) {
                    case "BYN" -> {
                        return new Pair("BYN", 0.020808);
                    }
                    case "GBP" -> {
                        return new Pair("GBP", 0.00513);
                    }
                    case "EUR" -> {
                        return new Pair("EUR", 0.00618);
                    }
                    case "USD" -> {
                        return new Pair("USD", 0.006369);
                    }
                }
            }
        }

        return null;
    }
}
