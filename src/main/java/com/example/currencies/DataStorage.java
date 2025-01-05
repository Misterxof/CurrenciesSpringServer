package com.example.currencies;

import java.util.HashMap;

public class DataStorage {
    static Currency usd;

    static {
        HashMap<String, Double> usdRates = new HashMap();
        usdRates.put("GBP", 0.830034);
        usdRates.put("JPY", 157.161003);
        usdRates.put("BYN", 3.267245);
        usdRates.put("EUR", 0.970375);
        usd = new Currency("true", 1736111823L,"USD", "2025-01-05", usdRates);
    }

}
