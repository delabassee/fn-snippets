
package com.delabassee

import com.beust.klaxon.*

data class Country(
        @Json(name = "country")
        val name: String,
        val capital: String,
        val population: Int )


fun hello(input: String): String {

    val myCountries= listOf(
            Country("Belgium", "Brussels", 11_190_846 ),
            Country("Brazil", "Brasilia", 210_969_008),
            Country("Croatia", "Zargeb", 4_164_783),
            Country("France", "Paris", 65_233_271 ),
            Country("New Zealand", "Wellington", 4_749_598 ) )

    val result = myCountries.find(){it.name.toLowerCase() == input.toLowerCase()}

    if (result != null)
        return ( Klaxon().toJsonString(result))
    else
        return (
                json {
                    obj(
                            "status" to 404,
                            "msg" to "Country not found"
                    ).toJsonString(true)
                }
        )
}