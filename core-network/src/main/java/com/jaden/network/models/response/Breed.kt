package com.jaden.network.models.response

import com.squareup.moshi.Json

typealias Breeds = List<Breed>

data class Breed(
    @Json(name = "adaptability")
    val adaptability: Int,

    @Json(name = "affection_level")
    val affectionLevel: Int,

    @Json(name = "alt_names")
    val altNames: String,

    @Json(name = "cfa_url")
    val cfaUrl: String,

    @Json(name = "child_friendly")
    val childFriendly: Int,

    @Json(name = "country_code")
    val countryCode: String,

    @Json(name = "country_codes")
    val countryCodes: String,

    @Json(name = "description")
    val description: String,

    @Json(name = "dog_friendly")
    val dogFriendly: Int,

    @Json(name = "energy_level")
    val energyLevel: Int,

    @Json(name = "experimental")
    val experimental: Int,

    @Json(name = "grooming")
    val grooming: Int,

    @Json(name = "hairless")
    val hairless: Int,

    @Json(name = "health_issues")
    val healthIssues: Int,

    @Json(name = "hypoallergenic")
    val hypoallergenic: Int,

    @Json(name = "id")
    val id: String,

    @Json(name = "indoor")
    val indoor: Int,

    @Json(name = "intelligence")
    val intelligence: Int,

    @Json(name = "lap")
    val lap: Int,

    @Json(name = "life_span")
    val lifeSpan: String,

    @Json(name = "name")
    val name: String,

    @Json(name = "natural")
    val natural: Int,

    @Json(name = "origin")
    val origin: String,

    @Json(name = "rare")
    val rare: Int,

    @Json(name = "reference_image_id")
    val referenceImageId: String,

    @Json(name = "rex")
    val rex: Int,

    @Json(name = "shedding_level")
    val sheddingLevel: Int,

    @Json(name = "short_legs")
    val shortLegs: Int,

    @Json(name = "social_needs")
    val socialNeeds: Int,

    @Json(name = "stranger_friendly")
    val strangerFriendly: Int,

    @Json(name = "suppressed_tail")
    val suppressedTail: Int,

    @Json(name = "temperament")
    val temperament: String,

    @Json(name = "vcahospitals_url")
    val vCaHospitalsUrl: String,

    @Json(name = "vetstreet_url")
    val vetStreetUrl: String,

    @Json(name = "vocalisation")
    val vocalisation: Int,

    @Json(name = "weight")
    val weight: Weight,

    @Json(name = "wikipedia_url")
    val wikipediaUrl: String

)