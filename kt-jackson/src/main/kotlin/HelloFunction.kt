package com.delabassee

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
//import com.fasterxml.jackson.dataformat.xml.XmlMapper

data class Country(
        @JsonProperty ("country") val name: String,
        @JsonProperty ("capital") val cap: String,
        @JsonProperty("population") val pop: Int )


fun hello(input: String) : String
{

    val writer = jacksonObjectMapper().writerWithDefaultPrettyPrinter()

    val listOfCountries= listOf(
            Country("Belgium", "Brussels", 11_190_846 ),
            Country("Brazil", "Brasilia", 210_969_008),
            Country("Croatia", "Zargeb", 4_164_783),
            Country("France", "Paris", 65_233_271 ),
            Country("New Zealand", "Wellington", 4_749_598 ) )

    //val strObject = xmlMapper.writeValueAsString(sortedList)

    return writer.writeValueAsString(listOfCountries.sortedWith(compareBy(Country::pop)))

}

