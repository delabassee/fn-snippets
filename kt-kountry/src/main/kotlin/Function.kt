
package com.delabassee

fun country(input: String): List<Country> = when {
    input.isNullOrEmpty() -> (Country.getAll())
    else -> {
        val allCountries = Country.getAll()
        val filteredCountries = allCountries.filter { it.name.contains(input.trim(), true) }

        if (filteredCountries.isEmpty()) allCountries
        else filteredCountries
    }
}