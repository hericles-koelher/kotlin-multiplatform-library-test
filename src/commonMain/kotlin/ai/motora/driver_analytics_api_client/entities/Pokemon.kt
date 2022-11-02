package ai.motora.driver_analytics_api_client.entities

import kotlinx.serialization.Serializable

@Serializable
data class Pokemon(val id: Int, val name: String, val weight: Int)