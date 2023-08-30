package com.jaden.data.mappers

import com.jaden.data.models.CatBreedModel
import com.jaden.data.models.CatBreedModels
import com.jaden.database.entities.CatBreedEntities
import com.jaden.database.entities.CatBreedEntity
import com.jaden.network.models.response.CatBreeds

private object CatBreedsMapper {

    fun asEntity(catBreeds: CatBreeds): CatBreedEntities =
        catBreeds.map {
            CatBreedEntity(
                id = it.id,
                adaptability = it.adaptability,
                affectionLevel = it.affection_level,
                altNames = it.alt_names,
                bidAbility = it.bidability,
                catFriendly = it.cat_friendly,
                cfaUrl = it.cfa_url,
                childFriendly = it.child_friendly,
                countryCode = it.country_code,
                countryCodes = it.country_codes,
                description = it.description,
                dogFriendly = it.dog_friendly,
                energyLevel = it.energy_level,
                experimental = it.experimental,
                grooming = it.grooming,
                hairless = it.hairless,
                healthIssues = it.health_issues,
                hypoallergenic = it.hypoallergenic,
                indoor = it.indoor,
                intelligence = it.intelligence,
                lap = it.lap,
                lifeSpan = it.life_span,
                name = it.name,
                natural = it.natural,
                origin = it.origin,
                rare = it.rare,
                referenceImageId = it.reference_image_id,
                rex = it.rex,
                sheddingLevel = it.shedding_level,
                shortLegs = it.short_legs,
                socialNeeds = it.social_needs,
                strangerFriendly = it.stranger_friendly,
                suppressedTail = it.suppressed_tail,
                temperament = it.temperament,
                vcaHospitalsUrl = it.vcahospitals_url,
                vetStreetUrl = it.vetstreet_url,
                vocalisation = it.vocalisation,
                wikipediaUrl = it.wikipedia_url,
            )
        }

    fun asModel(catBreedEntities: CatBreedEntities): CatBreedModels =
        catBreedEntities.map {
            CatBreedModel(
                id = it.id,
                description = it.description,
                dogFriendly = it.dogFriendly,
                energyLevel = it.energyLevel,
            )
        }
}

fun CatBreeds.asEntity(): CatBreedEntities =
    CatBreedsMapper.asEntity(this)

fun CatBreedEntities.asModel(): CatBreedModels =
    CatBreedsMapper.asModel(this)
