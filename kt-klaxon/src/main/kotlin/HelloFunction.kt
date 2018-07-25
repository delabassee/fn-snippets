
package com.delabassee

import com.beust.klaxon.*


fun hello(input: String): String {

    val countries = json {
        obj(
                "countries" to
                        array(
                                obj(
                                        "country" to "Belgium",
                                        "capital" to "Brussels",
                                        "population" to 11_190_846
                                ),
                                obj(
                                        "country" to "France",
                                        "capital" to "Paris",
                                        "population" to 4_164_783
                                ),
                                obj(
                                        "country" to "Croatia",
                                        "capital" to "Zagreb",
                                        "population" to 4_164_783
                                )
                        )
        )
    }
    
    return(countries.toJsonString(true))

}