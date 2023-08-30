package com.jaden.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

typealias CatBreedEntities = List<CatBreedEntity>

@Entity("cat_breeds")
data class CatBreedEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: String,

    @ColumnInfo(name = "adaptability")
    val adaptability: Int,

    @ColumnInfo(name = "affection_level")
    val affectionLevel: Int,

    @ColumnInfo(name = "alt_names")
    val altNames: String,

    @ColumnInfo(name = "bidability")
    val bidAbility: Int,

    @ColumnInfo(name = "cat_friendly")
    val catFriendly: Int,

    @ColumnInfo(name = "cfa_url")
    val cfaUrl: String,

    @ColumnInfo(name = "child_friendly")
    val childFriendly: Int,

    @ColumnInfo(name = "country_code")
    val countryCode: String,

    @ColumnInfo(name = "country_codes")
    val countryCodes: String,

    @ColumnInfo(name = "description")
    val description: String,

    @ColumnInfo(name = "dog_friendly")
    val dogFriendly: Int,

    @ColumnInfo(name = "energy_level")
    val energyLevel: Int,

    @ColumnInfo(name = "experimental")
    val experimental: Int,

    @ColumnInfo(name = "grooming")
    val grooming: Int,

    @ColumnInfo(name = "hairless")
    val hairless: Int,

    @ColumnInfo(name = "health_issues")
    val healthIssues: Int,

    @ColumnInfo(name = "hypoallergenic")
    val hypoallergenic: Int,

    @ColumnInfo(name = "indoor")
    val indoor: Int,

    @ColumnInfo(name = "intelligence")
    val intelligence: Int,

    @ColumnInfo(name = "lap")
    val lap: Int,

    @ColumnInfo(name = "life_span")
    val lifeSpan: String,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "natural")
    val natural: Int,

    @ColumnInfo(name = "origin")
    val origin: String,

    @ColumnInfo(name = "rare")
    val rare: Int,

    @ColumnInfo(name = "reference_image_id")
    val referenceImageId: String,

    @ColumnInfo(name = "rex")
    val rex: Int,

    @ColumnInfo(name = "shedding_level")
    val sheddingLevel: Int,

    @ColumnInfo(name = "short_legs")
    val shortLegs: Int,

    @ColumnInfo(name = "social_needs")
    val socialNeeds: Int,

    @ColumnInfo(name = "stranger_friendly")
    val strangerFriendly: Int,

    @ColumnInfo(name = "suppressed_tail")
    val suppressedTail: Int,

    @ColumnInfo(name = "temperament")
    val temperament: String,

    @ColumnInfo(name = "vcahospitals_url")
    val vcaHospitalsUrl: String,

    @ColumnInfo(name = "vetstreet_url")
    val vetStreetUrl: String,

    @ColumnInfo(name = "vocalisation")
    val vocalisation: Int,

    @ColumnInfo(name = "wikipedia_url")
    val wikipediaUrl: String

)
