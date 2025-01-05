package com.example.currencies;

import java.util.HashMap;

record Currency(String success, Long timestamp,String base, String date, HashMap<String, Double> rates) {
}
